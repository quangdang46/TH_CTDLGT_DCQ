public class Node<E> {
  private E element;
  private Node<E> next;

  public Node() {
    element = null;
    next = null;
  }

  public Node(E item) {
    this.element = item;
    this.next = null;
  }



  public E getElement() {
    return this.element;
  }

  public Node<E> getNext() {
    return this.next;
  }

  public void setNext(Node<E> next) {
    this.next = next;
  }
}
