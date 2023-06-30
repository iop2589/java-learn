package chap_12;

public class _04_MultiThread {
  public static void main(String[] args) {
    Runnable cleaner1 = new Runnable() {
      @Override
      public void run() {
        System.out.println("-- 직원1 청소 시작 (Runnalbe) --");
        for (int i = 2; i <= 10; i+=2) {
          System.out.println("직원1 " + i + "번 방 청소 중 (Runnalbe)");
          try {
            Thread.sleep(1000);
          } catch (InterruptedException e) {
            e.printStackTrace();
          }
        }
        System.out.println(" -- 직원1 청소 끝 (Runnalbe) --");
      }
    };

    Runnable cleaner2 = () -> {
      System.out.println("-- 직원2 청소 시작 (Runnalbe) --");
      for (int i = 2; i <= 10; i+=2) {
        System.out.println("직원2 " + i + "번 방 청소 중 (Runnalbe)");
        try {
          Thread.sleep(1000);
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      }
      System.out.println(" -- 직원2 청소 끝 (Runnalbe) --");
    };

    Thread cleanerThread1 = new Thread(cleaner1);
    Thread cleanerThread2 = new Thread(cleaner2);

    cleanerThread1.start();
    cleanerThread2.start();
  }
}