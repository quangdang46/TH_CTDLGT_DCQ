public class DoubleNode {
  private double value;
  private DoubleNode next;

  public DoubleNode() {
    this.value = 0;
    this.next = null;
  }

  public DoubleNode(double value) {
    this.value = value;
    this.next = null;
  }
  public DoubleNode(double value, DoubleNode next) {
    this.value = value;
    this.next = next;
  }

  public double getValue() {
    return value;
  }

  public DoubleNode getNext() {
    return next;
  }

  public void setNext(DoubleNode next) {
    this.next = next;
  }
  @Override
  public String toString() {
    return Double.toString(value);
  }
}