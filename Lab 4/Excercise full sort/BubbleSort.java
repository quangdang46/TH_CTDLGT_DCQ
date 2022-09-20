import java.util.Arrays;

public class BubbleSort {
  public static void bubble_sort_v1(int arr[]) {
    int n = arr.length;
    int temp = 0;
    for (int i = 0; i < n; i++) {
      for (int j = 1; j < (n - i); j++) {
        if (arr[j - 1] > arr[j]) {
          temp = arr[j - 1];
          arr[j - 1] = arr[j];
          arr[j] = temp;
        }
      }
    }
  }

  public static void bubble_sort_v2(int arr[]) {
    int n = arr.length;
    int temp = 0;
    boolean isSorted = false;
    for (int i = 0; i < n; i++) {
      for (int j = 1; j < (n - i); j++) {
        if (arr[j - 1] > arr[j]) {
          temp = arr[j - 1];
          arr[j - 1] = arr[j];
          arr[j] = temp;
          isSorted = true;
        }
      }
      if (!isSorted) {
        return;
      }
    }
  }

  public static void main(String[] args) {
    int[] arr = { 5, 4, 3, 2, 1, 6, 7, 10, 9, 8 };
    // bubble_sort_v1(arr);
    bubble_sort_v2(arr);
    Arrays.stream(arr).forEach(
        item -> {
          System.out.print(item + " ");
        });
  }
}
