package chap_06;

import java.lang.reflect.Method;

public class _06_WhenToUse {

  public static int getPower(int number) {
    return getPower(number, 2);
  }

  public static int getPower(int number, int exponent) {
    int result = 1;
    for (int i = 0; i < exponent; i++) {
      result *= number;
    }
    return result;
  }
  public static void main(String[] args) {
    // 메소드를 사용하는 이유

    // 2의 2승을 구하기
    int result = getPower(2, 2);
    System.out.println(result);

    result = getPower(3, 3);
    System.out.println(result);

    result = getPower(4, 2);
    System.out.println(result);

    result = getPower(2);
    System.out.println(result);

    result = getPower(3);
    System.out.println(result);
  }
}
