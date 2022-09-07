public class Node {
  private Fraction element;
  private Node next;

  public Node() {
    element = null;
    next = null;
  }

  public Node(Fraction item) {
    this.element = item;
    this.next = null;
  }

  public Node(Fraction element, Node next) {
    this.element = element;
    this.next = next;
  }

  public Fraction getElement() {
    return this.element;
  }

  public Node getNext() {
    return this.next;
  }

  public void setNext(Node next) {
    this.next = next;
  }
}
