package chap_05;

public class _Quiz_05 {
  public static void main(String[] args) {
    int[] size = new int[10];
    int basicSize = 250;
    int increaseSize = 5;
    
    for (int i = 0; i < size.length; i++) {
      size[i] = basicSize + (i * increaseSize);
    }

    for (int i : size) {
      System.out.println("사이즈 " + String.valueOf(i) + "(재고 있음)");
    }

  }
}
