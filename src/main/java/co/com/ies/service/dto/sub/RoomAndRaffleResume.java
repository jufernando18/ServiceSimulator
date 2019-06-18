package co.com.ies.service.dto.sub;

import java.util.List;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PositiveOrZero;

public class RoomAndRaffleResume {

  @NotNull
  @PositiveOrZero
  private Long id;
  @NotBlank
  private String name;
  private String description;
  @NotNull
  private List<RaffleResume> rafflesResume;

  public RoomAndRaffleResume() {
    super();
  }

  public Long getId() {
    return id;
  }

  public RoomAndRaffleResume setId(Long id) {
    this.id = id;
    return this;
  }

  public String getName() {
    return name;
  }

  public RoomAndRaffleResume setName(String name) {
    this.name = name;
    return this;
  }

  public String getDescription() {
    return description;
  }

  public RoomAndRaffleResume setDescription(String description) {
    this.description = description;
    return this;
  }

  public List<RaffleResume> getRafflesResume() {
    return rafflesResume;
  }

  public RoomAndRaffleResume setRafflesResume(List<RaffleResume> rafflesResume) {
    this.rafflesResume = rafflesResume;
    return this;
  }

  
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((description == null) ? 0 : description.hashCode());
    result = prime * result + ((id == null) ? 0 : id.hashCode());
    result = prime * result + ((name == null) ? 0 : name.hashCode());
    result = prime * result + ((rafflesResume == null) ? 0 : rafflesResume.hashCode());
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
    RoomAndRaffleResume other = (RoomAndRaffleResume) obj;
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
    if (rafflesResume == null) {
      if (other.rafflesResume != null)
        return false;
    } else if (!rafflesResume.equals(other.rafflesResume))
      return false;
    return true;
  }

  @Override
  public String toString() {
    return "RoomAndRaffleResume [id=" + id + ", name=" + name + ", description=" + description
        + ", rafflesResume=" + rafflesResume + "]";
  }

}
