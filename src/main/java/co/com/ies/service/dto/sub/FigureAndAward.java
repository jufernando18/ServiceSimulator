package co.com.ies.service.dto.sub;

public class FigureAndAward {

  private String figure;
  private String guaranteed;
  private String percentage;
  
  public FigureAndAward() {
    super();
  }

  public String getFigure() {
    return figure;
  }

  public FigureAndAward setFigure(String figure) {
    this.figure = figure;
    return this;
  }

  public String getGuaranteed() {
    return guaranteed;
  }

  public FigureAndAward setGuaranteed(String guaranteed) {
    this.guaranteed = guaranteed;
    return this;
  }

  public String getPercentage() {
    return percentage;
  }

  public FigureAndAward setPercentage(String percentage) {
    this.percentage = percentage;
    return this;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((figure == null) ? 0 : figure.hashCode());
    result = prime * result + ((guaranteed == null) ? 0 : guaranteed.hashCode());
    result = prime * result + ((percentage == null) ? 0 : percentage.hashCode());
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
    FigureAndAward other = (FigureAndAward) obj;
    if (figure == null) {
      if (other.figure != null)
        return false;
    } else if (!figure.equals(other.figure))
      return false;
    if (guaranteed == null) {
      if (other.guaranteed != null)
        return false;
    } else if (!guaranteed.equals(other.guaranteed))
      return false;
    if (percentage == null) {
      if (other.percentage != null)
        return false;
    } else if (!percentage.equals(other.percentage))
      return false;
    return true;
  }

  @Override
  public String toString() {
    return "FigureAndAward [figure=" + figure + ", guaranteed=" + guaranteed + ", percentage=" + percentage + "]";
  }


  
}
