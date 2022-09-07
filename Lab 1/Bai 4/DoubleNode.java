public class DoubleNode {
  private Node head;
  private int size;

  public DoubleNode() {
    head = null;
    size = 0;
  }

  // addFirst
  public void addFirst(int data) {
    if (head == null) {
      head = new Node(data);
    }
    Node newNode = new Node(data);
    newNode.setNext(head);
    head.setPrev(newNode);
    head = newNode;
    size++;
  }

  // remove
  public void remove(int data) {
    if (head == null) {
      return;
    }
    if (head.getValue() == data) {
      head = head.getNext();
      head.setPrev(null);
      size--;
      return;
    }
    Node current = head;
    while (current.getNext() != null) {
      if (current.getNext().getValue() == data) {
        current.setNext(current.getNext().getNext());
        if (current.getNext() != null) {
          current.getNext().setPrev(current);
        }
        size--;
        return;
      }
      current = current.getNext();
    }
  }

  // find
  public boolean find(int data) {
    if (head == null) {
      return false;
    }
    Node current = head;
    while (current != null) {
      if (current.getValue() == data) {
        return true;
      }
      current = current.getNext();
    }
    return false;
  }

  public void print() {
    if (head == null) {
      return;
    }
    Node current = head;
    while (current != null) {
      System.out.print(current.getValue() + " ");
      current = current.getNext();
    }
    System.out.println();
  }
}
