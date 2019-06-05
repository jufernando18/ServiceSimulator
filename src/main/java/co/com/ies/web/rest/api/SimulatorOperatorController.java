package co.com.ies.web.rest.api;

import java.math.BigDecimal;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import co.com.ies.service.dto.api.AuthenticateOperatorInDto;
import co.com.ies.service.dto.api.AuthenticateOperatorOutDto;
import co.com.ies.service.dto.api.DebitAndCreditOperatorInDto;
import co.com.ies.service.dto.api.DebitAndCreditOperatorOutDto;
import co.com.ies.service.dto.api.GetBalanceOperatorInDto;
import co.com.ies.service.dto.api.GetBalanceOperatorOutDto;
import co.com.ies.service.dto.api.RollbackOperatorInDto;
import co.com.ies.service.dto.api.RollbackOperatorOutDto;

@RestController
@RequestMapping("/simuladoroperador")
public class SimulatorOperatorController {
  private static final String PLAYER_ID = "bingoplayerid7";
  private static final BigDecimal TOTAL_BALANCE = BigDecimal.valueOf(1.1);
  private static final String TOKEN = "123t2o2k2e2n123";
  private static final Integer HAS_ERROR_NOT = 0;
  private static final Integer ERROR_ID = 0;
  private static final String ERROR_DESCRIPTION = "";
  private static final String PLATFORM_TRANSACTION_ID = "124platform421";

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
    return new AuthenticateOperatorInDto()
        .setTotalBalance(TOTAL_BALANCE)
        .setPlayerId(PLAYER_ID)
        .setToken(TOKEN)
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
    return new DebitAndCreditOperatorInDto()
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
  @PostMapping("/rollback")
  @ResponseBody
  public RollbackOperatorInDto rollback(
      @Valid @RequestBody RollbackOperatorOutDto operatorOut) {
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
    return new GetBalanceOperatorInDto()
        .setTotalBalance(TOTAL_BALANCE)
        .setPlayerId(PLAYER_ID)
        .setToken(TOKEN)
        .setHasError(HAS_ERROR_NOT)
        .setErrorId(ERROR_ID)
        .setErrorDescription(ERROR_DESCRIPTION);
  }
}
