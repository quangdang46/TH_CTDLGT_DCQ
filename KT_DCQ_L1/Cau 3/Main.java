public class Main {

  public static boolean check(int n) {
    if (Math.floor(Math.sqrt(n)) == Math.ceil(Math.sqrt(n))) {
      return true;
    }
    return false;
  }

  public static int countSquare(int a[], int n) {
    if (n == a.length) {
      return 0;
    }
    int result = check(a[n]) ? 1 : 0;

    return result + countSquare(a, n + 1);
  }

  public static void main(String[] args) {
    System.out.println(countSquare(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }, 0));
  }
}