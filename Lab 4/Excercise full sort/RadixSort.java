import java.util.Arrays;

public class RadixSort {
  public static void radix_sort(int arr[]) {
    int n = arr.length;
    int max = arr[0];
    for (int i = 1; i < n; i++) {
      if (arr[i] > max) {
        max = arr[i];
      }
    }
    for (int exp = 1; max / exp > 0; exp *= 10) {
      count_sort(arr, n, exp);
    }
  }

  public static void count_sort(int arr[], int n, int exp) {
    int output[] = new int[n];
    int i;
    int count[] = new int[10];
    Arrays.fill(count, 0);
    for (i = 0; i < n; i++) {
      count[(arr[i] / exp) % 10]++;
    }
    for (i = 1; i < 10; i++) {
      count[i] += count[i - 1];
    }
    for (i = n - 1; i >= 0; i--) {
      output[count[(arr[i] / exp) % 10] - 1] = arr[i];
      count[(arr[i] / exp) % 10]--;
    }
    for (i = 0; i < n; i++) {
      arr[i] = output[i];
    }
  }

  public static void main(String[] args) {
    int[] arr = { 5, 4, 3, 2, 1, 6, 7, 10, 9, 8 };
    radix_sort(arr);
    Arrays.stream(arr).forEach(
        item -> {
          System.out.print(item + " ");
        });
  }
}
