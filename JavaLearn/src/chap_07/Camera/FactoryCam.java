package chap_07.Camera;

public class FactoryCam extends Camera { // 자식 클래스
  public FactoryCam () {
    super("공장 카메라");
  }

  public void recordVideo () {
    //동영상 녹화
    super.recordVideo();
    this.detectedFire();
  }
  public void detectedFire () {
    //화재 감지
    System.out.println("화재를 감지합니다.");
  }

  @Override
  public void showMainFeature () {
    System.out.println(this.name + "의 주요 기능 : 화재 감지");
  }
}
