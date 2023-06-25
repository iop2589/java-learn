package chap_09.student;

public class Student {
  private String name;
  private String certificate;

  public Student(String name, String certificate) {
    this.name = name;
    this.certificate = certificate;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getCertificate() {
    return this.certificate;
  }

  public void setCertificate(String certificate) {
    this.certificate = certificate;
  }

}
