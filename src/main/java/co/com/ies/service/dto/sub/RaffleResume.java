package co.com.ies.service.dto.sub;

import java.util.Date;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PositiveOrZero;

public class RaffleResume {

  @NotNull
  @PositiveOrZero
  private Long id;
  @NotBlank
  private String name;
  @NotBlank
  private String state;
  private String stateDescription;
  @NotNull
  private Date launchingDate;

  public RaffleResume() {
    super();
  }

  public Long getId() {
    return id;
  }

  public RaffleResume setId(Long id) {
    this.id = id;
    return this;
  }

  public String getName() {
    return name;
  }

  public RaffleResume setName(String name) {
    this.name = name;
    return this;
  }

  public String getState() {
    return state;
  }

  public RaffleResume setState(String state) {
    this.state = state;
    return this;
  }

  public String getStateDescription() {
    return stateDescription;
  }

  public RaffleResume setStateDescription(String stateDescription) {
    this.stateDescription = stateDescription;
    return this;
  }

  public Date getLaunchingDate() {
    return launchingDate;
  }

  public RaffleResume setLaunchingDate(Date launchingDate) {
    this.launchingDate = launchingDate;
    return this;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((id == null) ? 0 : id.hashCode());
    result = prime * result + ((launchingDate == null) ? 0 : launchingDate.hashCode());
    result = prime * result + ((name == null) ? 0 : name.hashCode());
    result = prime * result + ((state == null) ? 0 : state.hashCode());
    result = prime * result + ((stateDescription == null) ? 0 : stateDescription.hashCode());
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
    RaffleResume other = (RaffleResume) obj;
    if (id == null) {
      if (other.id != null)
        return false;
    } else if (!id.equals(other.id))
      return false;
    if (launchingDate == null) {
      if (other.launchingDate != null)
        return false;
    } else if (!launchingDate.equals(other.launchingDate))
      return false;
    if (name == null) {
      if (other.name != null)
        return false;
    } else if (!name.equals(other.name))
      return false;
    if (state == null) {
      if (other.state != null)
        return false;
    } else if (!state.equals(other.state))
      return false;
    if (stateDescription == null) {
      if (other.stateDescription != null)
        return false;
    } else if (!stateDescription.equals(other.stateDescription))
      return false;
    return true;
  }

  @Override
  public String toString() {
    return "RaffleResume [id=" + id + ", name=" + name + ", state=" + state + ", stateDescription="
        + stateDescription + ", launchingDate=" + launchingDate + "]";
  }

}
