import java.util.Arrays;

public class InsertionSort {
  public static String convert(int arr[]) {
    String str = "";
    for (int number : arr) {
      str += number + " ";
    }
    return str.trim();
  }

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
      System.out.println(convert(arr));
    }
  }

  public static void main(String[] args) {
    int[] arr = { 5, 1, 2, 6, 4, 3 };
    insertion_sort(arr);

  }
}
