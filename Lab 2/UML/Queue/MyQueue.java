public class MyQueue<E> implements QueueInterface<E> {
  private Node<E> front;
  private Node<E> rear;
  private int numNode;

  public MyQueue() {
    front = null;
    rear = null;
    numNode = 0;
  }

  @Override
  public void enQueue(E item) {
    Node<E> newNode = new Node<E>(item);
    if (isEmpty()) {
      front = newNode;
      rear = newNode;
      numNode++;
      return;
    }
    rear.setNext(newNode);
    rear = newNode;
    numNode++;

  }

  @Override
  public E deQueue() {
    if (isEmpty()) {
      return null;
    }
    E temp = front.getData();
    front = front.getNext();
    numNode--;
    return temp;
  }

  @Override
  public int size() {
    return numNode;
  }

  @Override
  public boolean contains(E item) {
    if (isEmpty()) {
      return false;
    }
    Node<E> temp = front;
    while (temp != null) {
      if (temp.getData().equals(item)) {
        return true;
      }
      temp = temp.getNext();
    }
    return false;
  }

  @Override
  public void print() {
    if (isEmpty()) {
      return;
    }
    Node<E> temp = front;
    while (temp != null) {
      System.out.print(temp.getData() + " ");
      temp = temp.getNext();
    }
    System.out.println();

  }

  @Override
  public boolean isEmpty() {
    return numNode == 0;
  }

  @Override
  public E getFront() {
    if (isEmpty()) {
      return null;
    }
    return front.getData();
  }

}

