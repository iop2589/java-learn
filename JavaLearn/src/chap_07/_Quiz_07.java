package chap_07;

import chap_07.Hamburger.CheeseBurger;
import chap_07.Hamburger.Hamburger;
import chap_07.Hamburger.ShrimpBurger;

public class _Quiz_07 {
  public static void main(String[] args) {
    Hamburger[] hamburgers = new Hamburger[3];
    hamburgers[0] = new Hamburger();
    hamburgers[1] = new CheeseBurger();
    hamburgers[2] = new ShrimpBurger();

    System.out.println("주문하신 메뉴를 만듭니다.");
    System.out.println("--------------");

    for (Hamburger hamburger : hamburgers) {
      System.out.println(hamburger.name + "를 만듭니다.");
      hamburger.cook();
      System.out.println("------------");
    }
    System.out.println("메뉴 준비가 완료 되었습니다.");
  }
}
