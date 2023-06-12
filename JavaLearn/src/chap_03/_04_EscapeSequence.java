package chap_03;

public class _04_EscapeSequence {
  public static void main(String[] args) {
    // 특수문자, Escape Sequence, Escape Character, Special Character
    // \n \t \\ \" \'
    System.out.println("자바가");
    System.out.println("너무");
    System.out.println("재밌어요");

    // \n : 줄바꿈
    System.out.println("자바가\n너무\n재밌어요");

    // 해물파전이 9,000원
    // 김치전   8,000원
    // 부추전   8,000원
    // \t : 탭
    System.out.println("해물파전\t\t9,000원");
    System.out.println("김치전\t\t8,000원");
    System.out.println("부추전\t\t8,000원");

    // \\ : 역슬래시 표시
    System.out.println("C:\\Program Files\\Java");

    // \" : 큰따옴표 표시
    System.out.println("단비가 \"냐옹\" 이라고 했어요.");

    // \' : 작은 따옴표 표시
    System.out.println("단비가 \'뭘 봐?\' 라는 표정을 지었어요.");
    System.out.println("단비가 '뭘 봐?' 라는 표정을 지었어요.");

    char c = 'a';
    c = '\'';
    System.out.println(c);
  }
}
