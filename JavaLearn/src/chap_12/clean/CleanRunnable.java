package chap_12.clean;

public class CleanRunnable implements Runnable {
  public void run () {
    System.out.println("-- 직원 청소 시작 (Runnalbe) --");
    for (int i = 2; i <= 10; i+=2) {
      System.out.println("직원 " + i + "번 방 청소 중 (Runnalbe)");
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
    System.out.println(" -- 직원 청소 끝 (Runnalbe) --");
  }
}
