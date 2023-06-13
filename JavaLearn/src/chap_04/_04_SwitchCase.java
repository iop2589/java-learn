package chap_04;

public class _04_SwitchCase {
  public static void main(String[] args) {
    // Switch Case

    // 석차에 따른 장학금 지급
    // 1등 : 전액 장학금
    // 2등 : 반액 장학금
    // 3등 : 반액 장학금
    // 그 외 : 장학금 대상 아님

    int ranking = 4;

    switch (ranking) {
      case 1:
        System.out.println("전액 장학금 지급");
        break;
      case 2:
      case 3:
        System.out.println("반액 장학금 지급");
        break;
      default:
        System.out.println("장학금 대상 아님");
    }
    System.out.println("조회 완료 #1");
  }
}
