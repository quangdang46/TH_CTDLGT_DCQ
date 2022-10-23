public class MinHeap {
  int[] heap;
  int heapSize;
  int maxSize;

  public MinHeap(int capity) {
    heapSize = 0;
    maxSize = capity + 1;
    heap = new int[maxSize];
    heap[0] = -1;
  }

  public int parent(int pos) {
    return pos / 2;
  }

  public int left(int pos) {
    return 2 * pos;
  }

  public int right(int pos) {
    return 2 * pos + 1;
  }

  private void swap(int i, int j) {
    int temp = heap[i];
    heap[i] = heap[j];
    heap[j] = temp;
  }

  public boolean isEmpty() {
    return heapSize == 0;
  }

  public void shiftUp(int pos) {
    while (pos > 1 && heap[pos] < heap[parent(pos)]) {
      swap(pos, parent(pos));
      pos = parent(pos);
    }
  }

  public void shiftDown(int pos) {
    while (left(pos) <= heapSize) {
      int j = left(pos);
      if (j + 1 <= heapSize && heap[j + 1] < heap[j]) {
        j++;
      }
      if (heap[pos] <= heap[j]) {
        break;
      }
      swap(pos, j);
      pos = j;
    }
  }

  public void insert(int val) {
    if (heapSize == maxSize - 1) {
      return;
    }
    heap[++heapSize] = val;
    shiftUp(heapSize);
  }

  public int pop() {
    if (isEmpty()) {
      return -1;
    }
    int min = heap[1];
    heap[1] = heap[heapSize];
    heapSize--;
    shiftDown(1);
    return min;
  }

}