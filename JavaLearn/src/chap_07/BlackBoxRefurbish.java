package chap_07;

public class BlackBoxRefurbish {
  public String modelName; // 모덺명
  String resolution; // 해상도
  private int price; // 가격
  protected String color; // 색상 - 인스턴스 변수

  public String getModelName() {
    return this.modelName;
  }

  public void setModelName(String modelName) {
    this.modelName = modelName;
  }

  public String getResolution() {
    if (this.resolution == null || this.resolution.isEmpty()) {
      return "판매자에게 문의하세요.";
    } else {
      return this.resolution;
    }
  }

  public void setResolution(String resolution) {
    this.resolution = resolution;
  }

  public int getPrice() {
    return this.price;
  }

  public void setPrice(int price) {
    if (price < 100000) {
      this.price = 100000;
    } else {
      this.price = price;
    }
  }

  public String getColor() {
    return this.color;
  }

  public void setColor(String color) {
    this.color = color;
  }


  
}
