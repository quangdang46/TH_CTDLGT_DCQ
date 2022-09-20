import java.util.Arrays;

public class InsertionSort {
  public static void insertion_sort(int arr[]) {
    int n = arr.length;
    for (int i = 1; i < n; i++) {
      int key = arr[i];
      int j = i - 1;
      while (j >= 0 && arr[j] > key) {
        arr[j + 1] = arr[j];
        j = j - 1;
      }
      arr[j + 1] = key;
    }
  }

  public static void main(String[] args) {
    int[] arr = { 5, 4, 3, 2, 1, 6, 7, 10, 9, 8 };
    // bubble_sort_v1(arr);
    insertion_sort(arr);
    Arrays.stream(arr).forEach(
        item -> {
          System.out.print(item + " ");
        });
  }
}
