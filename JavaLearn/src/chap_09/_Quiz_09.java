package chap_09;

import java.util.ArrayList;
import java.util.List;

import chap_09.student.Student;

public class _Quiz_09 {
  public static void main(String[] args) {
    List<Student> list = new ArrayList<>();
    list.add(new Student("유재석", "파이썬"));
    list.add(new Student("박명수", "자바"));
    list.add(new Student("김종국", "자바"));
    list.add(new Student("조세호", "C"));
    list.add(new Student("서장훈", "파이썬"));

    for (Student student : list) {
      System.out.println(student.getName());
    }

    System.out.println("----------");

    for (Student student : list) {
      if (student.getCertificate().contains("자바")) {
        System.out.println(student.getName());
      }
    }
  }
}
