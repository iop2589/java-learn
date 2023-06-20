package chap_06;

public class _05_Overloading {
  public static int getPower(int number) {
    int result = number * number;
    return result;
  }

  public static int getPower (String strNumber) {
    int number = Integer.parseInt(strNumber);
    return number * number;
  }

  public static int getPower (int number, int exponent) {
    int result = 1;
    for (int i = 0; i < exponent; i++) {
      result *= number;
    }
    return result;
  }

  public static void main(String[] args) {
    // 메소드 오버로딩
    // 같은 이름의 메소도를 여러번 선언하는 것
    // 1. 전달 값의 타입이 다르거나
    // 2. 전달 값의 개수가 다르면 가능.
    int returnValue = getPower(3);
    System.out.println(returnValue);

    returnValue = getPower("4");
    System.out.println(returnValue);

    returnValue = getPower(3, 3);
    System.out.println(returnValue);
  }
}
