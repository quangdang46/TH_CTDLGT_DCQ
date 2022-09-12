public class Test {
  public static void main(String[] args) {
    MyStack<Fraction> stack = new MyStack<Fraction>();
    stack.push(new Fraction(1, 2));
    stack.push(new Fraction(1, 3));
    stack.push(new Fraction(1, 4));
    stack.push(new Fraction(1, 5));
    stack.push(new Fraction(1, 6));
    stack.print();
    System.out.println("\nPop " + stack.pop());
    stack.print();
    System.out.println("Pop " + stack.peek());
    System.out.println("Pop " + stack.isEmpty());

  }
}
