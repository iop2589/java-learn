package chap_12;

import chap_12.clean.Room;

public class _05_Synchronization {
  public static void main(String[] args) {
    Room room = new Room();

    Runnable cleaner1 = new Runnable() {
      @Override
      public void run() {
        System.out.println("-- 직원1 청소 시작 (Runnalbe) --");
        for (int i = 1; i <= 5; i++) {
          room.clean("직원1");  

          try {
            Thread.sleep(1000);
          } catch (InterruptedException e) {
            e.printStackTrace();
          }

          if (i == 2) {
            throw new RuntimeException("못해먹겠당!!");
          }
        }
        System.out.println(" -- 직원1 청소 끝 (Runnalbe) --");
      }
    };

    Runnable cleaner2 = () -> {
      System.out.println("-- 직원2 청소 시작 (Runnalbe) --");
      for (int i = 1; i <= 5; i++) {
        room.clean("직원2");  
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
