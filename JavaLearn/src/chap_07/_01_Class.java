package chap_07;

public class _01_Class {
  public static void main(String[] args) {
    // 객체 지향 프로그램 (OOP: OBject-Oriented Programming)
    // 유지보수 용이
    // 높은 재사용성

    // 차량용 블랙박스

    // 우리가 만든 첫번째 제품
    // 모델명, 해상도, 가격, 색상
    String modelName = "까망이";
    String resolution = "FHD";
    int price = 200000;
    String color = "블랙";

    // 새로운 제품을 개발
    String modelName2 = "하양이";
    String resolution2 = "UHD";
    int price2 = 300000;
    String color2 = "화이트";

    // 또 다른 제품을 개발 ?
    // 객체를 활용하여 생설
    BlackBox bBox = new BlackBox();
    bBox.modelName = "초록이";
    bBox.resolution = "UHD";
    bBox.price = 400000;
    bBox.color = "그린";
  }
}
