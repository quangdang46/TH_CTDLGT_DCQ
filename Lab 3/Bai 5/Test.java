public class Test {
  public static String DecimaltoBinary(int n) {
    StringBuilder sb = new StringBuilder();
    if (n == 0) {
      return "0";
    }
    if (n == 1) {
      return "1";
    }
    sb.append(DecimaltoBinary(n / 2));
    sb.append(n % 2);
    return sb.toString();
  }

  public static int DecimaltoBinary2(int n) {
    if (n == 0) {
      return 0;
    }
    return n % 2 + 10 * DecimaltoBinary2(n / 2);

  }

  public static void main(String[] args) {
    System.out.println(DecimaltoBinary(1000));
    System.out.println(DecimaltoBinary2(1000));
  }
}