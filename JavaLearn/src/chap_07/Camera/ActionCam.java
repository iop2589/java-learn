package chap_07.Camera;

public final class ActionCam extends Camera {
  public final String lens; // = "광각렌즈";

  public ActionCam() {
    super("액션 카메라");
    lens = "광각렌즈";
  }

  public final void makeVideo () {
    System.out.println(this.name + ": " + this.lens + "로 찍어낸 멋진 비디오를 만듭니다.");
  }
}
