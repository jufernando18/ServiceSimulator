package co.com.ies.web.rest.api;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import javax.validation.Valid;

import org.apache.tomcat.util.codec.binary.Base64;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import co.com.ies.service.dto.api.AuthenticateOperatorInDto;
import co.com.ies.service.dto.api.AuthenticateOperatorOutDto;
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
  private static final String VOID = "doesn't apply";
  private static final String USER = "inWPLAYIesUser";
  private static final String PASS = "pass";
  private static final String PLAYER_ID = "playerId";
  private static final BigDecimal TOTAL_BALANCE = BigDecimal.valueOf(100000);
  private static final String TOKEN = "123t2o2k2e2n123";
  private static final Integer HAS_ERROR_NOT = 0;
  private static final Integer HAS_ERROR = 1;
  private static final Integer ERROR_ID = 0;
  private static final Integer ERROR_ID_SOME = -1;
  private static final String ERROR_DESCRIPTION = VOID;
  private static final String ERROR_DESCRIPTION_SOME = "Bab credentials";
  private static final String PLATFORM_TRANSACTION_ID = "124platform421";
  private static final AuthDto auth = new AuthDto().setUser(USER).setPass(PASS);
  private Map<String, BigDecimal> totalBalances = new HashMap<>();

  /**
   * .
   * 
   * @param operatorOut .
   * @return .
   */
  @PostMapping("/authenticate")
  @ResponseBody
  public AuthenticateOperatorInDto authenticate(
      @Valid @RequestBody AuthenticateOperatorOutDto operatorOut) {
    System.out.println(operatorOut);
    if(!auth.equals(operatorOut.getAuth())) {
      return new AuthenticateOperatorInDto()
          .setTotalBalance(BigDecimal.ZERO)
          .setPlayerId(VOID)
          .setToken(VOID)
          .setHasError(HAS_ERROR)
          .setErrorId(ERROR_ID_SOME)
          .setErrorDescription(ERROR_DESCRIPTION_SOME);
    }
    String player = getPlayerDecodingJWT(operatorOut.getToken());
    if(!totalBalances.containsKey(player))totalBalances.put(player, TOTAL_BALANCE);
    return new AuthenticateOperatorInDto()
        .setTotalBalance(totalBalances.get(operatorOut.getToken()))
        .setPlayerId(PLAYER_ID)
        .setToken(operatorOut.getToken())
        .setHasError(HAS_ERROR_NOT)
        .setErrorId(ERROR_ID)
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
  public DebitAndCreditOperatorInDto debitAndCredit(
      @Valid @RequestBody DebitAndCreditOperatorOutDto operatorOut) {
    System.out.println(operatorOut);
    if(!auth.equals(operatorOut.getAuth())) {
      return new DebitAndCreditOperatorInDto()
          .setTotalBalance(BigDecimal.ZERO)
          .setPlayerId(VOID)
          .setToken(VOID)
          .setHasError(HAS_ERROR)
          .setErrorId(ERROR_ID_SOME)
          .setErrorDescription(ERROR_DESCRIPTION_SOME)
          .setPlatformTransactionId(VOID);
    }
    String player = getPlayerDecodingJWT(operatorOut.getToken());
    BigDecimal totalBalance = totalBalances.get(player);
    totalBalance = totalBalance.add(operatorOut.getCreditAmount()).subtract(operatorOut.getDebitAmount());
    totalBalances.put(player, totalBalance);
    return new DebitAndCreditOperatorInDto()
        .setTotalBalance(totalBalance)
        .setPlayerId(PLAYER_ID)
        .setToken(TOKEN)
        .setHasError(HAS_ERROR_NOT)
        .setErrorId(ERROR_ID)
        .setErrorDescription(ERROR_DESCRIPTION)
        .setPlatformTransactionId(PLATFORM_TRANSACTION_ID);
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
    System.out.println(operatorOut);
    if(!auth.equals(operatorOut.getAuth())) {
      return new RollbackOperatorInDto()
          .setTotalBalance(BigDecimal.ZERO)
          .setPlayerId(VOID)
          .setToken(VOID)
          .setHasError(HAS_ERROR)
          .setErrorId(ERROR_ID_SOME)
          .setErrorDescription(ERROR_DESCRIPTION_SOME)
          .setPlatformTransactionId(VOID);
    }
    return new RollbackOperatorInDto()
        .setTotalBalance(TOTAL_BALANCE)
        .setPlayerId(PLAYER_ID)
        .setToken(TOKEN)
        .setHasError(HAS_ERROR_NOT)
        .setErrorId(ERROR_ID)
        .setErrorDescription(ERROR_DESCRIPTION)
        .setPlatformTransactionId(PLATFORM_TRANSACTION_ID);
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
    System.out.println(operatorOut);
    if(!auth.equals(operatorOut.getAuth())) {
      return new GetBalanceOperatorInDto()
          .setTotalBalance(BigDecimal.ZERO)
          .setPlayerId(VOID)
          .setToken(VOID)
          .setHasError(HAS_ERROR)
          .setErrorId(ERROR_ID_SOME)
          .setErrorDescription(ERROR_DESCRIPTION_SOME);
    }
    return new GetBalanceOperatorInDto()
        .setTotalBalance(totalBalances.get(operatorOut.getToken()))
        .setPlayerId(PLAYER_ID)
        .setToken(TOKEN)
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
      String user = authField.split(":")[1];
      System.out.println("user : "+ user);   
      return user;
  }
}
