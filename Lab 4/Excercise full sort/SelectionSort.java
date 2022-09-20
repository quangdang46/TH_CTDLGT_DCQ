import java.util.Arrays;

public class SelectionSort {
  public static void selection_sort(int arr[]) {
    int n = arr.length;
    for (int i = 0; i < n - 1; i++) {
      int min = i;
      for (int j = i + 1; j < n; j++) {
        if (arr[j] < arr[min]) {
          min = j;
        }
      }
      int temp = arr[min];
      arr[min] = arr[i];
      arr[i] = temp;
    }
  }

  public static void main(String[] args) {
    int[] arr = { 5, 4, 3, 2, 1 };
    selection_sort(arr);
    Arrays.stream(arr).forEach(
        item -> {
          System.out.print(item + " ");
        });
  }
}