public class MyLinkedList {
  private Node head;
  private int size;

  public MyLinkedList() {
    head = null;
    size = 0;
  }

  public void add(int data) {
    if (head == null) {
      head = new Node(data);
      size++;
      return;
    }
    head = new Node(data, head);
    size++;
  }

  public void print() {
    if (head == null) {
      System.out.println("List is empty");
      return;
    }
    Node temp = head;
    while (temp != null) {
      System.out.print(temp + " ");
      temp = temp.getNext();
    }
  }

  // a
  public int countEven() {
    if (head == null) {
      return 0;
    }
    int count = 0;
    Node temp = head;
    while (temp != null) {
      if (temp.getValue() % 2 == 0) {
        count++;
      }
      temp = temp.getNext();
    }
    return count;
  }

  // b
  public boolean isPrime(int n) {
    // fast
    if (n == 2 || n == 3) {
      return true;
    }
    if (n % 2 == 0 || n % 3 == 0) {
      return false;
    }
    int i = 5;
    int w = 2;
    while (i * i <= n) {
      if (n % i == 0) {
        return false;
      }
      i += w;
      w = 6 - w;
    }
    return true;
  }

  public int countPrime() {
    if (head == null) {
      return 0;
    }
    int count = 0;
    Node temp = head;
    while (temp != null) {
      if (isPrime(temp.getValue())) {
        count++;
      }
      temp = temp.getNext();
    }
    return count;
  }

  // them truoc chan dau tien
  public void addBeforeEven(int item) {
    if (head == null) {
      return;
    }
    if (head.getValue() % 2 == 0) {
      add(item);
      size++;
      return;
    }
    Node prev = null;
    Node curr = head;
    while (curr != null) {
      if (curr.getValue() % 2 == 0) {
        prev.setNext(new Node(item, curr));
        size++;
        return;
      }
      prev = curr;
      curr = curr.getNext();
    }
  }
  //lon nhat
  public int max() {
    if (head == null) {
      return 0;
    }
    int max = head.getValue();
    Node temp = head;
    while (temp != null) {
      if (temp.getValue() > max) {
        max = temp.getValue();
      }
      temp = temp.getNext();
    }
    return max;
  }
  //dao nguoc
  public void reverse() {
    if (head == null || head.getNext() == null) {
      return;
    }

    Node curr = head;
    while (curr != null && curr.getNext() != null) {
      Node temp = curr.getNext();
      curr.setNext(temp.getNext());
      temp.setNext(head);
      head = temp;
    }
  }
  //sort
  public void sort() {
    if (head == null || head.getNext() == null) {
      return;
    }
    
    Node curr = head;
    while (curr != null) {
      Node temp = curr.getNext();
      while (temp != null) {
        if (curr.getValue() > temp.getValue()) {
          int t = curr.getValue();
          curr.setValue(temp.getValue());
          temp.setValue(t);
        }
        temp = temp.getNext();
      }
      curr = curr.getNext();
    }
  }

}
