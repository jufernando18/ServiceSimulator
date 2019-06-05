package co.com.ies.service.dto.api;

import java.math.BigDecimal;

import co.com.ies.service.dto.sub.AuthDto;

public class DebitAndCreditOperatorOutDto {

  private String token;
  private BigDecimal debitAmount;
  private BigDecimal creditAmount;
  private String gameCode;
  private String playerId;
  private String currency;
  private String iesTransactionId;
  private String roundId;
  private AuthDto auth;

  public DebitAndCreditOperatorOutDto() {
    super();
  }

  public String getToken() {
    return token;
  }

  public DebitAndCreditOperatorOutDto setToken(String token) {
    this.token = token;
    return this;
  }

  public BigDecimal getDebitAmount() {
    return debitAmount;
  }

  public DebitAndCreditOperatorOutDto setDebitAmount(BigDecimal debitAmount) {
    this.debitAmount = debitAmount;
    return this;
  }

  public BigDecimal getCreditAmount() {
    return creditAmount;
  }

  public DebitAndCreditOperatorOutDto setCreditAmount(BigDecimal creditAmount) {
    this.creditAmount = creditAmount;
    return this;
  }

  public String getGameCode() {
    return gameCode;
  }

  public DebitAndCreditOperatorOutDto setGameCode(String gameCode) {
    this.gameCode = gameCode;
    return this;
  }

  public String getPlayerId() {
    return playerId;
  }

  public DebitAndCreditOperatorOutDto setPlayerId(String playerId) {
    this.playerId = playerId;
    return this;
  }

  public String getCurrency() {
    return currency;
  }

  public DebitAndCreditOperatorOutDto setCurrency(String currency) {
    this.currency = currency;
    return this;
  }

  public String getIesTransactionId() {
    return iesTransactionId;
  }

  public DebitAndCreditOperatorOutDto setIesTransactionId(String iesTransactionId) {
    this.iesTransactionId = iesTransactionId;
    return this;
  }

  public String getRoundId() {
    return roundId;
  }

  public DebitAndCreditOperatorOutDto setRoundId(String roundId) {
    this.roundId = roundId;
    return this;
  }

  public AuthDto getAuth() {
    return auth;
  }

  public DebitAndCreditOperatorOutDto setAuth(AuthDto auth) {
    this.auth = auth;
    return this;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((auth == null) ? 0 : auth.hashCode());
    result = prime * result + ((creditAmount == null) ? 0 : creditAmount.hashCode());
    result = prime * result + ((currency == null) ? 0 : currency.hashCode());
    result = prime * result + ((debitAmount == null) ? 0 : debitAmount.hashCode());
    result = prime * result + ((gameCode == null) ? 0 : gameCode.hashCode());
    result = prime * result + ((playerId == null) ? 0 : playerId.hashCode());
    result = prime * result + ((roundId == null) ? 0 : roundId.hashCode());
    result = prime * result + ((token == null) ? 0 : token.hashCode());
    result = prime * result + ((iesTransactionId == null) ? 0 : iesTransactionId.hashCode());
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
    DebitAndCreditOperatorOutDto other = (DebitAndCreditOperatorOutDto) obj;
    if (auth == null) {
      if (other.auth != null) {
        return false;
      }
    } else if (!auth.equals(other.auth)) {
      return false;
    }
    if (creditAmount == null) {
      if (other.creditAmount != null) {
        return false;
      }
    } else if (!creditAmount.equals(other.creditAmount)) {
      return false;
    }
    if (currency == null) {
      if (other.currency != null) {
        return false;
      }
    } else if (!currency.equals(other.currency)) {
      return false;
    }
    if (debitAmount == null) {
      if (other.debitAmount != null) {
        return false;
      }
    } else if (!debitAmount.equals(other.debitAmount)) {
      return false;
    }
    if (gameCode == null) {
      if (other.gameCode != null) {
        return false;
      }
    } else if (!gameCode.equals(other.gameCode)) {
      return false;
    }
    if (playerId == null) {
      if (other.playerId != null) {
        return false;
      }
    } else if (!playerId.equals(other.playerId)) {
      return false;
    }
    if (roundId == null) {
      if (other.roundId != null) {
        return false;
      }
    } else if (!roundId.equals(other.roundId)) {
      return false;
    }
    if (token == null) {
      if (other.token != null) {
        return false;
      }
    } else if (!token.equals(other.token)) {
      return false;
    }
    if (iesTransactionId == null) {
      if (other.iesTransactionId != null) {
        return false;
      }
    } else if (!iesTransactionId.equals(other.iesTransactionId)) {
      return false;
    }
    return true;
  }

  public boolean isEmpty() {
    DebitAndCreditOperatorOutDto o = new DebitAndCreditOperatorOutDto();
    return o.equals(this);
  }

  @Override
  public String toString() {
    return "DebitAndCreditOperatorOutDto [token=" + token + ", debitAmount=" + debitAmount
        + ", creditAmount=" + creditAmount + ", gameCode=" + gameCode + ", playerId=" + playerId
        + ", currency=" + currency + ", iesTransactionId=" + iesTransactionId + ", roundId="
        + roundId
        + ", auth=" + auth + "]";
  }

}
