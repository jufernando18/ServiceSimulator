package co.com.ies.service.dto.api;

import co.com.ies.service.dto.sub.AuthDto;

public class AuthenticateOperatorOutDto {

  private String token;
  private AuthDto auth;

  public AuthenticateOperatorOutDto() {
    super();
  }

  /**
   * .
   * 
   * @param token .
   * @param auth  .
   */
  public AuthenticateOperatorOutDto(String token, AuthDto auth) {
    super();
    this.token = token;
    this.auth = auth;
  }

  public String getToken() {
    return token;
  }

  public AuthenticateOperatorOutDto setToken(String token) {
    this.token = token;
    return this;
  }

  public AuthDto getAuth() {
    return auth;
  }

  public AuthenticateOperatorOutDto setAuth(AuthDto auth) {
    this.auth = auth;
    return this;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((auth == null) ? 0 : auth.hashCode());
    result = prime * result + ((token == null) ? 0 : token.hashCode());
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
    AuthenticateOperatorOutDto other = (AuthenticateOperatorOutDto) obj;
    if (auth == null) {
      if (other.auth != null) {
        return false;
      }
    } else if (!auth.equals(other.auth)) {
      return false;
    }
    if (token == null) {
      if (other.token != null) {
        return false;
      }
    } else if (!token.equals(other.token)) {
      return false;
    }
    return true;
  }

  public boolean isEmpty() {
    AuthenticateOperatorOutDto o = new AuthenticateOperatorOutDto();
    return o.equals(this);
  }

  @Override
  public String toString() {
    return "AuthenticateOperatorOutDto [token=" + token + ", auth=" + auth + "]";
  }

}
