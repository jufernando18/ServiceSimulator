package co.com.ies.service.dto.router.operatormodule;

import co.com.ies.service.dto.sub.RoomAndRaffle;

import java.util.List;

import javax.validation.constraints.NotNull;

public class GetAllRafflesModuleResponse {

  @NotNull
  private List<RoomAndRaffle> allRaffles;

  public GetAllRafflesModuleResponse() {
    super();
  }

  public List<RoomAndRaffle> getAllRaffles() {
    return allRaffles;
  }

  public GetAllRafflesModuleResponse setAllRaffles(List<RoomAndRaffle> allRaffles) {
    this.allRaffles = allRaffles;
    return this;
  }

  
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((allRaffles == null) ? 0 : allRaffles.hashCode());
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
    GetAllRafflesModuleResponse other = (GetAllRafflesModuleResponse) obj;
    if (allRaffles == null) {
      if (other.allRaffles != null)
        return false;
    } else if (!allRaffles.equals(other.allRaffles))
      return false;
    return true;
  }

  @Override
  public String toString() {
    return "GetAllRafflesResponse [allRaffles=" + allRaffles + "]";
  }
  
  
}
