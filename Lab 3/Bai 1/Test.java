public class Test {
  public static int factorial(int n) {
    if (n == 0 || n == 1) {
      return 1;
    }
    int result = 1;
    for (int i = 2; i <= n; i++) {
      result *= i;
    }
    return result;

  }

  public static int compute(int x, int n) {
    if (n == 0) {
      return 1;
    }
    int result = x;
    for (int i = 1; i < n; i++) {
      result *= x;
    }
    return result;
  }

  public static int countDigits(int n) {
    return Integer.toString(n).length();
  }

  public static boolean isPrime(int n) {
    if (n <= 2) {
      return n == 2;
    }
    if (n % 2 == 0) {
      return false;
    }
    for (int i = 3; i * i <= n; i += 2) {
      if (n % i == 0) {
        return false;
      }
    }
    return true;
  }

  public static int gcd(int a, int b) {
    if (a == 0 || b == 0) {
      return a + b;
    }

    while (a != b) {
      if (a > b) {
        a -= b;
      } else {
        b -= a;
      }
    }
    return a;
  }

  public static void main(String[] args) {
    System.out.println(factorial(5));
    System.out.println(compute(2, 3));
    System.out.println(countDigits(12345));
    System.out.println(isPrime(7));
    System.out.println(gcd(12, 18));
  }
}