package co.com.ies.service.dto.api;

import java.math.BigDecimal;

public class GetBalanceOperatorInDto {

  private String playerId;
  private String token;
  private BigDecimal totalBalance;
  private Integer hasError;
  private Integer errorId;
  private String errorDescription;

  public GetBalanceOperatorInDto() {
    super();
  }

  /**
   * .
   * @param playerId .
   * @param token .
   * @param totalBalance .
   * @param hasError .
   * @param errorId .
   * @param errorDescription .
   */
  public GetBalanceOperatorInDto(String playerId, String token, BigDecimal totalBalance,
      Integer hasError, Integer errorId, String errorDescription) {
    super();
    this.playerId = playerId;
    this.token = token;
    this.totalBalance = totalBalance;
    this.hasError = hasError;
    this.errorId = errorId;
    this.errorDescription = errorDescription;
  }

  public String getPlayerId() {
    return playerId;
  }

  public GetBalanceOperatorInDto setPlayerId(String playerId) {
    this.playerId = playerId;
    return this;
  }

  public String getToken() {
    return token;
  }

  public GetBalanceOperatorInDto setToken(String token) {
    this.token = token;
    return this;
  }

  public BigDecimal getTotalBalance() {
    return totalBalance;
  }

  public GetBalanceOperatorInDto setTotalBalance(BigDecimal totalBalance) {
    this.totalBalance = totalBalance;
    return this;
  }

  public Integer getHasError() {
    return hasError;
  }

  public GetBalanceOperatorInDto setHasError(Integer hasError) {
    this.hasError = hasError;
    return this;
  }

  public Integer getErrorId() {
    return errorId;
  }

  public GetBalanceOperatorInDto setErrorId(Integer errorId) {
    this.errorId = errorId;
    return this;
  }

  public String getErrorDescription() {
    return errorDescription;
  }

  public GetBalanceOperatorInDto setErrorDescription(String errorDescription) {
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
    GetBalanceOperatorInDto other = (GetBalanceOperatorInDto) obj;
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
    GetBalanceOperatorInDto o = new GetBalanceOperatorInDto();
    return o.equals(this);
  }

  @Override
  public String toString() {
    return "GetBalanceOperatorInDto [playerId=" + playerId + ", token=" + token + ", totalBalance="
        + totalBalance + ", hasError=" + hasError + ", errorId=" + errorId + ", errorDescription="
        + errorDescription + "]";
  }

}
