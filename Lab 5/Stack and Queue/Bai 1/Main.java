public class Main {
  public static String infix_to_postfix(String infix) {
    String postfix = "";
    MyStack<Character> stack = new MyStack<Character>();
    for (int i = 0; i < infix.length(); i++) {
      char c = infix.charAt(i);
      if (c == '(') {
        stack.push(c);
      } else if (c == ')') {
        while (!stack.isEmpty() && stack.getPeek() != '(') {
          postfix += stack.pop();
        }
        stack.pop();
      } else if (c == '+' || c == '-' || c == '*' || c == '/') {
        while (!stack.isEmpty() && stack.getPeek() != '(' && priority(c) <= priority(stack.getPeek())) {
          postfix += stack.pop();
        }
        stack.push(c);
      } else {
        postfix += c;
      }
    }
    while (!stack.isEmpty()) {
      postfix += stack.pop();
    }
    return postfix;
  }
  public static int priority(char c) {
    if (c == '+' || c == '-') {
      return 1;
    } else if (c == '*' || c == '/') {
      return 2;
    } else {
      return 0;
    }
  }

  public static void main(String[] args) {
    System.out.println(infix_to_postfix("((9-2)*6+7)/7"));
  }
}