package co.com.ies.service.dto.sub;

import java.util.List;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PositiveOrZero;

public class RoomAndRaffle {

  @NotNull
  @PositiveOrZero
  private Long id;
  @NotBlank
  private String name;
  private String description;
  @NotNull
  private List<Raffle> raffles;
  
  public RoomAndRaffle() {
    super();
  }

  public Long getId() {
    return id;
  }

  public RoomAndRaffle setId(Long id) {
    this.id = id;
    return this;
  }

  public String getName() {
    return name;
  }

  public RoomAndRaffle setName(String name) {
    this.name = name;
    return this;
  }

  public String getDescription() {
    return description;
  }

  public RoomAndRaffle setDescription(String description) {
    this.description = description;
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
    result = prime * result + ((description == null) ? 0 : description.hashCode());
    result = prime * result + ((id == null) ? 0 : id.hashCode());
    result = prime * result + ((name == null) ? 0 : name.hashCode());
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
    RoomAndRaffle other = (RoomAndRaffle) obj;
    if (description == null) {
      if (other.description != null)
        return false;
    } else if (!description.equals(other.description))
      return false;
    if (id == null) {
      if (other.id != null)
        return false;
    } else if (!id.equals(other.id))
      return false;
    if (name == null) {
      if (other.name != null)
        return false;
    } else if (!name.equals(other.name))
      return false;
    if (raffles == null) {
      if (other.raffles != null)
        return false;
    } else if (!raffles.equals(other.raffles))
      return false;
    return true;
  }

  @Override
  public String toString() {
    return "RoomAndRaffle [name=" + name + ", description=" + description + ", raffles=" + raffles
        + "]";
  }

  
}
