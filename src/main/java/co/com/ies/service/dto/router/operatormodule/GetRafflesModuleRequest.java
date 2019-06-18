package co.com.ies.service.dto.router.operatormodule;

import co.com.ies.service.dto.sub.AccountDto;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.PositiveOrZero;

public class GetRafflesModuleRequest {

  @NotNull
  private AccountDto account;
  @NotNull
  @PositiveOrZero
  private Long roomId;
  private String filter;

  public GetRafflesModuleRequest() {
    super();
  }

  public AccountDto getAccount() {
    return account;
  }

  public GetRafflesModuleRequest setAccount(AccountDto account) {
    this.account = account;
    return this;
  }

  public Long getRoomId() {
    return roomId;
  }

  public GetRafflesModuleRequest setRoomId(Long roomId) {
    this.roomId = roomId;
    return this;
  }

  public String getFilter() {
    return filter;
  }

  public GetRafflesModuleRequest setFilter(String filter) {
    this.filter = filter;
    return this;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((account == null) ? 0 : account.hashCode());
    result = prime * result + ((filter == null) ? 0 : filter.hashCode());
    result = prime * result + ((roomId == null) ? 0 : roomId.hashCode());
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
    GetRafflesModuleRequest other = (GetRafflesModuleRequest) obj;
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
    if (roomId == null) {
      if (other.roomId != null)
        return false;
    } else if (!roomId.equals(other.roomId))
      return false;
    return true;
  }

  @Override
  public String toString() {
    return "GetRafflesModuleRequest [account=" + account + ", roomId=" + roomId + ", filter="
        + filter + "]";
  }

}
