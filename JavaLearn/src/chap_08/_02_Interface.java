package chap_08;

import chap_08.camera.FactoryCam;
import chap_08.detector.AdvancedFIreDetector;
import chap_08.detector.Detectable;
import chap_08.detector.FireDitertor;
import chap_08.reporter.NormalReporter;
import chap_08.reporter.Reportable;
import chap_08.reporter.VideoReporter;

public class _02_Interface {
  public static void main(String[] args) {
    // 인터페이스
    Reportable normalReporter = new NormalReporter();
    normalReporter.report();

    Reportable videoReporter = new VideoReporter();
    videoReporter.report();


    Detectable fireDetector = new FireDitertor();
    fireDetector.detect();

    Detectable advancedFireDetectable = new AdvancedFIreDetector();
    advancedFireDetectable.detect();

    System.out.println("------------");


    FactoryCam factoryCam = new FactoryCam();
    factoryCam.setDetector(fireDetector);
    factoryCam.setReporter(normalReporter);

    factoryCam.detect();
    factoryCam.report();

    factoryCam.setDetector(advancedFireDetectable);
    factoryCam.setReporter(videoReporter);

    factoryCam.detect();
    factoryCam.report();
  }
}
