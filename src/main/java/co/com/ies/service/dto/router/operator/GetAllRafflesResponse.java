package co.com.ies.service.dto.router.operator;

import co.com.ies.service.dto.sub.RoomAndRaffle;
import co.com.ies.service.dto.sub.StatusDto;

import java.util.List;

import javax.validation.constraints.NotNull;

public class GetAllRafflesResponse {

  @NotNull
  private List<RoomAndRaffle> allRaffles;
  
  private StatusDto status;

  public GetAllRafflesResponse() {
    super();
  }

  public List<RoomAndRaffle> getAllRaffles() {
    return allRaffles;
  }

  public GetAllRafflesResponse setAllRaffles(List<RoomAndRaffle> allRaffles) {
    this.allRaffles = allRaffles;
    return this;
  }

  public StatusDto getStatus() {
    return status;
  }

  public GetAllRafflesResponse setStatus(StatusDto status) {
    this.status = status;
    return this;
  }

  
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((allRaffles == null) ? 0 : allRaffles.hashCode());
    System.out.println(result);
    result = prime * result + ((status == null) ? 0 : status.hashCode());
    System.out.println(result);
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
    GetAllRafflesResponse other = (GetAllRafflesResponse) obj;
    if (allRaffles == null) {
      if (other.allRaffles != null)
        return false;
    } else if (!allRaffles.equals(other.allRaffles))
      return false;
    if (status == null) {
      if (other.status != null)
        return false;
    } else if (!status.equals(other.status))
      return false;
    return true;
  }

  @Override
  public String toString() {
    return "GetAllRafflesResponse [allRaffles=" + allRaffles + ", status=" + status + "]";
  }

  
}
