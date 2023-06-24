package chap_07.Hamburger;


public class ShrimpBurger extends Hamburger {
  public ShrimpBurger () {
    super("새우버거");
  }
  @Override
  public void cook() {
    super.cook();
    System.out.println("+ 새우");
  }
}