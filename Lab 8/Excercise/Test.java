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
    // MaxHeap heap = new MaxHeap(10);
    // heap.insert(1);
    // heap.insert(2);
    // heap.insert(3);
    // heap.insert(4);
    // heap.insert(5);
    // heap.insert(6);

    // int[] arr = heap.heap;
    // for (int i = 1; i <= heap.heapSize; i++) {
    //   System.out.print(arr[i] + " ");
    // }

    System.out.println();
    int[] arr2 = { 1, 2, 3, 4, 5, 6 };
    heapSort(arr2);
    for (int number : arr2) {
      System.out.print(number + " ");
    }

  }
}
