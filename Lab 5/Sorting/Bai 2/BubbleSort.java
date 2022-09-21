
public class BubbleSort {
  public static String convert(int arr[]) {
    String str = "";
    for (int number : arr) {
      str += number + " ";
    }
    return str.trim();
  }

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
      System.out.println(convert(arr));
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
      System.out.println(convert(arr));
    }
  }

  public static void main(String[] args) {
    int[] arr = { 5, 3, 4, 2, 6, 1 };
    bubble_sort_v2(arr);

  }
}
