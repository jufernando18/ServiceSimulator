package co.com.ies.service.dto.sub.summarydata;

import java.util.Date;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class Raffle {

  @NotBlank
  private String gameCode;
  @NotBlank
  private String name;
  @NotBlank
  private String state;
  private String stateDescription;
  @NotNull
  private Date launchingDate;

  public Raffle() {
    super();
  }

  public String getGameCode() {
    return gameCode;
  }

  public Raffle setGameCode(String gameCode) {
    this.gameCode = gameCode;
    return this;
  }

  public String getName() {
    return name;
  }

  public Raffle setName(String name) {
    this.name = name;
    return this;
  }

  public String getState() {
    return state;
  }

  public Raffle setState(String state) {
    this.state = state;
    return this;
  }

  public String getStateDescription() {
    return stateDescription;
  }

  public Raffle setStateDescription(String stateDescription) {
    this.stateDescription = stateDescription;
    return this;
  }

  public Date getLaunchingDate() {
    return launchingDate;
  }

  public Raffle setLaunchingDate(Date launchingDate) {
    this.launchingDate = launchingDate;
    return this;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((gameCode == null) ? 0 : gameCode.hashCode());
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
    Raffle other = (Raffle) obj;
    if (gameCode == null) {
      if (other.gameCode != null)
        return false;
    } else if (!gameCode.equals(other.gameCode))
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
    return "Raffle [gameCode=" + gameCode + ", name=" + name + ", state=" + state
        + ", stateDescription=" + stateDescription + ", launchingDate=" + launchingDate + "]";
  }

}
