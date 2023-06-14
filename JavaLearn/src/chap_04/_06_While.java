package chap_04;

import java.util.jar.Manifest;

public class _06_While {
  public static void main(String[] args) {
    // 반복분 while
    int distance = 25; // 전체거리는 25m
    int move = 0; //현재 이동 거리 0m
    while (move < distance) { // 현재이동 거리가 전체 거리보다 작다는 조건이 참인 동안 반복 수행
      System.out.println("발차기를 계속합니다.");
      System.out.println("현재이동 거리 : " + move);
      move += 3;
    }
    System.out.println("도착하였습니다.");

    move = 0;
    while (move < distance) {
      System.out.println("발차기를 계속합니다.");
      System.out.println("현재이동 거리 : " + move);
    }
    System.out.println("도착하였습니다.");
  }
}
