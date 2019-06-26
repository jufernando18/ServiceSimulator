package co.com.ies.service.dto.router.operator;

import co.com.ies.service.dto.sub.summarydata.RoomAndRaffle;
import co.com.ies.service.dto.sub.StatusDto;

import java.util.List;

import javax.validation.constraints.NotNull;

public class GetRoomsResponse {
  
  @NotNull
  private List<RoomAndRaffle> rooms;
  @NotNull
  private StatusDto status;

  public GetRoomsResponse() {
    super();
  }

  public List<RoomAndRaffle> getRooms() {
    return rooms;
  }

  public GetRoomsResponse setRooms(List<RoomAndRaffle> rooms) {
    this.rooms = rooms;
    return this;
  }

  public StatusDto getStatus() {
    return status;
  }

  public GetRoomsResponse setStatus(StatusDto status) {
    this.status = status;
    return this;
  }

  
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((rooms == null) ? 0 : rooms.hashCode());
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
    GetRoomsResponse other = (GetRoomsResponse) obj;
    if (rooms == null) {
      if (other.rooms != null)
        return false;
    } else if (!rooms.equals(other.rooms))
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
    return "GetRoomsResponse [rooms=" + rooms + ", status=" + status + "]";
  }


}
