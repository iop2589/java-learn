package chap_02;

public class _Quiz_02 {
  public static void main(String[] args) {
    int height = 121;
    String possible = height >= 120 ? "탑승 가능합니다." : "탑승 불가능합니다.";
    System.out.println("키가 " + height + "cm 이므로 " + possible);
  }
}
