package chap_09;

import java.util.Collections;
import java.util.LinkedList;

public class _05_LinkedList {
  public static void main(String[] args) {
    // 링크드 리스트
    LinkedList<String> list = new LinkedList<>();
    
    list.add("박성철");
    list.add("오혜원");
    list.add("박명수");
    list.add("강호동");

    System.out.println(list.get(0));
    System.out.println(list.get(1));
    System.out.println(list.get(2));
    System.out.println(list.get(3));

    System.out.println(list.getFirst());
    System.out.println(list.getLast());

    System.out.println("----------");

    // 데이터 추가
    list.addFirst("서장훈");

    for (String s : list) {
      System.out.println(s);
    }

    list.addLast("김희철");
    System.out.println();

    for (String s : list) {
      System.out.println(s);
    }

    System.out.println("학생 추가 전 : " + list.get(1));
    list.add(1, "김영철");
    System.out.println("학생 추가 후 : " + list.get(1));
    System.out.println("학생 추가 후 : " + list.get(2));
    System.out.println("----------");

    // 삭제
    System.out.println("남은 학생 수 (제외 전 : ) : " + list.size());
    list.remove(list.size() - 1);
    System.out.println("남은 학생 수 (제외 후 : ) : " + list.size());

    System.out.println("----------");



    // 처음 학생과 마지막 학생이 전학
    for (String s : list) {
      System.out.println(s);
    }
    System.out.println("남은 학생 수 (전학 전 : ) : " + list.size());
    list.removeFirst(); // 처음 데이터 삭제
    list.removeLast(); // 마지막 데이터 삭제
    for (String s : list) {
      System.out.println(s);
    }
    System.out.println("남은 학생 수 (전힉 후 : ) : " + list.size());
    System.out.println();

    System.out.println(list.get(0));
    list.set(0, "이수근");
    System.out.println(list.get(0));

    // 확인 
    System.out.println(list.indexOf("이수근"));
    if (list.contains("이수근")) {
      System.out.println("수강 신청 성공");
    } else {
      System.out.println("수강 신청 실패");
    }

    System.out.println("----------");
    // 전체 삭제
    list.clear();
    if (list.isEmpty()) {
      System.out.println("학생 수 : " + list.size());
      System.out.println("리스트가 비었습니다.");
    }

    list.add("박성철");
    list.add("오혜원");
    list.add("박명수");
    list.add("강호동");

    System.out.println("----------");

    Collections.sort(list);
    for (String s : list) {
      System.out.println(s);
    }
  }
}
