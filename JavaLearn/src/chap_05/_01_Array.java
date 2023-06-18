package chap_05;

public class _01_Array {
  public static void main(String[] args) {
    // 배열 : 같은 자료형의 값 여러 개를 저장하는 연속된 공가
    String coffeeRoss = "아메리카노";
    String coffeeRachel = "카페모카";
    String coffeeChandler = "라떼";
    String coffeeMonica = "카푸치노";

    System.out.println(coffeeRoss + "하나");
    System.out.println(coffeeRachel + "하나");
    System.out.println(coffeeChandler + "하나");
    System.out.println(coffeeMonica + "하나");
    System.out.println("주세요");

    // 배열 선언 첫번째 방법
    // String[] coffees = new String[4];
    // coffees[0] = "아메리카노"; // 0부터 시작
    // coffees[1] = "카페모카";
    // coffees[2] = "라떼";
    // coffees[3] = "카푸치노";

    // 배열 선언 두번째 방법
    //String[] coffees = new String[] {"아메리카노", "카페모카", "라떼", "카푸치노"};
    
    // 배열 선언 세번째 방법
    String[] coffees = {"아메리카노", "카페모카", "라떼", "카푸치노"};

    System.out.println("-------------------------------------");

    for (String coffee : coffees) {
      System.out.println(coffee + "하나");
    }
    System.out.println("주세요");


    int[] i = new int[3];    
    i[0] = 1;
    i[1] = 2;
    i[2] = 3;
    
    double d[] = new double[]{1.1, 1.2, 1.3};

    boolean[] b = new boolean[1];
    b[0] = true;
  }
}