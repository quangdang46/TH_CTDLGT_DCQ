import java.util.Arrays;

public class Main {
  // khong khoang trang
  // System.out.println(infix_to_postfix("((9-2)*6+7)/7"));

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

  // co khoang trang
  public static String format(String postfix) {
    // System.out.println("9 2 - 6 * 7 + 7 /".length());
    String[] arr = postfix.trim().split(" ");
    // System.out.println(Arrays.toString(arr));
    String result = "";
    for (String temp : arr) {
      if (!temp.equals("")) {
        result += temp + " ";
      }
    }
    return result.trim();
  }
  // System.out.println(infix_to_postfix_main("((9 - 2) * 6 + 7) / 7"));
  public static String infix_to_postfix_main(String infix) {
    char[] arr = infix.replaceAll(" ", "").toCharArray();
    String postfix = "";
    MyStack<Character> stack = new MyStack<Character>();
    for (int i = 0; i < arr.length; i++) {
      char c = arr[i];
      if (c == '(') {
        stack.push(c);
      } else if (c == ')') {
        while (!stack.isEmpty() && stack.getPeek() != '(') {
          postfix += " " + stack.pop() + " ";
        }
        stack.pop();
      } else if (c == '+' || c == '-' || c == '*' || c == '/') {
        while (!stack.isEmpty() && stack.getPeek() != '(' && priority(c) <= priority(stack.getPeek())) {
          postfix += " " + stack.pop() + " ";
        }
        stack.push(c);
      } else {
        postfix += " " + c + " ";
      }
    }
    while (!stack.isEmpty()) {
      postfix += " " + stack.pop() + " ";
    }

    return format(postfix);
  }

  public static void main(String[] args) {
    // System.out.println(infix_to_postfix("((9-2)*6+7)/7"));
    System.out.println(infix_to_postfix_main("((9 - 2) * 6 + 7) / 7"));
  }
}