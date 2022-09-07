public class MyLinkedList {
  private Node head;
  private int size;

  public MyLinkedList() {
    head = null;
    size = 0;
  }

  public boolean isEmpty() {
    return this.size == 0;
  }

  public Node getFirst() {
    return this.head;
  }

  public void print() {
    if (head == null) {
      return;
    }
    Node temp = head;
    while (temp!= null) {
      System.out.print(temp.getElement() + " ");
      temp = temp.getNext();
    }
  }
  // addFirst

  public void addFirst(Fraction item) {
    head = new Node(item, head);
    size++;
  }

  // addAfter
  public void addAfter(Node curr, Fraction item) {
    if (curr == null) {
      addFirst(item);
      return;
    }
    Node newNode = new Node(item, curr.getNext());
    curr.setNext(newNode);
    size++;
  }

  // addLast
  public void addLast(Fraction item) {
    if (head == null) {
      addFirst(item);
      return;
    }
    Node tmp = head;
    while (tmp.getNext() != null) {
      tmp = tmp.getNext();
    }
    Node newNode = new Node(item, null);
    // System.out.println(newNode.getElement());
    tmp.setNext(newNode);
    size++;
  }

  public void removeFirst() {
    if (head == null) {
      return;
    }
    head = head.getNext();
    size--;
  }

  public void removeLast() {
    if (head == null) {
      return;
    }
    if (head.getNext() == null) {
      removeFirst();
      size--;
      return;
    }

    Node prev = null;
    Node curr = head;
    while (curr.getNext() != null) {
      prev = curr;
      curr = curr.getNext();
    }
    prev.setNext(curr.getNext());
    size--;

  }

  public void removeAfter(Node curr) {
    Node delNode = curr.getNext();
    if (head == null || curr == null || delNode == null) {
      return;
    }
    curr.setNext(delNode.getNext());
    size--;
  }
}