public class MyStack<E> implements StackInterface<E> {
  private Node<E> top;
  private int numNode;

  public MyStack() {
    this.top = null;
    this.numNode = 0;
  }

  @Override
  public void push(E e) {
    top = new Node<E>(e, top);
    numNode++;
    return;
  }

  @Override
  public E pop() {
    if (isEmpty()) {
      return null;
    }
    E temp = top.getData();
    top = top.getNext();
    numNode--;
    return temp;
  }

  @Override
  public int size() {
    return numNode;
  }

  @Override
  public boolean contains(E item) {
    Node<E> temp = top;
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
    Node<E> temp = top;
    while (temp != null) {
      System.out.print(temp.getData()+" ");
      temp = temp.getNext();
    }

  }

  @Override
  public boolean isEmpty() {
    return numNode == 0;
  }

  @Override
  public E getPeek() {
    if (isEmpty()) {
      return null;
    }
    return top.getData();
  }

}
