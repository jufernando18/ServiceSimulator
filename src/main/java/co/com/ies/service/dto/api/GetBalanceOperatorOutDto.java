package co.com.ies.service.dto.api;

import co.com.ies.service.dto.sub.AuthDto;

public class GetBalanceOperatorOutDto {

  private String token;
  private AuthDto auth;

  public GetBalanceOperatorOutDto() {
    super();
  }

  /**
   * .
   * @param token .
   * @param auth .
   */
  public GetBalanceOperatorOutDto(String token, AuthDto auth) {
    super();
    this.token = token;
    this.auth = auth;
  }

  public String getToken() {
    return token;
  }

  public GetBalanceOperatorOutDto setToken(String token) {
    this.token = token;
    return this;
  }

  public AuthDto getAuth() {
    return auth;
  }

  public GetBalanceOperatorOutDto setAuth(AuthDto auth) {
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
    GetBalanceOperatorOutDto other = (GetBalanceOperatorOutDto) obj;
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
    GetBalanceOperatorOutDto o = new GetBalanceOperatorOutDto();
    return o.equals(this);
  }

  @Override
  public String toString() {
    return "GetBalanceOperatorOutDto [token=" + token + ", auth=" + auth + "]";
  }

}
