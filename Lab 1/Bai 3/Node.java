public class Node {
  private int value;
  private Node next;

  public Node() {
    this.value = 0;
    this.next = null;
  }

  public Node(int value) {
    this.value = value;
    this.next = null;
  }

  public Node(int value, Node next) {
    this.value = value;
    this.next = next;
  }

  public int getValue() {
    return this.value;
  }
  public void setValue(int value) {
    this.value = value;
  }

  public Node getNext() {
    return this.next;
  }

  public void setNext(Node next) {
    this.next = next;
  }

  @Override
  public String toString() {
    return Integer.toString(this.value);
  }

}