package chap_06;

public class _Quiz_06 {
  public static String hiddenData (String data, int startIndex) {
    String tempChangeData = data.substring(startIndex);
    String changeData = "";
    for (int i = 0; i < (data.length() - startIndex); i++) {
      changeData += "*";
    }
    return data.replace(tempChangeData, changeData);
  }
  public static void main(String[] args) {
    System.out.println(hiddenData("박성철", 1));
    System.out.println(hiddenData("920919-1010023", 8));
    System.out.println(hiddenData("010-1234-4442", 9));
  }
}
