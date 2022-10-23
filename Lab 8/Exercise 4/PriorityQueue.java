public class PriorityQueue {
  Person[] heap;
  int size;
  int maxSize;

  public PriorityQueue(int capity) {
    this.maxSize = capity + 1;
    this.size = 0;
    this.heap = new Person[maxSize];
    heap[0] = null;
  }

  public void swap(int i, int j) {
    Person temp = heap[i];
    heap[i] = heap[j];
    heap[j] = temp;
  }

  public void shiftUp(int i) {
    while (i > 1 && heap[i].getPriority() > heap[i / 2].getPriority()) {
      swap(i, i / 2);
      i = i / 2;
    }
  }
  
  public void shiftDown(int i) {
    while (2 * i <= size) {
      int j = 2 * i;
      if (j + 1 <= size && heap[j + 1].getPriority() > heap[j].getPriority()) {
        j++;
      }
      if (heap[i].getPriority() >= heap[j].getPriority()) {
        break;
      }
      swap(i, j);
      i = j;
    }
  }

  public void enQueue(Person person) {
    if (size == maxSize - 1) {
      return;
    }
    size++;
    heap[size] = person;
    shiftUp(size);
  }
  
  public Person deQueue() {
    if (size == 0) {
      return null;
    }
    Person person = heap[1];
    swap(1, size);
    size--;
    shiftDown(1);
    return person;
  }

  public void print(int max) {
    for (int i = 1; i <= max; i++) {
      System.out.println(heap[i]);
    }
    System.out.println();
  }
}