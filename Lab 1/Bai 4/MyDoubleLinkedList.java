public class MyDoubleLinkedList {
  private int size;
  private DoubleNode head;

  public MyDoubleLinkedList() {
    this.size = 0;
    this.head = null;
  }

  public int size() {
    return size;
  }
  // add
  public void add(double value) {
    if (this.head == null) {
      this.head = new DoubleNode(value);
      size++;
      return;
    }
    head = new DoubleNode(value, head);
    size++;
  }

  // remove
  public void remove(double value) {
    if (this.head == null) {
      return;
    }
    if (this.head.getValue() == value) {
      this.head = this.head.getNext();
      size--;
      return;
    }
    DoubleNode current = this.head;
    while (current.getNext() != null) {
      if (current.getNext().getValue() == value) {
        current.setNext(current.getNext().getNext());
        size--;
        return;
      }
      current = current.getNext();
    }
  }

  // find
  public boolean find(double value) {
    if (this.head == null) {
      return false;
    }
    DoubleNode current = this.head;
    while (current != null) {
      if (current.getValue() == value) {
        return true;
      }
      current = current.getNext();
    }
    return false;
  }

  public void print() {
    if (this.head == null) {
      return;
    }
    DoubleNode current = this.head;
    while (current != null) {
      System.out.println(current+" ");
      current = current.getNext();
    }
  }
}
