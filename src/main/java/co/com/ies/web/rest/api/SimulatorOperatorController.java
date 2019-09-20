package co.com.ies.web.rest.api;

import java.io.IOException;
import java.math.BigDecimal;
import java.time.ZonedDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import javax.validation.Valid;

import org.apache.tomcat.util.codec.binary.Base64;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import co.com.ies.service.dto.api.AuthenticateOperatorInDto;
import co.com.ies.service.dto.api.AuthenticateOperatorOutDto;
import co.com.ies.service.dto.api.DebitAndCreditCodeOperatorInDto;
import co.com.ies.service.dto.api.DebitAndCreditCodeOperatorOutDto;
import co.com.ies.service.dto.api.DebitAndCreditOperatorInDto;
import co.com.ies.service.dto.api.DebitAndCreditOperatorOutDto;
import co.com.ies.service.dto.api.GetBalanceOperatorInDto;
import co.com.ies.service.dto.api.GetBalanceOperatorOutDto;
import co.com.ies.service.dto.api.RollbackOperatorInDto;
import co.com.ies.service.dto.api.RollbackOperatorOutDto;
import co.com.ies.service.dto.sub.AuthDto;

@RestController
@RequestMapping("/simuladoroperador")
public class SimulatorOperatorController {
  private static final int ERROR_ID_102 = 102;
  private static final int ERROR_ID_29 = 29;
  private static final int ERROR_ID_109 = 109;
  private static final int ERROR_ID_21 = 21;
  private static final String VOID = "doesn't apply";
  private static final BigDecimal ZERO_BD = BigDecimal.ZERO;
  private static final Integer ZERO_I = 0;
  private static final String USER = "inWPLAYIesUser";
  private static final String PASS = "pass";
  private static final String PLAYER_ID = "playerId";
  private static final BigDecimal TOTAL_BALANCE = BigDecimal.valueOf(1000000);
  private static final String TOKEN = "123t2o2k2e2n123";
  private static final Integer HAS_ERROR_NOT = 0;
  private static final Integer HAS_ERROR = 1;
  private static final Integer ERROR_ID = 0;
  private static final Integer ERROR_ID_SOME = -1;
  private static final String ERROR_DESCRIPTION = VOID;
  private static final String ERROR_DESCRIPTION_SOME = "Bab credentials";
  private static final String ERROR_DESCRIPTION_102 = "Not registered";
  private static final String ERROR_DESCRIPTION_21 = "No tienes saldo suficiente";
  private static final String ERROR_DESCRIPTION_21_CODE = "El código ya fue redimido";
  private static final String ERROR_DESCRIPTION_29 = "Estás bloqueado";
  private static final String ERROR_DESCRIPTION_109 = "El código es erróneo";
  private static final String PLATFORM_TRANSACTION_ID = "wplay";
  private static final AuthDto auth = new AuthDto().setUser(USER).setPass(PASS);
  private Map<String, BigDecimal> totalBalances = new HashMap<>();
  private Map<String, BigDecimal> transactions = new HashMap<>();
  private Map<String, String> players = new HashMap<>();

  /**
   * .
   * 
   * @param operatorOut .
   * @return .
   */
  @PostMapping("/authenticate")
  @ResponseBody
  public AuthenticateOperatorInDto authenticate(@Valid @RequestBody AuthenticateOperatorOutDto operatorOut) {
    String token = operatorOut.getToken();
    if (!auth.equals(operatorOut.getAuth())) {
      return new AuthenticateOperatorInDto().setTotalBalance(ZERO_BD).setPlayerId(VOID).setToken(VOID)
          .setHasError(HAS_ERROR).setErrorId(ERROR_ID_SOME).setErrorDescription(ERROR_DESCRIPTION_SOME);
    }
    players.putIfAbsent(token, getPlayerDecodingJWT(token)); 
    return new AuthenticateOperatorInDto()
        .setTotalBalance(BigDecimal.TEN)
        .setPlayerId(players.get(token))
        .setToken(token).setHasError(HAS_ERROR_NOT).setErrorId(ERROR_ID)
        .setErrorDescription(ERROR_DESCRIPTION);
  }

