public class Test {
  public static int sumA(int n, int i) {
    if (i > n) {
      return 0;
    }
    return 2 * i + 1 + sumA(n, i + 1);
  }

  public static int factorial(int n) {
    if (n == 0) {
      return 1;
    }
    return n * factorial(n - 1);
  }

  public static int sumB(int n, int i) {
    if (i > n) {
      return 0;
    }
    return factorial(i) + sumB(n, i + 1);
  }

  public static int multiplyC(int n, int i) {
    if (i > n) {
      return 1;
    }
    return factorial(i) * multiplyC(n, i + 1);
  }

  public static int P(int n, int r) {
    if (r > n) {
      return 1;
    }
    return (n + 1 - r) * P(n, r + 1);
  }

  public static int P(int n) {
    if (n == 1) {
      return 3;
    }
    return (int) (Math.pow(2, n) + Math.pow(n, 2) + P(n - 1));
  }

  public static void main(String[] args) {
    System.out.println(sumA(5, 1));
    System.out.println(sumB(4, 1));
    System.out.println(multiplyC(4, 1));
    System.out.println(P(6, 1));
    System.out.println(P(5));
  }
}