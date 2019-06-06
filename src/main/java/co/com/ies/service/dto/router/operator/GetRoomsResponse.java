package co.com.ies.service.dto.router.operator;

import java.util.List;

import javax.validation.constraints.NotNull;

import co.com.ies.service.dto.sub.RoomAndRaffleResume;

public class GetRoomsResponse {
  
  @NotNull
  private List<RoomAndRaffleResume> rooms;

  public GetRoomsResponse() {
    super();
  }

  public List<RoomAndRaffleResume> getRooms() {
    return rooms;
  }

  public GetRoomsResponse setRooms(List<RoomAndRaffleResume> rooms) {
    this.rooms = rooms;
    return this;
  }

  @Override
  public String toString() {
    return "GetRoomsResponse [rooms=" + rooms + "]";
  }
}
