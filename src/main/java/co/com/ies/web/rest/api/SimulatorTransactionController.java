package co.com.ies.web.rest.api;

import co.com.ies.domain.enumeration.Key;
import co.com.ies.domain.enumeration.TransType;
import co.com.ies.domain.enumeration.Url;
import co.com.ies.service.dto.api.TransactionDto;

import java.util.HashMap;
import java.util.Map;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/simuladortransaction")
public class SimulatorTransactionController {

  static final Logger logger = LoggerFactory.getLogger(SimulatorTransactionController.class);

  /**
   * Simula la respuesta de Transaction ante una petición de API. param transactionOut datos de
   * entrada en Transaction
   * 
   * @return
   */
  @PostMapping("/transaction")
  @ResponseBody
  // @GetMapping("/transaction")
  public TransactionDto transaction(
      @Valid @RequestBody TransactionDto transactionOut) {
    logger.debug("############TRANSACTION_STARTING############");
    Long now = System.currentTimeMillis();
    Map<String, Object> body1 = transactionOut.getBody();
    Object userName = (body1!=null)?body1.getOrDefault(Key.USER_NAME.getKey(),"defaultNameEmptyField"):"defaultNameNoBody";
    Object password = (body1!=null)?body1.getOrDefault(Key.PASSWORD.getKey(),"defaultPasswordEmptyField"):"defaultPasswordNoBody";
    TransType operationType = transactionOut.getOperationType();
    String token = (password.hashCode() * now) + "";
    String url = Url.OPERATOR_END_POINT.getUrl();

    Map<String, Object> body2 = new HashMap<>();
    body2.put(Key.USER_NAME.getKey(), userName);
    body2.put(Key.PASSWORD.getKey(), password);

    TransactionDto transactionOutDto = new TransactionDto()
        .setOperationType(operationType)
        .setToken(token)
        //.setUrl(url)
        .setBody(body2);
    logger.debug("{}", transactionOutDto);
    logger.debug("############TRANSACTION_ENDING############");
    return transactionOutDto;
  }
}
