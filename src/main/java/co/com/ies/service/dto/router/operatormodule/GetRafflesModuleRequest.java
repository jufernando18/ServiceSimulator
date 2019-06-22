package co.com.ies.service.dto.router.operatormodule;

import co.com.ies.service.dto.sub.AccountDto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class GetRafflesModuleRequest {

  @NotNull
  private AccountDto account;
  @NotBlank
  private String roomName;
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

  public String getRoomName() {
    return roomName;
  }

  public GetRafflesModuleRequest setRoomName(String roomName) {
    this.roomName = roomName;
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
    result = prime * result + ((roomName == null) ? 0 : roomName.hashCode());
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
    if (roomName == null) {
      if (other.roomName != null)
        return false;
    } else if (!roomName.equals(other.roomName))
      return false;
    return true;
  }

  @Override
  public String toString() {
    return "GetRafflesModuleRequest [account=" + account + ", roomName=" + roomName + ", filter="
        + filter + "]";
  }

}
