public class Main {
  public static boolean is_palidom_v0(int number) {
    return number == Integer.valueOf(new StringBuilder(Integer.toString(number)).reverse().toString());

    // int reverse = 0;
    // int temp = number;
    // while (temp != 0) {
    // reverse = reverse * 10 + temp % 10;
    // temp /= 10;
    // }
    // return number == reverse;
  }

  public static boolean is_palidom(int number) {
    MyStack<Integer> stack = new MyStack<Integer>();
    MyQueue<Integer> queue = new MyQueue<Integer>();
    int temp = number;
    while (temp != 0) {
      stack.push(temp % 10);
      queue.enQueue(temp % 10);
      temp /= 10;
    }
    while (!stack.isEmpty()) {
      if (stack.pop() != queue.deQueue()) {
        return false;
      }
    }
    return true;
  }

  public static void main(String[] args) {
    System.out.println(is_palidom_v0(12321));
    System.out.println(is_palidom_v0(12345));

    System.out.println(is_palidom(12321));
    System.out.println(is_palidom(12345));
  }
}
