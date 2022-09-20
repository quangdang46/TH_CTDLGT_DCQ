import java.util.Arrays;

public class QuickSort {
  public static void quick_sort(int arr[], int low, int high) {
    if (low < high) {
      int pi = partition(arr, low, high);
      quick_sort(arr, low, pi - 1);
      quick_sort(arr, pi + 1, high);
    }
  }

  public static int partition(int arr[], int low, int high) {
    int pivot = arr[high];
    int i = (low - 1);
    for (int j = low; j < high; j++) {
      if (arr[j] <= pivot) {
        i++;
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
      }
    }
    int temp = arr[i + 1];
    arr[i + 1] = arr[high];
    arr[high] = temp;
    return i + 1;
  }

  public static void main(String[] args) {
    int[] arr = { 5, 4, 3, 2, 1, 6, 7, 10, 9, 8 };
    quick_sort(arr, 0, arr.length - 1);
    Arrays.stream(arr).forEach(
        item -> {
          System.out.print(item + " ");
        });
  }
}
