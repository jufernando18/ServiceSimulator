package co.com.ies.service.dto.sub;

import javax.validation.constraints.NotBlank;

public class AuthDto {

  @NotBlank
  private String user;
  @NotBlank
  private String pass;

  public AuthDto() {
    super();
  }

  /**
   * .
   * @param user .
   * @param pass .
   */
  public AuthDto(String user, String pass) {
    super();
    this.user = user;
    this.pass = pass;
  }

  public String getUser() {
    return user;
  }

  public AuthDto setUser(String user) {
    this.user = user;
    return this;
  }

  public String getPass() {
    return pass;
  }

  public AuthDto setPass(String pass) {
    this.pass = pass;
    return this;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((pass == null) ? 0 : pass.hashCode());
    result = prime * result + ((user == null) ? 0 : user.hashCode());
    return result;
  }

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
    AuthDto other = (AuthDto) obj;
    if (pass == null) {
      if (other.pass != null) {
        return false;
      }
    } else if (!pass.equals(other.pass)) {
      return false;
    }
    if (user == null) {
      if (other.user != null) {
        return false;
      }
    } else if (!user.equals(other.user)) {
      return false;
    }
    return true;
  }

  public boolean isEmpty() {
    AuthDto o = new AuthDto();
    return o.equals(this);
  }

  @Override
  public String toString() {
    return "AuthDto [user=" + user + ", pass=" + pass + "]";
  }

}
