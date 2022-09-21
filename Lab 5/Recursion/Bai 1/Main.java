public class Main {
  public static double prod_recur(int a, int b) {
    if (a == 0 || b == 0) {
      return 0;
    }
    if (b == 1) {
      return a;
    }
    if (a == 1) {
      return b;
    }
    return a + prod_recur(a, b - 1);
  }

  public static int bin2dec(int n, int exp) {
    if (n == 0) {
      return 0;
    }
    // if (n == 1) {
    // return (int) Math.pow(2, exp);
    // }
    // return (int) (Math.pow(2, exp) + bin2dec(n / 10, exp - 1));
    return n == 1 ? (int) Math.pow(2, exp) : (int) (Math.pow(2, exp) + bin2dec(n / 10, exp - 1));
  }

  public static int maxDigit(int n) {
    // if (n < 10) {
    // return n;
    // }
    // return Math.max(n % 10, maxDigit(n / 10));
    return n < 10 ? n : Math.max(n % 10, maxDigit(n / 10));
  }

  public static int maxElement(int a[], int n) {
    // if (n == 1) {
    // return a[0];
    // }
    // return Math.max(a[n - 1], maxElement(a, n - 1));
    return n == 1 ? a[0] : Math.max(a[n - 1], maxElement(a, n - 1));

  }

  public static int search(int a[], int n, int key) {
    // if (n == 0) {
    // return -1;
    // }
    // if (a[n - 1] == key) {
    // return n - 1;
    // }
    // return search(a, n - 1, key);
    return n == 0 ? -1 : a[n - 1] == key ? n - 1 : search(a, n - 1, key);
  }

  public static void main(String[] args) {
    System.out.println(prod_recur(5, 3));
    System.out.println(bin2dec(101, 2));
    System.out.println(maxDigit(12345));
    int a[] = { 1, 2, 3, 4, 5 };
    System.out.println(maxElement(a, 5));
    System.out.println(search(a, 5, 3));
  }
}