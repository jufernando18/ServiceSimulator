package co.com.ies.service.dto.router.operatormodule;

import co.com.ies.service.dto.sub.summarydata.RoomAndRaffle;

import java.util.List;

import javax.validation.constraints.NotNull;

public class GetRoomsModuleResponse {
  
  @NotNull
  private List<RoomAndRaffle> rooms;

  public GetRoomsModuleResponse() {
    super();
  }

  public List<RoomAndRaffle> getRooms() {
    return rooms;
  }

  public GetRoomsModuleResponse setRooms(List<RoomAndRaffle> rooms) {
    this.rooms = rooms;
    return this;
  }

  
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((rooms == null) ? 0 : rooms.hashCode());
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
    GetRoomsModuleResponse other = (GetRoomsModuleResponse) obj;
    if (rooms == null) {
      if (other.rooms != null)
        return false;
    } else if (!rooms.equals(other.rooms))
      return false;
    return true;
  }

  @Override
  public String toString() {
    return "GetRoomsResponse [rooms=" + rooms + "]";
  }
}
