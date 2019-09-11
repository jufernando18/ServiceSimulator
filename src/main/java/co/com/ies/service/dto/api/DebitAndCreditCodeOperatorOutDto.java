package co.com.ies.service.dto.api;

import java.math.BigDecimal;

import co.com.ies.service.dto.sub.AuthDto;

public class DebitAndCreditCodeOperatorOutDto {

  private String token;
  private String code;
  private String gameCode;
  private String playerId;
  private String currency;
  private String iesTransactionId;
  private String roundId;
  private AuthDto auth;

  public DebitAndCreditCodeOperatorOutDto() {
    super();
  }

  public String getToken() {
    return token;
  }

  public DebitAndCreditCodeOperatorOutDto setToken(String token) {
    this.token = token;
    return this;
  }

  public String getGameCode() {
    return gameCode;
  }

  public DebitAndCreditCodeOperatorOutDto setGameCode(String gameCode) {
    this.gameCode = gameCode;
    return this;
  }

  public String getPlayerId() {
    return playerId;
  }

  public DebitAndCreditCodeOperatorOutDto setPlayerId(String playerId) {
    this.playerId = playerId;
    return this;
  }

  public String getCurrency() {
    return currency;
  }

  public DebitAndCreditCodeOperatorOutDto setCurrency(String currency) {
    this.currency = currency;
    return this;
  }

  public String getIesTransactionId() {
    return iesTransactionId;
  }

  public DebitAndCreditCodeOperatorOutDto setIesTransactionId(String iesTransactionId) {
    this.iesTransactionId = iesTransactionId;
    return this;
  }

  public String getRoundId() {
    return roundId;
  }

  public DebitAndCreditCodeOperatorOutDto setRoundId(String roundId) {
    this.roundId = roundId;
    return this;
  }

  public AuthDto getAuth() {
    return auth;
  }

  public DebitAndCreditCodeOperatorOutDto setAuth(AuthDto auth) {
    this.auth = auth;
    return this;
  }


  public boolean isEmpty() {
    DebitAndCreditCodeOperatorOutDto o = new DebitAndCreditCodeOperatorOutDto();
    return o.equals(this);
  }

    public String getCode() {
        return code;
    }

    public DebitAndCreditCodeOperatorOutDto setCode(String code) {
        this.code = code;
        return this;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((auth == null) ? 0 : auth.hashCode());
        result = prime * result + ((code == null) ? 0 : code.hashCode());
        result = prime * result + ((currency == null) ? 0 : currency.hashCode());
        result = prime * result + ((gameCode == null) ? 0 : gameCode.hashCode());
        result = prime * result + ((iesTransactionId == null) ? 0 : iesTransactionId.hashCode());
        result = prime * result + ((playerId == null) ? 0 : playerId.hashCode());
        result = prime * result + ((roundId == null) ? 0 : roundId.hashCode());
        result = prime * result + ((token == null) ? 0 : token.hashCode());
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
        DebitAndCreditCodeOperatorOutDto other = (DebitAndCreditCodeOperatorOutDto) obj;
        if (auth == null) {
            if (other.auth != null)
                return false;
        } else if (!auth.equals(other.auth))
            return false;
        if (code == null) {
            if (other.code != null)
                return false;
        } else if (!code.equals(other.code))
            return false;
        if (currency == null) {
            if (other.currency != null)
                return false;
        } else if (!currency.equals(other.currency))
            return false;
        if (gameCode == null) {
            if (other.gameCode != null)
                return false;
        } else if (!gameCode.equals(other.gameCode))
            return false;
        if (iesTransactionId == null) {
            if (other.iesTransactionId != null)
                return false;
        } else if (!iesTransactionId.equals(other.iesTransactionId))
            return false;
        if (playerId == null) {
            if (other.playerId != null)
                return false;
        } else if (!playerId.equals(other.playerId))
            return false;
        if (roundId == null) {
            if (other.roundId != null)
                return false;
        } else if (!roundId.equals(other.roundId))
            return false;
        if (token == null) {
            if (other.token != null)
                return false;
        } else if (!token.equals(other.token))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "DebitAndCreditCodeOperatorOutDto [auth=" + auth + ", code=" + code + ", currency=" + currency
                + ", gameCode=" + gameCode + ", iesTransactionId=" + iesTransactionId + ", playerId=" + playerId
                + ", roundId=" + roundId + ", token=" + token + "]";
    }

}
