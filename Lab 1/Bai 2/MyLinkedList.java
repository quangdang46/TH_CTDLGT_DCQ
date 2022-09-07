public class MyLinkedList<E> implements ListInterface<E> {
  private Node<E> head;
  private int size;

  public boolean isEmpty() {
    return this.size == 0;
  }

  public Node<E> getFirst() {
    return this.head;
  }

  public void add(E data) {
    if (head == null) {
      head = new Node<E>(data);
      return;
    }
    head = new Node<E>(data, head);
    size++;
  }

  public Node<E> getByIndex(int index) {
    if (index < 0 || index >= size) {
      throw new IndexOutOfBoundsException();
    }
    Node<E> curr = head;
    for (int i = 0; i < index; i++) {
      curr = curr.getNext();
    }
    return curr;
  }
  
  public void print() {
    if (head == null) {
      return;
    }
    Node<E> current = head;
    while (current != null) {
      System.out.println(current.getData() + " ");
      current = current.getNext();
    }
  }

  @Override
  public E removeCurr(Node<E> curr) {
    // chuyen gia tri node hien tai cho node tiep theo
    curr.setData(curr.getNext().getData());
    // xoa node tiep theo
    Node<E> delNode = curr.getNext();
    curr.setNext(delNode.getNext());
    //giam size
    size--;
    return delNode.getData();
  }

}
