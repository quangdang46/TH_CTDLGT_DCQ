public class Test {
  public static void main(String[] args) {
    MyStack<Integer> stack = new MyStack<Integer>();
    stack.push(1);
    stack.push(2);
    stack.push(3);
    stack.push(4);
    stack.push(5);
    stack.print();
    
    System.out.println("Stack size: " + stack.size());
    System.out.println("Stack contains 3: " + stack.contains(3));
    System.out.println("Stack contains 6: " + stack.contains(6));

    System.out.println("Stack pop: " + stack.pop());
    stack.print();

  }
}
