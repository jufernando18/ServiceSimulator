package co.com.ies.service.dto.router.operatormodule;

import java.util.List;

import javax.validation.constraints.NotNull;

import co.com.ies.service.dto.sub.RoomAndRaffleResume;

public class GetRoomsModuleResponse {
  
  @NotNull
  private List<RoomAndRaffleResume> rooms;

  public GetRoomsModuleResponse() {
    super();
  }

  public List<RoomAndRaffleResume> getRooms() {
    return rooms;
  }

  public GetRoomsModuleResponse setRooms(List<RoomAndRaffleResume> rooms) {
    this.rooms = rooms;
    return this;
  }

  @Override
  public String toString() {
    return "GetRoomsResponse [rooms=" + rooms + "]";
  }
}
