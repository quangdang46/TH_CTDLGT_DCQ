import java.util.Stack;

public class Main {
  public static String reverseSentence(String str) {
    Stack<String> stack = new Stack<String>();
    for (String s : str.split(" ")) {
      stack.push(s);
    }
    String sb = "";
    while (!stack.empty()) {
      sb+=stack.pop()+" ";
    }
    return sb.trim();
  }

  public static void main(String[] args) {
    System.out.println(reverseSentence("Tran Quang Dang"));
  }
}