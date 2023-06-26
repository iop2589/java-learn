package chap_10;

import chap_10.converter.Convertable;
import chap_10.converter.ConvertableWIthNoParameter;
import chap_10.converter.ConvertableWithTwoParameter;
import chap_10.converter.ConvetableWithReturn;
import chap_10.converter.KRWConverter;

public class _04_FuntionalInterface {
  public static void main(String[] args) {
    KRWConverter converter = new KRWConverter();
    // converter.convert(2);

    convertUSD((USD) -> System.out.println(USD + " 달러 = " + (USD * 1400) + " 원") , 1);

    // 함수형 인터페이스
    // 함수형 인터페이스를 사용하려면 인터페이스의 하나의 함수만 존재해야함.
    Convertable convertable = (USD) -> System.out.println(USD + " 달러 = " + (USD * 1400) + " 원");
    
    convertUSD(convertable, 2);

    // 전달값이 하나도 없다면?
    ConvertableWIthNoParameter c1 = () -> System.out.println("1 달러 = 1400원");
    c1.convert();

    // 두줄 이상의 코드가 있다면 ?
    c1 = () -> {
      int USD = 4;
      int KRW = 1400;
      System.out.println("환율 : " + USD * KRW);
    };

    c1.convert();

    ConvertableWithTwoParameter c2 = (d, w) -> System.out.println(d + " 달러 = " + (d * w) + " 원");
    c2.convert(4, 1500);

    ConvetableWithReturn c3 = (d, w) -> d * w;
    int result = c3.convert(20, 1400);
    System.out.println(result);
  }

  public static void convertUSD(Convertable converter, int USD) {
    converter.convert(USD);
  }
}
