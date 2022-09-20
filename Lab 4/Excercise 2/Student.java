public class Student {
  private String name;
  private double mathematics, programming, DAS1;

  public Student() {

  }

  public Student(String name, double mathematics, double programming, double DAS1) {
    this.name = name;
    this.mathematics = mathematics;
    this.programming = programming;
    this.DAS1 = DAS1;
  }

  public double getAvg() {
    return (mathematics + programming + DAS1) / 3;
  }

  @Override
  public String toString() {
    return this.name + "_" + this.mathematics + "_" + this.programming + "_" + this.DAS1 + "_" + this.getAvg();
  }
}