public class IntLinkedList {
  private Node head;

  public IntLinkedList() {
    this.head = null;
  }

  public void addFirst(int data) {
    head = new Node(data, head);
  }

  public boolean addLast(int data) {
    if (searchKey(data) != -1) {
      return false;
    }
    if (head == null) {
      head = new Node(data, null);
      return true;
    }
    Node current = head;
    while (current.getNext() != null) {
      current = current.getNext();
    }
    current.setNext(new Node(data, null));
    return true;
  }

  public int size() {
    int count = 0;
    Node temp = head;
    while (temp != null) {
      count++;
      temp = temp.getNext();
    }
    return count;
  }

  public boolean removeAt(int position) {
    if(head == null) {
      return false;
    }
    if (position < 1 || position >= size()) {
      return false;
    }
    if (position == 1) {
      head = head.getNext();
      return true;
    }
    Node prev = null;
    Node curr = head;
    for (int i = 1; i < position; i++) {
      prev = curr;
      curr = curr.getNext();
    }
    prev.setNext(curr.getNext());
    return true;
  }

  public int countOdd() {
    if (head == null) {
      return 0;
    }
    int count = 0;
    Node temp = head;
    while (temp != null) {
      count += temp.getData() % 2;
      temp = temp.getNext();
    }
    return count;
  }

  public int searchKey(int key) {
    if (head == null) {
      return -1;
    }
    int index = 0;
    Node current = head;
    while (current != null) {
      index++;
      if (current.getData() == key) {
        return index;
      }
      current = current.getNext();
    }
    return -1;
  }

  public boolean checkSorted() {
    if (head == null) {
      return false;
    }
    boolean desc = false;
    boolean asc = false;
    Node temp = head;
    while (temp.getNext() != null) {
      Node nextNode = temp.getNext();
      if (temp.getData() > nextNode.getData()) {
        desc = true;
      } else if (temp.getData() < nextNode.getData()) {
        asc = true;
      }
      temp = nextNode;
    }
    return (desc && !asc) || (!desc && asc);
  }

  public void printList() {
    if (head == null) {
      return;
    }
    Node temp = head;
    while (temp != null) {
      System.out.print(temp.getData() + " ");
      temp = temp.getNext();
    }
    System.out.println();
  }
}
