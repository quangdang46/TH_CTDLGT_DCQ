public class Main {
  public static String reverse(String s) {
    MyStack<Character> stack = new MyStack<Character>();
    for (char c : s.toCharArray()) {
      stack.push(c);
    }
    StringBuilder sb = new StringBuilder();
    while (!stack.isEmpty()) {
      sb.append(stack.pop());
    }
    return sb.toString();
  }
  public static void main(String[] args) {
    System.out.println(reverse("Hello World!"));
  }
}