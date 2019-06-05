package co.com.ies.service.dto.router.operator;

import co.com.ies.service.dto.sub.RoomAndRaffle;

import java.util.List;

import javax.validation.constraints.NotNull;

public class GetAllRafflesResponse {

  @NotNull
  private List<RoomAndRaffle> allRaffles;

  public GetAllRafflesResponse() {
    super();
  }

  public List<RoomAndRaffle> getAllRaffles() {
    return allRaffles;
  }

  public void setAllRaffles(List<RoomAndRaffle> allRaffles) {
    this.allRaffles = allRaffles;
  }

  @Override
  public String toString() {
    return "GetAllRafflesResponse [allRaffles=" + allRaffles + "]";
  }
  
  
}
