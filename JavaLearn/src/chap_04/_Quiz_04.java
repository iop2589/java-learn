package chap_04;

public class _Quiz_04 {
  public static void main(String[] args) {
    boolean smallCar = false;
    boolean withDisabledPerson = false;
    int parkingHour = 9;
    int parkingMaxAmount = 30000;
    int hourAmount = 4000;
    int resultAmount = 0;

    resultAmount = hourAmount * parkingHour;
    
    if (resultAmount > parkingMaxAmount)
      resultAmount = parkingMaxAmount;

    if (smallCar || withDisabledPerson)
      resultAmount /= 2;

    System.out.println("주차요금은 " + resultAmount + " 입니다.");
    
  }
}
