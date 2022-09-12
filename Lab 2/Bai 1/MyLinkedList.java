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

  public void addFirst(E item) {
    head = new Node<E>(item, head);
    size++;
  }

  public void removeFirst() {
    if (head == null) {
      return;
    }
    head = head.getNext();
    size--;
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

}