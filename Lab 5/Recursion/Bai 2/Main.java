public class Main {

  public static int sum_a_loop(int n) {
    int sum = 0;
    for (int i = 1; i <= n; i++) {
      sum += Math.pow(2, i);
    }
    return (int) sum;
  }

  public static int sum_a_recur(int n) {
    return n < 1 ? 0 : (int) Math.pow(2, n) + sum_a_recur(n - 1);
  }

  public static double sum_b_loop(int n) {
    double sum = 0;
    for (int i = 0; i <= n; i++) {
      sum += (i + 1) / 2;
    }
    return sum;
  }

  public static double sum_b_recur(int n) {
    return n < 0 ? 0 : (n + 1) / 2 + sum_b_recur(n - 1);
  }

  public static double sum_c_loop(int n) {
    double gt = 1;
    double sum = 0;
    for (int i = 1; i <= n; i++) {
      gt *= i;
      sum += gt / (gt / i);
    }
    return sum;
  }

  public static double gt(int n) {
    return n < 1 ? 1 : n * gt(n - 1);
  }

  public static double sum_c_recur(int n) {
    return n < 1 ? 0 : gt(n) / gt(n - 1) + sum_c_recur(n - 1);
  }

  public static int sum_d_loop(int n) {
    int sum = 0;
    for (int i = 1; i <= n; i++) {
      sum += i * (i - 1);
    }
    return sum;
  }

  public static int sum_d_recur(int n) {
    return n < 1 ? 0 : n * (n - 1) + sum_d_recur(n - 1);
  }

  public static int multiply_c_loop(int n) {
    int mul = 1;
    for (int i = 1; i <= n; i++) {
      mul *= i;
    }
    return mul;
  }

  public static int multiply_c_recur(int n) {
    return n < 1 ? 1 : n * multiply_c_recur(n - 1);
  }

  public static void main(String[] args) {
    System.out.println(sum_a_loop(5));
    System.out.println(sum_a_recur(5));

    System.out.println(sum_b_loop(5));
    System.out.println(sum_b_recur(5));

    System.out.println(sum_c_loop(5));
    System.out.println(sum_c_recur(5));

    System.out.println(sum_d_loop(5));
    System.out.println(sum_d_recur(5));

    System.out.println(multiply_c_loop(5));
    System.out.println(multiply_c_recur(5));
  }
}