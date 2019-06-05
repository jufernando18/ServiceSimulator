package co.com.ies.service.dto.api;

import java.math.BigDecimal;

public class DebitAndCreditOperatorInDto {

  private String playerId;
  private BigDecimal totalBalance;
  private String token;
  private String platformTransactionId;
  private Integer hasError;
  private Integer errorId;
  private String errorDescription;

  public DebitAndCreditOperatorInDto() {
    super();
  }

  /**
   * .
   * @param playerId .
   * @param totalBalance .
   * @param token .
   * @param platformTransactionId .
   * @param hasError .
   * @param errorId .
   * @param errorDescription .
   */
  public DebitAndCreditOperatorInDto(String playerId, BigDecimal totalBalance, String token,
      String platformTransactionId, Integer hasError, Integer errorId, String errorDescription) {
    super();
    this.playerId = playerId;
    this.totalBalance = totalBalance;
    this.token = token;
    this.platformTransactionId = platformTransactionId;
    this.hasError = hasError;
    this.errorId = errorId;
    this.errorDescription = errorDescription;
  }

  public String getPlayerId() {
    return playerId;
  }

  public DebitAndCreditOperatorInDto setPlayerId(String playerId) {
    this.playerId = playerId;
    return this;
  }

  public BigDecimal getTotalBalance() {
    return totalBalance;
  }

  public DebitAndCreditOperatorInDto setTotalBalance(BigDecimal totalBalance) {
    this.totalBalance = totalBalance;
    return this;
  }

  public String getToken() {
    return token;
  }

  public DebitAndCreditOperatorInDto setToken(String token) {
    this.token = token;
    return this;
  }

  public String getPlatformTransactionId() {
    return platformTransactionId;
  }

  public DebitAndCreditOperatorInDto setPlatformTransactionId(String platformTransactionId) {
    this.platformTransactionId = platformTransactionId;
    return this;
  }

  public Integer getHasError() {
    return hasError;
  }

  public DebitAndCreditOperatorInDto setHasError(Integer hasError) {
    this.hasError = hasError;
    return this;
  }

  public Integer getErrorId() {
    return errorId;
  }

  public DebitAndCreditOperatorInDto setErrorId(Integer errorId) {
    this.errorId = errorId;
    return this;
  }

  public String getErrorDescription() {
    return errorDescription;
  }

  public DebitAndCreditOperatorInDto setErrorDescription(String errorDescription) {
    this.errorDescription = errorDescription;
    return this;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((errorDescription == null) ? 0 : errorDescription.hashCode());
    result = prime * result + ((errorId == null) ? 0 : errorId.hashCode());
    result = prime * result + ((hasError == null) ? 0 : hasError.hashCode());
    result =
        prime * result + ((platformTransactionId == null) ? 0 : platformTransactionId.hashCode());
    result = prime * result + ((playerId == null) ? 0 : playerId.hashCode());
    result = prime * result + ((token == null) ? 0 : token.hashCode());
    result = prime * result + ((totalBalance == null) ? 0 : totalBalance.hashCode());
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
    DebitAndCreditOperatorInDto other = (DebitAndCreditOperatorInDto) obj;
    if (errorDescription == null) {
      if (other.errorDescription != null) {
        return false;
      }
    } else if (!errorDescription.equals(other.errorDescription)) {
      return false;
    }
    if (errorId == null) {
      if (other.errorId != null) {
        return false;
      }
    } else if (!errorId.equals(other.errorId)) {
      return false;
    }
    if (hasError == null) {
      if (other.hasError != null) {
        return false;
      }
    } else if (!hasError.equals(other.hasError)) {
      return false;
    }
    if (platformTransactionId == null) {
      if (other.platformTransactionId != null) {
        return false;
      }
    } else if (!platformTransactionId.equals(other.platformTransactionId)) {
      return false;
    }
    if (playerId == null) {
      if (other.playerId != null) {
        return false;
      }
    } else if (!playerId.equals(other.playerId)) {
      return false;
    }
    if (token == null) {
      if (other.token != null) {
        return false;
      }
    } else if (!token.equals(other.token)) {
      return false;
    }
    if (totalBalance == null) {
      if (other.totalBalance != null) {
        return false;
      }
    } else if (!totalBalance.equals(other.totalBalance)) {
      return false;
    }
    return true;
  }

  public boolean isEmpty() {
    DebitAndCreditOperatorInDto o = new DebitAndCreditOperatorInDto();
    return o.equals(this);
  }

  @Override
  public String toString() {
    return "DebitAndCreditOperatorInDto [playerId=" + playerId + ", totalBalance=" + totalBalance
        + ", token=" + token + ", platformTransactionId=" + platformTransactionId + ", hasError="
        + hasError + ", errorId=" + errorId + ", errorDescription=" + errorDescription + "]";
  }

}
