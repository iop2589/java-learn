package chap_09;

import chap_09.coffee.Coffee;
import chap_09.coffee.CoffeeByName;
import chap_09.coffee.CoffeeByNickname;
import chap_09.coffee.CoffeeByNumber;
import chap_09.coffee.CoffeeByUser;
import chap_09.user.User;
import chap_09.user.VipUser;

public class _02_GenericClass {
  public static void main(String[] args) {
    // 제네릭 클래스
    CoffeeByNumber c1 = new CoffeeByNumber(33);
    c1.ready();

    CoffeeByNickname c2 = new CoffeeByNickname("박성철");
    c2.ready();

    System.out.println("----------------");

    CoffeeByName c3 = new CoffeeByName("박명수");
    c3.ready();

    CoffeeByName c4 = new CoffeeByName(34);
    c4.ready();


    System.out.println("----------------");
    int c4Name = (int) c4.name;
    System.out.println("주문 고객 번호 : " + c4Name);

    String c3Name = (String) c3.name;
    System.out.println("주문 고객 이름 : " +  c3Name);

    // c4Name = (int) c3.name;  에러남.

    System.out.println("----------------");

    Coffee<Integer> c5 = new Coffee<Integer>(35);
    c5.ready();

    int c5name = c5.name;
    System.out.println(c5name);

    Coffee<String> c6 = new Coffee<String>("조세호");
    c6.ready();

    String c6name = c6.name;
    System.out.println(c6name);

    System.out.println("----------------");

    User user = new User("박성철");
    CoffeeByUser<User> coffeeByUser = new CoffeeByUser<User>(user);
    coffeeByUser.ready();

    User vipUser = new VipUser("박성철");

    CoffeeByUser<User> coffeeByUser2 = new CoffeeByUser<User>(vipUser);
    coffeeByUser2.ready();

    System.out.println("-------");
    orderCoffee("김영철");
    orderCoffee(36);
    orderCoffee("김희철", "아메리카노");
    orderCoffee(37, "라떼");
  }

  public static <T> void orderCoffee(T name) {
    System.out.println("커피 준비 완료 : " + name);
  }

  public static <T, V> void orderCoffee(T name, V coffee) {
    System.out.println("커피 준비 완료 : " + name);
    System.out.println("커피 메뉴 : " + coffee);
  }
}
