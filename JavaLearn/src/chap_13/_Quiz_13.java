package chap_13;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class _Quiz_13 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    try (BufferedReader br = new BufferedReader(new FileReader("./src/saying.txt"))) {
      while (true) {
        String quiz = br.readLine();
        if (quiz == null) {
          System.out.println("모든 퀴즈가 완료 되었습니다.");
          System.out.println("수고하셨습니다.");
          break;
        }

        System.out.printf("(문제) %s%n", quiz);
        String userAnwser = sc.nextLine();
        String anwser = br.readLine();

        if (userAnwser.equals(anwser)) {
          System.out.println("정답입니다!!!");
        } else {
          System.out.printf("틀렸습니다. 정답은 %s 입니다.%n", anwser);
        }

        System.out.println();
      }
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      sc.close();
    }
  }
}

