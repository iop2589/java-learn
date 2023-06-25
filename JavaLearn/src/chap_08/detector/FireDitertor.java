package chap_08.detector;

public class FireDitertor implements Detectable {

  @Override
  public void detect() {
    System.out.println("일반 화재를 감지 합니다.");
  }
  
}
