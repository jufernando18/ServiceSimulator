package co.com.ies.service.dto.router.operatormodule;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import co.com.ies.service.dto.sub.StatusDto;

public class LaunchGameModuleResponse {

  @NotBlank
  private String url;
  @NotBlank
  private String token;

  public LaunchGameModuleResponse() {
    super();
  }

  public String getUrl() {
    return url;
  }

  public LaunchGameModuleResponse setUrl(String url) {
    this.url = url;
    return this;
  }

  public String getToken() {
    return token;
  }

  public LaunchGameModuleResponse setToken(String token) {
    this.token = token;
    return this;
  }



  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((token == null) ? 0 : token.hashCode());
    result = prime * result + ((url == null) ? 0 : url.hashCode());
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
    LaunchGameModuleResponse other = (LaunchGameModuleResponse) obj;
    if (token == null) {
      if (other.token != null)
        return false;
    } else if (!token.equals(other.token))
      return false;
    if (url == null) {
      if (other.url != null)
        return false;
    } else if (!url.equals(other.url))
      return false;
    return true;
  }

  @Override
  public String toString() {
    return "LaunchGameModuleResponse [url=" + url + ", token=" + token + "]";
  }



}
