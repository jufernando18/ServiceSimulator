package co.com.ies.service.dto.router.operator;

import co.com.ies.service.dto.sub.Raffle;
import co.com.ies.service.dto.sub.StatusDto;

import java.util.List;

import javax.validation.constraints.NotNull;

public class GetRafflesResponse {
  
  @NotNull
  private List<Raffle> raffles;
  @NotNull
  private StatusDto status;

  public GetRafflesResponse() {
    super();
  }

  public List<Raffle> getRaffles() {
    return raffles;
  }

  public GetRafflesResponse setRaffles(List<Raffle> raffles) {
    this.raffles = raffles;
    return this;
  }

  public StatusDto getStatus() {
    return status;
  }

  public GetRafflesResponse setStatus(StatusDto status) {
    this.status = status;
    return this;
  }

  
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((raffles == null) ? 0 : raffles.hashCode());
    result = prime * result + ((status == null) ? 0 : status.hashCode());
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
    GetRafflesResponse other = (GetRafflesResponse) obj;
    if (raffles == null) {
      if (other.raffles != null)
        return false;
    } else if (!raffles.equals(other.raffles))
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
    return "GetRafflesResponse [raffles=" + raffles + ", status=" + status + "]";
  }

}
