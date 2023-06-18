package chap_06;

public class _03_Return {
  // 호텔 전화번호
  public static String getHotelNumber () {
    String hotelNumber = "02-000-0000";
    return hotelNumber;
  }

  // 호텔 주소
  public static String getHotelAddress () {
    String hotelAddress = "서울시 서대문구 서대문동 101-1";
    return hotelAddress;
  }

  // 호텔 액티비티
  public static String getHotelActivity () {
    String hotelActivity = "볼링장, 당구장, 노래방";
    return hotelActivity;
  }

  public static void main(String[] args) {
    // 반환 값, Return
    String hotelNumber = getHotelNumber();
    System.out.println(hotelNumber);

    String hotelAddress = getHotelAddress();
    System.out.println(hotelAddress);

    String hotelActivity = getHotelActivity();
    System.out.println(hotelActivity);
  }
}
