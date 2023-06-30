package chap_12;

public class _Quiz_12 {
  public static void main(String[] args) {
    Product product = new Product();
    Runnable packageA = () -> {
      System.out.println("----A 상품 패키징 시작----");
      for (int i = 1; i <= 5; i++) {
        product.productPackaging("A", i);
        try {
          Thread.sleep(1000);
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      }
      System.out.println("----A 상품 패키징 완료----");
    };

    Runnable packageB = () -> {
      System.out.println("----B 상품 패키징 시작----");
      for (int i = 1; i <= 5; i++) {
        product.productPackaging("B", i);
        try {
          Thread.sleep(1000);
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      }
      System.out.println("----B 상품 패키징 완료----");
    };

    Thread threadA = new Thread(packageA);
    Thread threadB = new Thread(packageB);

    threadA.start();
    threadB.start();

    while(threadA.isAlive() || threadB.isAlive()) {
      
    }
    // try {
    //   threadA.join();
    //   threadB.join();
    // } catch (InterruptedException e) {
    //   e.printStackTrace();
    // }

    Runnable packageSet = () -> {
      System.out.println("----Set 상품 패키징 시작----");
      for (int i = 1; i <= 5; i++) {
        product.productPackaging("세트", i);
        try {
          Thread.sleep(1000);
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      }
      System.out.println("----Set 상품 패키징 종료----");
    };

    Thread threadSet = new Thread(packageSet);
    threadSet.start();
  }
}

class Product {
  public void productPackaging (String productName, int number) {
    System.out.println(productName + " 상품 포장 " + number + "/5");
  }
}
