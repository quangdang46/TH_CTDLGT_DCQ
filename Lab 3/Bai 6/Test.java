import java.util.Arrays;

public class Test {
  public static int minArray(int arr[]) {
    // forEach
    return Arrays.stream(arr).min().getAsInt();

    // // for loop
    // int min = Integer.MAX_VALUE;
    // for (int element : arr) {
    // min = Math.min(min, element);
    // }
    // return min;
  }

  public static int sum(int[] arr) {
    // forEach
    return Arrays.stream(arr).sum();

    // //for loop
    // int sum = 0;
    // for (int element : arr) {
    // sum += element;
    // }
    // return sum;
  }

  public static int countEven(int[] arr) {
    // forEach
    return (int) Arrays.stream(arr).filter(x -> x % 2 == 0).count();

    // //for loop
    // int count = 0;
    // for (int element : arr) {
    // count += element % 2 == 0 ? 1 : 0;
    // }
    // return count;
  }

  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    System.out.println("Min: " + minArray(arr));
    System.out.println("Sum: " + sum(arr));
    System.out.println("Count Even: " + countEven(arr));
  }
}