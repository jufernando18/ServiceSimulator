package co.com.ies.domain.enumeration;

public enum Url {
  //TRANSACTION("http://localhost:9898/server/game"),
  TRANSACTION("http://localhost:9898/simuladortransaction/transaction"),
  OPERATOR_END_POINT("http://localhost:9898/simuladoroperador"),
  AUTHENTICATE("/Authenticate"),
  DEBIT_AND_CREDIT("/debitAndCredit"),
  ROLLBACK("/Rollback"),
  GET_BALANCE("/GetBalance");

  private final String url;

  private Url() {
    this.url = null;
  }

  private Url(String url) {
    this.url = url;
  }

  public String getUrl() {
    return url;
  }
}
