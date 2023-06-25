package chap_07.Camera;

public class SpeedCam extends Camera { // 자식클래스 
  public SpeedCam() {
    super("과속 단속 카메라");
  }

  public void takePicture () { 
    //사진 촬용
    super.takePicture();
    this.checkSpeed();
    this.recognizeLicensePlate();
  }

  public void checkSpeed()
  {
    // 속도체크
    System.out.println("속도를 측정 합니다.");
  }
  
  public void recognizeLicensePlate() { 
    // 번호 인식
    System.out.println("차량 번호를 인식 합니다.");
  }

  @Override
  public void showMainFeature() {
    System.out.println(this.name + "의 주요 기능 : 속도 측정, 번호 인식");
  }
}
