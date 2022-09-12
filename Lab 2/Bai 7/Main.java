public class Main {
  public static boolean palindrome(String s) {
    MyStack<Character> stack = new MyStack<Character>();
    MyQueue<Character> queue = new MyQueue<Character>();
    for (Character c : s.toCharArray()) {
      if (Character.isLetter(c)) {
        stack.push(Character.toLowerCase(c));
        queue.offer(Character.toLowerCase(c));
      }

    }
    while (!stack.isEmpty()) {
      if (!stack.pop().equals(queue.poll())) {
        return false;
      }
    }
    return true;
  }

  public static void main(String[] args) {
    System.out.println(palindrome("A man, a plan, a canal: Panama"));
    System.out.println(palindrome("hello"));
  }

}