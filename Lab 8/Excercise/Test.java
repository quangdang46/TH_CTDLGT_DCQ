public class Test {
  public static void heapSort(int[] arr) {
    int n = arr.length;
    MaxHeap heap = new MaxHeap(n);
    for (int i = 0; i < n; i++) {
      heap.insert(arr[i]);
    }
    for (int i = n - 1; i >= 0; i--) {
      arr[i] = heap.pop();
    }
  }
  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
    heapSort(arr);
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
  }
}
