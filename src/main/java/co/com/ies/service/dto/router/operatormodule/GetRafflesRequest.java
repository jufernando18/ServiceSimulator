package co.com.ies.service.dto.router.operatormodule;

import co.com.ies.service.dto.sub.AccountDto;

import javax.validation.constraints.NotNull;

public class GetRafflesRequest {

  @NotNull
  private AccountDto account;
}
