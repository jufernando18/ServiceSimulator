package co.com.ies.service.dto.router.operatormodule;

import co.com.ies.service.dto.sub.Raffle;

import java.util.List;

import javax.validation.constraints.NotNull;

public class GetRafflesModuleResponse {

  @NotNull
  private List<Raffle> raffles;

  public GetRafflesModuleResponse() {
    super();
  }

  public List<Raffle> getRaffles() {
    return raffles;
  }

  public GetRafflesModuleResponse setRaffles(List<Raffle> raffles) {
    this.raffles = raffles;
    return this;
  }

  
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((raffles == null) ? 0 : raffles.hashCode());
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
    GetRafflesModuleResponse other = (GetRafflesModuleResponse) obj;
    if (raffles == null) {
      if (other.raffles != null)
        return false;
    } else if (!raffles.equals(other.raffles))
      return false;
    return true;
  }

  @Override
  public String toString() {
    return "GetRafflesModuleResponse [raffles=" + raffles + "]";
  }
}
