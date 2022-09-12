public class Main {
  public static double recursion(int n) {
    if (n == 1) {
      return 3;
    }
    return Math.pow(2, n) + Math.pow(n, 2) + recursion(n - 1);
  }

  public static double stack(int n) {
    MyStack<Integer> stack = new MyStack<Integer>();
    for (int i = 2; i <= n; i++) {
      stack.push(i);
    }
    double sum = 0;
    while (!stack.isEmpty()) {
      int i = stack.pop();
      sum += Math.pow(2, i) + Math.pow(i, 2);
    }
    return sum + 3;
  }

  public static double stack_v2(int n) {
    MyStack<Integer> stack = new MyStack<Integer>();
    stack.push(3);
    for (int i = 2; i <= n; i++) {
      stack.push((int) (Math.pow(2, i) + Math.pow(i, 2) + stack.peek()));
    }
    return stack.peek();
  }
  public static void main(String[] args) {
    System.out.println(recursion(5));
    System.out.println(stack(5));
    System.out.println(stack_v2(5));

  }
}