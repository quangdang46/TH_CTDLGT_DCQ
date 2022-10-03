public class CharLinkedList implements ListInterface {
  private Node head;

  public CharLinkedList() {
    this.head = null;
  }

  @Override
  public Node getHead() {
    return this.head;
  }

  @Override
  public void addFirst(char data) {
    head = new Node(data, head);
  }

  public Node findNode(char key) {
    Node temp = head;
    while (temp != null) {
      if (temp.getData() == key) {
        return temp;
      }
      temp = temp.getNext();
    }
    return null;
  }

  @Override
  public boolean addAfterFirstKey(char data, char key) {
    if (findNode(key) == null) {
      return false;
    }
    Node current = findNode(key);
    Node newNode = new Node(data, current.getNext());
    current.setNext(newNode);
    return true;
  }

  @Override
  public int largestCharPostition() {
    int index = -1, i = 0;
    int max = Integer.MIN_VALUE;
    Node temp = head;
    while (temp != null) {
      if ((int) temp.getData() > max) {
        max = (int) temp.getData();
        index = i;
      }
      i++;
      temp = temp.getNext();
    }
    return index;
  }

  public void print(Node curr) {
    if (curr == null)
      return;
    System.out.print(curr.getData() + " ");
    print(curr.getNext());
  }

}
