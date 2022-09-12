public class MyQueue<E> {
  private MyLinkedList<E> queue;

  public MyQueue() {
    queue = new MyLinkedList<E>();
  }

  // isEmpty()
  public boolean isEmpty() {
    return queue.isEmpty();
  }

  // offer()
  public void offer(E item) {
    queue.addLast(item);
  }

  // peek()
  public E peek() {
    if (queue.isEmpty()) {
      return null;
    }
    return queue.getFirst();
  }

  // poll()
  public E poll() {
    if (queue.isEmpty()) {
      return null;
    }
    E temp = queue.getFirst();
    queue.removeFirst();
    return temp;
  }

  // print()
  public void print() {
    if (queue.isEmpty()) {
      return;
    }
    queue.print();
  }
}
