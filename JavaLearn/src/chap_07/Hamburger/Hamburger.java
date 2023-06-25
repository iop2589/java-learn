package chap_07.Hamburger;

public class Hamburger {
  public String name;

  public Hamburger() {
    this.name = "햄버거";
  }

  protected Hamburger(String name) {
    this.name = name;
  }

  public void cook() {
    System.out.println("햄버거 재료 : ");
    System.out.println("+ 빵");
    System.out.println("+ 패티");
    System.out.println("+ 피클");
  }

}
