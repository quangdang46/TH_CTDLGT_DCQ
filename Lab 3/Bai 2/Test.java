public class Test {
  public static int factorial(int n) {
    if (n == 0 || n == 1)
      return 1;
    return n * factorial(n - 1);
  }

  public static int compute(int x, int n) {
    if (n == 0)
      return 1;
    return x * compute(x, n - 1);
  }

  public static int countDigits(int n) {
    if (n == 0)
      return 0;
    return 1 + countDigits(n / 10);
  }

  // isprime recursion
  public static boolean isPrime(int n, int i) {
    if (n <= 2)
      return (n == 2);
    if (n % i == 0)
      return false;
    if (i * i > n)
      return true;
    return isPrime(n, i + 1);
  }

  public static int gcd(int a, int b) {
    if (b == 0)
      return a;
    return gcd(b, a % b);
  }

  public static void main(String[] args) {
    System.out.println(factorial(5));
    System.out.println(compute(2, 3));
    System.out.println(countDigits(12345));
    System.out.println(isPrime(5, 2));
    System.out.println(gcd(18, 12));

  }
}