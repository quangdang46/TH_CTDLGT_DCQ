public class MyLinkedList<E> {
  private Node<E> head;
  private int size;

  public MyLinkedList() {
    head = null;
    size = 0;
  }

  public boolean isEmpty() {
    return this.size == 0;
  }

  public E getFirst() {
    return this.head.getElement();
  }

  public void print() {
    if (head == null) {
      return;
    }
    Node<E> temp = head;
    while (temp != null) {
      System.out.print(temp.getElement() + " ");
      temp = temp.getNext();
    }
  }

  // addLast
  public void addLast(E item) {
    if (head == null) {
      Node<E> temp = new Node<E>(item);
      temp.setNext(head);
      head = temp;
      size++;
      return;
    }
    Node<E> tmp = head;
    while (tmp.getNext() != null) {
      tmp = tmp.getNext();
    }
    Node<E> newNode = new Node<E>(item);
    tmp.setNext(newNode);
    newNode.setNext(null);
    size++;
  }

  public void removeFirst() {
    if (head == null) {
      return;
    }
    head = head.getNext();
    size--;
  }

}