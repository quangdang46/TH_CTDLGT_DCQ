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
      System.out.print(current.getData() + " ");
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
    // giam size
    size--;
    return delNode.getData();
  }

  @Override
  public void addSortedList(E item, Node<E> curr) {
    // Node<E> newNode = new Node<E>(item);
    // if (curr == null) {
    //   curr = newNode;
    //   size++;
    //   return;
    // }
    
    // if (curr.getNext().compareTo(newNode) > 0) {
    //   newNode.setNext(curr.getNext());
    //   curr.setNext(newNode);
    //   size++;
    //   return;
    // }
    // addSortedList(item, curr.getNext());
    return;
  }

  public int countEven(Node<E> curr) {
    if (curr == null) {
      return 0;
    }
    return (int) curr.getData() % 2 == 0 ? 1 + countEven(curr.getNext()) : countEven(curr.getNext());
  }

  public int sumLinkedList(Node<E> curr) {
    if (curr == null) {
      return 0;
    }
    return (int) curr.getData() + sumLinkedList(curr.getNext());
  }

}
