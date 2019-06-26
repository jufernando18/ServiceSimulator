package co.com.ies.service.dto.sub.summarydata;

import java.util.List;

import javax.validation.constraints.NotNull;

import co.com.ies.service.dto.sub.Room;

public class RoomAndRaffle {

  @NotNull
  private Room room;
  @NotNull
  private List<Raffle> raffles;

  public RoomAndRaffle() {
    super();
  }

  public Room getRoom() {
    return room;
  }

  public RoomAndRaffle setRoom(Room room) {
    this.room = room;
    return this;
  }


  public List<Raffle> getRaffles() {
    return raffles;
  }

  public RoomAndRaffle setRaffles(List<Raffle> raffles) {
    this.raffles = raffles;
    return this;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((raffles == null) ? 0 : raffles.hashCode());
    result = prime * result + ((room == null) ? 0 : room.hashCode());
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
    RoomAndRaffle other = (RoomAndRaffle) obj;
    if (raffles == null) {
      if (other.raffles != null)
        return false;
    } else if (!raffles.equals(other.raffles))
      return false;
    if (room == null) {
      if (other.room != null)
        return false;
    } else if (!room.equals(other.room))
      return false;
    return true;
  }

  @Override
  public String toString() {
    return "RoomAndRaffle [raffles=" + raffles + ", room=" + room + "]";
  }
}
