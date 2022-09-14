public class Test {
  // find min recursion
  public static int minArray(int[] arr, int index) {
    if (index == arr.length - 1) {
      return arr[index];
    }
    return Math.min(arr[index], minArray(arr, index + 1));
  }

  // sum recursion
  public static int sum(int[] arr, int index) {
    if (index == arr.length - 1) {
      return arr[index];
    }
    return arr[index] + sum(arr, index + 1);
  }

  public static int countEven(int[] arr, int index) {
    if (index == arr.length)
      return 0;

    int result;
    if ((arr[index] % 2) == 0) {
      result = 1;
    } else {
      result = 0;
    }
    return result + countEven(arr, index + 1);
  }

  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    System.out.println("Min: " + minArray(arr,0));
    System.out.println("Sum: " + sum(arr,0));
    System.out.println("Count Even: " + countEven(arr,0));
  }
}