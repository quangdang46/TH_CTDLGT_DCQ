public class MaxHeap {
  int[] heap;
  int heapSize;
  int maxSize;

  public MaxHeap(int capacity) {
    heapSize = 0;
    maxSize = capacity;
    heap = new int[maxSize];
    heap[0] = -1;
  }

  public int parent(int i) {
    return i / 2;
  }

  public int left(int i) {
    return 2 * i;
  }

  public int right(int i) {
    return 2 * i + 1;
  }

  private void swap(int i, int j) {
    int temp = heap[i];
    heap[i] = heap[j];
    heap[j] = temp;
  }

  private void shiftUp(int i) {
    while (i > 1 && heap[i] > heap[parent(i)]) {
      swap(i, parent(i));
      i = parent(i);
    }
  }
  
  private void shiftDown(int i) {
    while (i <= heapSize) {
      int maxIndex = i;
      int l = left(i);
      if (l <= heapSize && heap[l] > heap[maxIndex]) {
        maxIndex = l;
      }
      int r = right(i);
      if (r <= heapSize && heap[r] > heap[maxIndex]) {
        maxIndex = r;
      }
      if (i == maxIndex) {
        break;
      }
      swap(i, maxIndex);
      i = maxIndex;
    }
  }

  public int pop() {
    if (heapSize == 0) {
      return -1;
    }
    int result = heap[1];
    heap[1] = heap[heapSize];
    heapSize--;
    shiftDown(1);
    return result;
  }

  public void insert(int key) {
    if (heapSize == maxSize) {
      return;
    }
    heapSize++;
    heap[heapSize] = key;
    shiftUp(heapSize);
  }

  public void remove(int key) {
    int i = 1;
    while (i <= heapSize) {
      if (heap[i] == key) {
        break;
      }
      i++;
    }
    if (i > heapSize) {
      return;
    }
    heap[i] = heap[heapSize];
    heapSize--;
    shiftDown(i);
  }
}