  /**
   * .
   * 
   * @param operatorOut .
   * @return .
   */
  @PostMapping("/debitandcredit")
  @ResponseBody
  public DebitAndCreditOperatorInDto debitAndCredit(@Valid @RequestBody DebitAndCreditOperatorOutDto operatorOut) {
    String token = operatorOut.getToken();
    
    if (!auth.equals(operatorOut.getAuth())) {
      return debitAndCreditErrorStructureWithCodeAndMsg(ERROR_ID_SOME, ERROR_DESCRIPTION_SOME);
    }
    return new DebitAndCreditOperatorInDto()
        .setTotalBalance(BigDecimal.TEN)
        .setPlayerId(players.get(token))
        .setToken(token)
        .setHasError(HAS_ERROR_NOT)
        .setErrorId(ERROR_ID)
        .setErrorDescription(ERROR_DESCRIPTION)
        .setPlatformTransactionId(operatorOut.getIesTransactionId()+PLATFORM_TRANSACTION_ID);
  }
  
  /**
   * .
   * 
   * @param operatorOut .
   * @return .
   */
  @PostMapping("/debitandcreditcode")
  @ResponseBody
  public DebitAndCreditCodeOperatorInDto debitAndCreditCode(@Valid @RequestBody DebitAndCreditCodeOperatorOutDto operatorOut) {
    String token = operatorOut.getToken();
    
    if (!auth.equals(operatorOut.getAuth())) {
      return debitAndCreditCodeErrorStructureWithCodeAndMsg(ERROR_ID_SOME, ERROR_DESCRIPTION_SOME);
    }
    BigDecimal totalBalance = totalBalances.get(players.get(token));
    if (Objects.isNull(totalBalance)) {
      return debitAndCreditCodeErrorStructureWithCodeAndMsg(ERROR_ID_102, ERROR_DESCRIPTION_102);
    }
    String code = operatorOut.getCode();
    Integer numCards;
    BigDecimal amount;
    try {
      numCards = Integer.valueOf(code.split("-")[0]);
      amount = new BigDecimal(code.split("-")[1]); 
    } catch (Exception e) {
      return debitAndCreditCodeErrorStructureWithCodeAndMsg(ERROR_ID_109, ERROR_DESCRIPTION_109);
    }

    BigDecimal transactionValue = BigDecimal.ZERO;
    totalBalance = totalBalance.add(transactionValue);    
    if (totalBalance.compareTo(BigDecimal.ZERO) < 0 || numCards.equals(0)) {
      return debitAndCreditCodeErrorStructureWithCodeAndMsg(ERROR_ID_21, ERROR_DESCRIPTION_21_CODE);
    }

    totalBalances.put(players.get(token), totalBalance);
    transactions.put(operatorOut.getIesTransactionId(), transactionValue);
    return new DebitAndCreditCodeOperatorInDto()
        .setTotalBalance(totalBalances.get(players.get(token)))
        .setAmount(amount)
        .setNumCards(numCards)
        .setPlayerId(players.get(token))
        .setToken(token)
        .setHasError(HAS_ERROR_NOT)
        .setErrorId(ERROR_ID)
        .setErrorDescription(ERROR_DESCRIPTION)
        .setPlatformTransactionId(operatorOut.getIesTransactionId()+PLATFORM_TRANSACTION_ID);
  }  

