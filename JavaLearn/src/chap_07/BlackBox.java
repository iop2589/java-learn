package chap_07;

public class BlackBox {
  String modelName; // 모덺명
  String resolution; // 해상도
  int price; // 가격
  String color; // 색상 - 인스턴스 변수
  static boolean canAutoReport = false; // 자동 신고 기능 - 클래스 변수
  int serialNumber; // 시리얼 번호

  static int count = 0; // 시리얼 번호 생성해주는 역할

  BlackBox() {
    System.out.println("기본생성자 호출");
    this.serialNumber = ++count;
    System.out.println("새로운 시리얼 넘버를 발급받았습니다 : " + this.serialNumber);
  }

  BlackBox (String modelName, String resolution, int price, String color) {
    this(); // 기본 생성자 호출

    System.out.println("사용자 정의 생성자 호출");
    this.modelName = modelName;
    this.resolution = resolution;
    this.price = price;
    this.color = color;
  }

  void autoReport() {
    if (canAutoReport) {
      System.out.println("충돌이 감지되어 자동으로 신고합니다.");
    }
    else {
      System.out.println("자동 신고 기능이 지원되지 않습니다.");
    }
  }

  void insertMemoryCard (int capacity) {
    System.out.println("메모리 카드가 삽입되었습니다.");
    System.out.println("용량은 " + capacity + " 입니다.");
  }

  int getVideoFileCount (int type) {
    if (type == 1) {
      return 9;
    }
    else if (type == 2) {
      return 1;
    }
    else {
      return 10;
    }
  }

  // showDateTime : 영상 날짜 정보 여부
  // showSpeed : 영상 속도 정보 여부
  // min : 표시 분수
  void record (boolean showDateTime, boolean showSpeed, int min) {
    System.out.println("녹화를 시작합니다.");
    if (showDateTime) {
       System.out.println("영상의 날짜 정보가 표시 됩니다.");
    }
    if (showSpeed) { 
      System.out.println("영상에 속도 정보가 표시됩니다.");
    }
    System.out.println("영상은 " + min + "분 단위로 표시됩니다.");
  }

  void record () {
    this.record(true, true, 5);
  }

  static void callServiceCenter () {
    System.out.println("서비스센터 (1588-1119) 로 연결 합니다.");
    canAutoReport = false;
  }


  String getModelName () {
    return modelName;
  }

  void setModelName (String modelName) {
    this.modelName = modelName;
  }

  String getResolution () {
    if (this.resolution == null || this.resolution.isEmpty()) {
      return "판매자에게 문의하세요.";
    } else {
      return this.resolution;
    }
  }

  int getPrice () {
    return this.price;
  }

  void setPrice (int price) {
    if (this.price < 100000) {
      this.price = 100000;
    } else {
      this.price = price;
    }
  }

  String getColor () {
    return this.color;
  }

  void setColor (String color) {
    this.color = color;

  }
}
