package chap_09;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class _08_Iterator {
  public static void main(String[] args) {
    // 이터레이터
    List<String> list = new ArrayList<>();
    list.add("유재석");
    list.add("(알수없음)");
    list.add("김종국");
    list.add("(알수없음)");
    list.add("강호동");
    list.add("(알수없음)");
    list.add("박명수");
    list.add("(알수없음)");
    list.add("조세호");

    for (String s : list) {
      System.out.println(s);
    }
    System.out.println("---------");


    Iterator<String> it = list.iterator();
    System.out.println(it.next());
    System.out.println(it.next());
    System.out.println(it.next());
    System.out.println(it.next());
    System.out.println("---------");

    it = list.iterator(); // 커서를 처음 위치로 이동
    while(it.hasNext()) {
      System.out.println(it.next());
    }
    System.out.println("---------");

    it = list.iterator();
    while(it.hasNext()) {
      String s = it.next();
      if (s.contains("(알수없음")) {
        it.remove();
      }
    }

    it = list.iterator(); // 커서를 처음 위치로 이동
    while(it.hasNext()) {
      System.out.println(it.next());
    }

    System.out.println("---------");

    HashSet<String> set = new HashSet<>();
    set.add("유재석");
    set.add("박명수");
    Iterator<String> itSet = set.iterator();

    while(itSet.hasNext()) {
      String s = itSet.next();
      System.out.println(s);
    }
    System.out.println("---------");

    HashMap<String, Integer> map = new HashMap<>();
    map.put("유재석", 10);
    map.put("박명수", 5);

    Iterator<String> itMapKey = map.keySet().iterator();
    while(itMapKey.hasNext()) {
      String s = itMapKey.next();
      System.out.println(s);
    }

    Iterator<Integer> itMapValue = map.values().iterator();
    while(itMapValue.hasNext()) {
      Integer i = itMapValue.next();
      System.out.println(i);
    }

    System.out.println("---------");

    Iterator<Map.Entry<String,Integer>> itMap = map.entrySet().iterator();
    while(itMap.hasNext()) {
      System.out.println(itMap.next());
    }
  }
}