  /**
   * .
   * 
   * @param operatorOut .
   * @return .
   */
  @PostMapping("/rollback")
  @ResponseBody
  public RollbackOperatorInDto rollback(
      @Valid @RequestBody RollbackOperatorOutDto operatorOut) {
    if(!auth.equals(operatorOut.getAuth())) {
      return new RollbackOperatorInDto()
          .setTotalBalance(ZERO_BD)
          .setPlayerId(VOID)
          .setToken(VOID)
          .setHasError(HAS_ERROR)
          .setErrorId(ERROR_ID_SOME)
          .setErrorDescription(ERROR_DESCRIPTION_SOME)
          .setPlatformTransactionId(VOID);
    }
    BigDecimal transactionValue = transactions.get(operatorOut.getIesRelatedTransactionId()).negate();
    BigDecimal totalBalance = totalBalances.get(operatorOut.getPlayerId()).add(transactionValue);
    totalBalances.put(operatorOut.getPlayerId(), totalBalance);
    transactions.put(operatorOut.getIesTransactionId(), transactionValue);
  
    return new RollbackOperatorInDto()
        .setTotalBalance(totalBalances.get(operatorOut.getPlayerId()))
        .setPlayerId(operatorOut.getPlayerId())
        .setToken(TOKEN)
        .setHasError(HAS_ERROR_NOT)
        .setErrorId(ERROR_ID)
        .setErrorDescription(ERROR_DESCRIPTION)
        .setPlatformTransactionId(operatorOut.getIesTransactionId()+PLATFORM_TRANSACTION_ID);
  }

  /**
   * .
   * 
   * @param operatorOut .
   * @return .
   */
  @PostMapping("/getbalance")
  @ResponseBody
  public GetBalanceOperatorInDto getBalance(
      @Valid @RequestBody GetBalanceOperatorOutDto operatorOut) {
    System.out.println(ZonedDateTime.now());
    System.out.println(operatorOut);
    String token = operatorOut.getToken();
    if(!auth.equals(operatorOut.getAuth())) {
      return new GetBalanceOperatorInDto()
          .setTotalBalance(ZERO_BD)
          .setPlayerId(VOID)
          .setToken(VOID)
          .setHasError(HAS_ERROR)
          .setErrorId(ERROR_ID_SOME)
          .setErrorDescription(ERROR_DESCRIPTION_SOME);
    }
    System.out.println("player ByToken : "+ players.get(token));   
    System.out.println("current player balances: ");  
    totalBalances.forEach((k,v)->{System.out.println(k+"\t"+v);});
    return new GetBalanceOperatorInDto()
        .setTotalBalance(totalBalances.get(players.get(token)))
        .setPlayerId(players.get(token))
        .setToken(token)
        .setHasError(HAS_ERROR_NOT)
        .setErrorId(ERROR_ID)
        .setErrorDescription(ERROR_DESCRIPTION);
  }
  
  
  public String getPlayerDecodingJWT(String jwtToken){
      String[] splitString = jwtToken.split("\\.");
      String base64EncodedBody = splitString[1];
      Base64 base64Url = new Base64(true);
      String body = new String(base64Url.decode(base64EncodedBody));
      ObjectMapper mapper = new ObjectMapper();
      Map<String, String> map = null;
      
      try {
        map = mapper.readValue(body, new TypeReference<Map<String, String>>() {
        });
      } catch (IOException e) {
        return null;
      }
      
      String authField = map.get("auth");
      return authField.split(":")[1];
  }

  public DebitAndCreditOperatorInDto debitAndCreditErrorStructureWithCodeAndMsg(Integer errorCode,
      String errorMsg) {
    return new DebitAndCreditOperatorInDto()
      .setTotalBalance(ZERO_BD)
      .setPlayerId(VOID)
      .setToken(VOID)
      .setHasError(HAS_ERROR)
      .setErrorId(errorCode)
      .setErrorDescription(errorMsg)
      .setPlatformTransactionId(VOID);
  }
  
  public DebitAndCreditCodeOperatorInDto debitAndCreditCodeErrorStructureWithCodeAndMsg(Integer errorCode,
      String errorMsg) {
    return new DebitAndCreditCodeOperatorInDto()
      .setTotalBalance(ZERO_BD)
      .setAmount(ZERO_BD)
      .setNumCards(ZERO_I)
      .setPlayerId(VOID)
      .setToken(VOID)
      .setHasError(HAS_ERROR)
      .setErrorId(errorCode)
      .setErrorDescription(errorMsg)
      .setPlatformTransactionId(VOID);
  }  
}
