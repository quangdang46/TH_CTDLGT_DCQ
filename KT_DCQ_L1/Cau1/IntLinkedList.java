import java.util.NoSuchElementException;

public class IntLinkedList implements LinkedListInterface {
  private Node head;

  private boolean contains(int value) {
    Node temp = head;
    while (temp != null) {
      if (temp.getValue() == value) {
        return true;
      }
      temp = temp.getNext();
    }
    return false;
  }

  @Override
  public boolean addFirst(int value) {
    if (contains(value)) {
      return false;
    }
    head = new Node(value, head);
    return true;
  }

  private int getSize() {
    int size = 0;
    Node temp = head;
    while (temp != null) {
      size++;
      temp = temp.getNext();
    }
    return size;
  }

  private Node getNode(int index) {
    int i = 0;
    Node temp = head;
    while (temp != null) {
      if (i == index) {
        return temp;
      }
      i++;
      temp = temp.getNext();
    }
    return null;
  }

  @Override
  public void removeFifthElement() {
    if (getSize() < 5) {
      throw new NoSuchElementException();
    }
    Node curr = getNode(4);
    Node nextNode = curr.getNext();
    curr.setNext(nextNode.getNext());
  }

  @Override
  public int lastEvenPosition() {
    int index = -1;
    int i = 0;
    Node temp = head;
    while (temp != null) {
      if (temp.getValue() % 2 == 0) {
        index = i;
      }
      i++;
      temp = temp.getNext();
    }
    return index;
  }

  public void print() {
    Node temp = head;
    while (temp != null) {
      System.out.print(temp.getValue() + " ");
      temp = temp.getNext();
    }
  }

}
