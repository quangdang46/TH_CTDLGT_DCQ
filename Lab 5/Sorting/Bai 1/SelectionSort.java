
public class SelectionSort {

  public static String convert(int arr[]) {
    String str = "";
    for (int number : arr) {
      str += number + " ";
    }
    return str.trim();
  }

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
      System.out.println(convert(arr));
    }
  }

  public static void main(String[] args) {
    int[] arr = { 3, 1, 4, 6, 2, 5 };
    selection_sort(arr);

  }
}