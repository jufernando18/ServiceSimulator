package co.com.ies.service.dto.router.operatormodule;

import co.com.ies.service.dto.sub.AccountDto;

import javax.validation.constraints.NotNull;

public class GetRoomsModuleRequest {

  @NotNull
  private AccountDto account;

  public GetRoomsModuleRequest() {
    super();
  }

  public AccountDto getAccount() {
    return account;
  }

  public void setAccount(AccountDto account) {
    this.account = account;
  }

  @Override
  public String toString() {
    return "GetRoomsModuleRequest [account=" + account + "]";
  }


}
