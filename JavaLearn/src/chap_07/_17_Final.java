package chap_07;

import chap_07.Camera.ActionCam;
import chap_07.Camera.SlowActionCam;

public class _17_Final {
  public static void main(String[] args) {
    // Final

    // public (final) class ..
    // public (final) void ..
    
    ActionCam actionCam = new ActionCam();
    actionCam.recordVideo();
    actionCam.makeVideo();

    actionCam.recordVideo();
    actionCam.makeVideo();


    SlowActionCam slowActionCam = new SlowActionCam();
    slowActionCam.makeVideo();
  }
}
