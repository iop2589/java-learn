package chap_09.coffee;

import chap_09.user.User;

public class CoffeeByUser <T extends User> {
  T user;

  public CoffeeByUser(T user) {
    this.user = user;
  }

  public void ready() {
    System.out.println(this.user.name + ": 커피 준비 완료 되었습니다.");
    user.addPoint();
  }
}
