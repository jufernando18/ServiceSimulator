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
  public String toString() {
    return "GetAllRafflesModuleResponse [allRaffles=" + allRaffles + "]";
  }
  
  
}
