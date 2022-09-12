public class MyStack<E> {
  private MyLinkedList<E> list;

  public MyStack() {
    list = new MyLinkedList<E>();
  }

  // empty
  public boolean isEmpty() {
    return list.isEmpty();
  }

  // peek
  public E peek() {
    if (isEmpty()) {
      return null;
    }
    return list.getFirst();
  }

  // pop
  public E pop() {
    if (isEmpty()) {
      return null;
    }
    E temp = peek();
    list.removeFirst();
    return temp;
  }

  // push
  public void push(E o) {
    list.addFirst(o);
  }

  // print stack
  public void print() {
    if (isEmpty()) {
      return;
    }
    list.print();
  }
}
