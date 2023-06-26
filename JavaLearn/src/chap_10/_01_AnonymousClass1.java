package chap_10;

public class _01_AnonymousClass1 {
  public static void main(String[] args) {
    // 익명 클래스
    Coffee c1 = new Coffee();
    c1.order("아메리카노");
    System.out.println("----------");
    Coffee c2 = new Coffee();
    c2.order("라떼");
    System.out.println("----------");


    // 굉장히 친한 친구 방문
    Coffee specialCoffee = new Coffee() {
      @Override
      public void order(String coffee) {
        super.order(coffee);
        System.out.println("(귓속말) 딸기 케이트는 서비스에요.");
      }
      @Override
      public void returnTray () {
        super.returnTray();
        System.out.println("(귓속말) 자리에 두면 제가 치울게요.");
      }
    };
    specialCoffee.order("아메리카노");
    specialCoffee.returnTray();
  }
}

class Coffee {
  public void order (String coffee) {
    System.out.println("주문하신 커피 " + coffee + " 나왔습니다.");
  }

  public void returnTray() {
    System.out.println("트레이 반납");
  }
}