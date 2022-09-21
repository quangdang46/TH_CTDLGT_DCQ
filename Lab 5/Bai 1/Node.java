public class Node {
  private int data;
  private Node next;

  public Node(int data, Node next) {
    this.data = data;
    this.next = next;
  }

  public Node() {
    this(0, null);
  }

  public int getData() {
    return this.data;
  }

  public void setNext(Node next) {
    this.next = next;
  }

  public Node getNext() {
    return this.next;
  }

}