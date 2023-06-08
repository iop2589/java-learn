package chap_02;

public class _04_Operator4 {
  public static void main(String[] args) {
    // 논리연산자
    boolean kimchiJJigae = true;
    boolean GyeranMali = true;
    boolean JeyoukBokkeum = true;

    System.out.println(kimchiJJigae || GyeranMali || JeyoukBokkeum); // 하나라도 true이면 true (괜찮은 식당)
    System.out.println(kimchiJJigae && GyeranMali && JeyoukBokkeum); // 모두 true 이면 true (최고의 식당)

    // and 연산
    System.out.println((5 > 3) && (3 > 1)); // 5 는 3 보다 크고, 3은 1보다 크다 (true)
    System.out.println((5 > 3) && (3 < 1)); // 5 는 3 보다 크고, 3은 1보다 작다 (false)

    // or 연산
    System.out.println((5 > 3) || (3 > 1)); // 5 는 3 보다 크고, 3은 1보다 크다 (true)
    System.out.println((5 > 3) || (3 < 1)); // 5 는 3 보다 크고, 3은 1보다 작다 (true)
    System.out.println((5 < 3) || (3 < 1)); // 5 는 3 보다 작고, 3은 1보다 작다 (false)

    // 불가능한 연산
    // System.out.println(1 < 3 < 5);

    // 논리 부정 연산자
    System.out.println(!true); // false
    System.out.println(!false); // true
    System.out.println(!(5 == 5)); // false
    System.out.println(!(5 == 3)); // true
  }
}
