public class Main {

  public static double A_a_loop(int n) {
    double sum = 2;
    if (n == 0) {
      return sum;
    }
    for (int i = 1; i <= n; i++) {
      sum = 2 - (1 / 2) * sum;
    }
    return sum;
  }

  public static double A_a_recur(int n) {
    return n == 0 ? 2 : 2 - (1 / 2) * A_a_recur(n - 1);
  }

  public static double A_b_loop(int n) {
    double sum = 1;
    if (n < 10) {
      return sum;
    }
    for (int i = 10; i <= n; i *= 10) {
      sum += 1;
    }
    return sum;
  }

  public static double A_b_recur(int n) {
    return n < 10 ? 1 : 1 + A_b_recur(n / 10);
  }

  public static int A_c_loop(int n, int k) {
    int sum = n;
    if (k == 1) {
      return sum;
    }
    for (int i = 2; i <= k; i++) {
      sum = n + sum;
    }
    return sum;
  }

  public static int A_c_recur(int n, int k) {
    return k == 1 ? n : n + A_c_recur(n, k - 1);
  }

  public static int A_d_loop(int n) {
    int arr[] = new int[n];
    arr[0] = 0;
    arr[1] = 1;
    for (int i = 2; i < n; i++) {
      arr[i] = arr[i - 1] + arr[i - 2];
    }
    return arr[n - 1];
  }

  public static int A_d_recur(int n) {
    return n == 1 ? 0 : n == 2 ? 1 : A_d_recur(n - 1) + A_d_recur(n - 2);
  }


  public static void main(String[] args) {
    System.out.println(A_a_loop(10));
    System.out.println(A_a_recur(10));


    System.out.println(A_b_loop(1000));
    System.out.println(A_b_recur(1000));

    System.out.println(A_c_loop(2, 3));
    System.out.println(A_c_recur(2, 3));


    System.out.println(A_d_loop(10));
    System.out.println(A_d_recur(10));

  }
}