package co.com.ies.service.dto.api;

import co.com.ies.service.dto.sub.AuthDto;

public class RollbackOperatorOutDto {

  private String iesTransactionId;
  private String iesRelatedTransactionId;
  private String playerId;
  private AuthDto auth;

  public RollbackOperatorOutDto() {
    super();
  }

  /**
   * .
   * @param iesTransactionId .
   * @param iesRelatedTransactionId .
   * @param playerId .
   * @param auth .
   */
  public RollbackOperatorOutDto(String iesTransactionId, String iesRelatedTransactionId,
      String playerId, AuthDto auth) {
    super();
    this.iesTransactionId = iesTransactionId;
    this.iesRelatedTransactionId = iesRelatedTransactionId;
    this.playerId = playerId;
    this.auth = auth;
  }

  public String getIesTransactionId() {
    return iesTransactionId;
  }

  public RollbackOperatorOutDto setIesTransactionId(String iesTransactionId) {
    this.iesTransactionId = iesTransactionId;
    return this;
  }

  public String getIesRelatedTransactionId() {
    return iesRelatedTransactionId;
  }

  public RollbackOperatorOutDto setIesRelatedTransactionId(String iesRelatedTransactionId) {
    this.iesRelatedTransactionId = iesRelatedTransactionId;
    return this;
  }

  public String getPlayerId() {
    return playerId;
  }

  public RollbackOperatorOutDto setPlayerId(String playerId) {
    this.playerId = playerId;
    return this;
  }

  public AuthDto getAuth() {
    return auth;
  }

  public RollbackOperatorOutDto setAuth(AuthDto auth) {
    this.auth = auth;
    return this;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((auth == null) ? 0 : auth.hashCode());
    result = prime * result
        + ((iesRelatedTransactionId == null) ? 0 : iesRelatedTransactionId.hashCode());
    result = prime * result + ((iesTransactionId == null) ? 0 : iesTransactionId.hashCode());
    result = prime * result + ((playerId == null) ? 0 : playerId.hashCode());
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
    RollbackOperatorOutDto other = (RollbackOperatorOutDto) obj;
    if (auth == null) {
      if (other.auth != null) {
        return false;
      }
    } else if (!auth.equals(other.auth)) {
      return false;
    }
    if (iesRelatedTransactionId == null) {
      if (other.iesRelatedTransactionId != null) {
        return false;
      }
    } else if (!iesRelatedTransactionId.equals(other.iesRelatedTransactionId)) {
      return false;
    }
    if (iesTransactionId == null) {
      if (other.iesTransactionId != null) {
        return false;
      }
    } else if (!iesTransactionId.equals(other.iesTransactionId)) {
      return false;
    }
    if (playerId == null) {
      if (other.playerId != null) {
        return false;
      }
    } else if (!playerId.equals(other.playerId)) {
      return false;
    }
    return true;
  }

  public boolean isEmpty() {
    RollbackOperatorOutDto o = new RollbackOperatorOutDto();
    return o.equals(this);
  }

  @Override
  public String toString() {
    return "RollbackOperatorOutDto [iesTransactionId=" + iesTransactionId
        + ", iesRelatedTransactionId=" + iesRelatedTransactionId + ", playerId=" + playerId
        + ", auth=" + auth + "]";
  }

}
