public class Fraction {
  // tu so
  private int number = 0;
  // mau so
  private int denom = 1;

  public Fraction() {

  }

  public Fraction(int number, int denom) {
    this.number = number;
    this.denom = denom == 0 ? 1 : denom;
  }

  public Fraction(Fraction f) {
    this.number = f.number;
    this.denom = f.denom;
  }

  @Override
  public String toString() {
    return number + "/" + denom;
  }

  @Override
  public boolean equals(Object f) {
    if (f instanceof Fraction) {
      Fraction f1 = (Fraction) f;
      return (this.number * f1.denom == this.denom * f1.number);
    }
    return false;
  }
}