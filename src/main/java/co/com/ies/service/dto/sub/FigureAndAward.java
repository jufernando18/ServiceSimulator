package co.com.ies.service.dto.sub;

public class FigureAndAward {

  private String figure;
  private String award;
  
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

  public String getAward() {
    return award;
  }

  public FigureAndAward setAward(String award) {
    this.award = award;
    return this;
  }

  
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((award == null) ? 0 : award.hashCode());
    result = prime * result + ((figure == null) ? 0 : figure.hashCode());
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
    if (award == null) {
      if (other.award != null)
        return false;
    } else if (!award.equals(other.award))
      return false;
    if (figure == null) {
      if (other.figure != null)
        return false;
    } else if (!figure.equals(other.figure))
      return false;
    return true;
  }

  @Override
  public String toString() {
    return "FigureAndAward [figure=" + figure + ", award=" + award + "]";
  }
  
  
}
