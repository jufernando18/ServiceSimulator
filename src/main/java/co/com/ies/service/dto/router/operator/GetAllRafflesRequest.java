package co.com.ies.service.dto.router.operator;

import co.com.ies.service.dto.router.operator.GetAllRafflesRequest;
import co.com.ies.service.dto.sub.AccountDto;

import javax.validation.constraints.NotNull;

public class GetAllRafflesRequest {

  @NotNull
  private AccountDto account;
  private String filter;

  public GetAllRafflesRequest() {
    super();
  }

  public AccountDto getAccount() {
    return account;
  }

  public GetAllRafflesRequest setAccount(AccountDto account) {
    this.account = account;
    return this;
  }

  public String getFilter() {
    return filter;
  }

  public GetAllRafflesRequest setFilter(String filter) {
    this.filter = filter;
    return this;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((account == null) ? 0 : account.hashCode());
    result = prime * result + ((filter == null) ? 0 : filter.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    GetAllRafflesRequest other = (GetAllRafflesRequest) obj;
    if (account == null) {
      if (other.account != null)
        return false;
    } else if (!account.equals(other.account))
      return false;
    if (filter == null) {
      if (other.filter != null)
        return false;
    } else if (!filter.equals(other.filter))
      return false;
    return true;
  }

  @Override
  public String toString() {
    return "GetAllRafflesRequest [account=" + account + ", filter=" + filter + "]";
  }

}
