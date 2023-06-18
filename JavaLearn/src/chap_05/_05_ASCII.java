package chap_05;

public class _05_ASCII {
  public static void main(String[] args) {
    // 아스키 코드 (ANSI)
    char c = 'A';

    System.out.println(c);
    System.out.println((int)c);

    c = 'B';

    System.out.println(c);
    System.out.println((int)c);

    c = 'C';

    System.out.println(c);
    System.out.println((int)c);

    c++;


    System.out.println(c);
    System.out.println((int)c);


    String[][] seats3 = new String[10][15];
    // 아스키코드를 활용하여 A부터 J까지 출력.
    char ab = 'A';

    for (int i = 0; i < seats3.length; i++) {
      for (int j = 0; j < seats3[i].length; j++) {
        seats3[i][j] = ab + String.valueOf(j + 1);
      }
      ab++;
    }

    for (String[] seatss : seats3) {
      for (String seat3 : seatss) {
        System.out.print(seat3 + " ");
      }
      System.out.println();
    }
  }
}
