package co.com.ies.service.dto.sub;

import java.util.Date;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PastOrPresent;
import javax.validation.constraints.PositiveOrZero;

public class RaffleResume {

  @NotBlank
  private String state;
  @NotBlank
  private String name;
  @NotNull
  @PositiveOrZero
  private Long id;
  @PastOrPresent
  private Date launchingDate;
  
  public RaffleResume() {
    super();
  }

  public String getState() {
    return state;
  }

  public RaffleResume setState(String state) {
    this.state = state;
    return this;
  }

  public String getName() {
    return name;
  }

  public RaffleResume setName(String name) {
    this.name = name;
    return this;
  }

  public Long getId() {
    return id;
  }

  public RaffleResume setId(Long id) {
    this.id = id;
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
  public String toString() {
    return "RaffleResume [state=" + state + ", name=" + name + ", id=" + id + ", launchingDate="
        + launchingDate + "]";
  }
  
  
}
