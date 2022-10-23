import java.util.Arrays;
public class Test {

  public static void reverse(int[] arr) {
    int n = arr.length;
    for (int i = 0; i < n / 2; i++) {
      int temp = arr[i];
      arr[i] = arr[n - i - 1];
      arr[n - i - 1] = temp;
    }
  }
  public static void heapSort(int[] arr, boolean desc) {
    MinHeap heap = new MinHeap(arr.length);
    for (int i = 0; i < arr.length; i++) {
      heap.insert(arr[i]);
    }
    for (int i = 0; i < arr.length; i++) {
      arr[i] = heap.pop();
    }
    if (desc) {
      reverse(arr);
    }

  }

  public static void main(String[] args) {
    int[] arr = { 2,3,1,-4,4,0,10,9,8,7,6,5 };
    heapSort(arr, false);
    System.out.println(Arrays.toString(arr));
    heapSort(arr, true);
    System.out.println(Arrays.toString(arr));
  }
}
