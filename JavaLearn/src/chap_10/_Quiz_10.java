package chap_10;

import java.util.ArrayList;
import java.util.List;
import chap_10.customer.Customer;

public class _Quiz_10 {
  public static void main(String[] args) {
    List<Customer> custList = new ArrayList<Customer>();

    Customer cust = new Customer();
    cust.setName("챈들러");
    cust.setAge(50);
    Customer cust1 = new Customer();
    cust1.setName("레이첼");
    cust1.setAge(42);
    Customer cust2 = new Customer();
    cust2.setName("모니카");
    cust2.setAge(21);
    Customer cust3 = new Customer();
    cust3.setName("벤자민");
    cust3.setAge(18);
    Customer cust4 = new Customer();
    cust4.setName("제임스");
    cust4.setAge(5);

    custList.add(cust);
    custList.add(cust1);
    custList.add(cust2);
    custList.add(cust3);
    custList.add(cust4);

    custList.stream().map(x -> x.getName() + "\t" + (x.getAge() < 20 ? "무료" : "5000원")).forEach(System.out::println);
  }
}
