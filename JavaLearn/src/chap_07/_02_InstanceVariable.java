package chap_07;

public class _02_InstanceVariable {
  public static void main(String[] args) {
      // 객체 - 인스턴스
      // 객체를 활용하여 생설
      // 처음 만든 블랙박스
      BlackBox bBox = new BlackBox();
      bBox.modelName = "까망이";
      bBox.resolution = "FHD";
      bBox.price = 200000;
      bBox.color = "블랙";

      System.out.println(bBox.modelName);
      System.out.println(bBox.resolution);
      System.out.println(bBox.price);
      System.out.println(bBox.color);

       // 새로 개발한 블랙박스
      BlackBox bBox1 = new BlackBox();
      bBox1.modelName = "초록이";
      bBox1.resolution = "UHD";
      bBox1.price = 400000;
      bBox1.color = "그린";

      System.out.println(bBox1.modelName);
      System.out.println(bBox1.resolution);
      System.out.println(bBox1.price);
      System.out.println(bBox1.color);

  }
}
