package co.com.ies.service.dto.sub;

import javax.validation.constraints.NotBlank;

public class FigureAndAward {

  @NotBlank
  private String figure;
  @NotBlank
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
  public String toString() {
    return "FigureAndAward [figure=" + figure + ", award=" + award + "]";
  }
  
  
}
