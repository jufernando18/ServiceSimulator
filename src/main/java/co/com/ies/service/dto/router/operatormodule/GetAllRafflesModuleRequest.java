package co.com.ies.service.dto.router.operatormodule;

import javax.validation.constraints.NotNull;

import co.com.ies.service.dto.sub.AccountDto;

public class GetAllRafflesModuleRequest {

  @NotNull
  private AccountDto account;

  public GetAllRafflesModuleRequest() {
    super();
  }

  public AccountDto getAccount() {
    return account;
  }

  public GetAllRafflesModuleRequest setAccount(AccountDto account) {
    this.account = account;
    return this;
  }

  @Override
  public String toString() {
    return "GetAllRafflesModuleRequest [account=" + account + "]";
  }
  
  
}
