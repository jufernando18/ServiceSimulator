package co.com.ies.service.dto.router.operator;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import co.com.ies.service.dto.sub.StatusDto;

public class LaunchGameOutDto {
  
  @NotBlank
  private String url;
  @NotNull
  private StatusDto status;

  public LaunchGameOutDto() {
    super();
  }

  /**
   * Modelo de información que se entrega como respuesta al operador.
   * 
   * @param url    url más token de acceso al juego
   * @param status estado con el que finalizó la operación
   */
  public LaunchGameOutDto(String url, StatusDto status) {
    super();
    this.url = url;
    this.status = status;
  }

  public String getUrl() {
    return url;
  }

  public LaunchGameOutDto setUrl(String url) {
    this.url = url;
    return this;
  }

  public StatusDto getStatus() {
    return status;
  }

  public LaunchGameOutDto setStatus(StatusDto status) {
    this.status = status;
    return this;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((status == null) ? 0 : status.hashCode());
    result = prime * result + ((url == null) ? 0 : url.hashCode());
    return result;
  }

  @SuppressWarnings("all")
  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    LaunchGameOutDto other = (LaunchGameOutDto) obj;
    if (status == null) {
      if (other.status != null) {
        return false;
      }
    } else if (!status.equals(other.status)) {
      return false;
    }
    if (url == null) {
      if (other.url != null) {
        return false;
      }
    } else if (!url.equals(other.url)) {
      return false;
    }
    return true;
  }

  public boolean isEmpty() {
    LaunchGameOutDto o = new LaunchGameOutDto();
    return o.equals(this);
  }

  @Override
  public String toString() {
    return "LaunchGameOperatorOutDTO [url=" + url + ", status=" + status + "]";
  }

}
