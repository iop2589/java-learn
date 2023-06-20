package chap_06;

public class _08_MainMethod {
  public static void main(String[] args) {
    for (String string : args) {
      System.out.println(string);
    }

    if (args.length == 1) {
      switch (args[0]) {
        case "1":
          System.out.println("도서 조회 메뉴 입니다.");
          break;
        case "2":
          System.out.println("도서 대출 메뉴 입니다.");
          break;
        case "3":
          System.out.println("도서 반납 메뉴입니다.");
          break;
        default:
          System.out.println("메뉴가 없습니다.");
      }
    }
  }
}
