package chap_08.camera;

import chap_08.detector.Detectable;
import chap_08.reporter.Reportable;

public class SpeedCam extends Camera implements Detectable, Reportable {

  private Detectable detector;
  private Reportable reporter;

  public void setReporter (Reportable reporter) {
    this.reporter = reporter;
  }

  public void setDetector (Detectable detector) {
    this.detector = detector;
  }

  @Override
  public void showMainFeature() {
    System.out.println("속도 및 차량번호 감지");
  }

  public void detect() {
    detector.detect();
  }

  public void report() {
    reporter.report();
  }
  
}
