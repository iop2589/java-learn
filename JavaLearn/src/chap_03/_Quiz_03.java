package chap_03;

import javax.print.attribute.standard.MediaName;

public class _Quiz_03 {
  public static void main(String[] args) {
    String juminNo = "030401-4234234";

    System.out.println(juminNo.substring(0, juminNo.indexOf("-") + 2));
  }
}
