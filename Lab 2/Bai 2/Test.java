public class Test {
  public static void main(String[] args) {
    MyQueue<Fraction> queue = new MyQueue<Fraction>();
    queue.offer(new Fraction(1, 2));
    queue.offer(new Fraction(1, 3));
    queue.offer(new Fraction(1, 4));
    queue.offer(new Fraction(1, 5));
    queue.offer(new Fraction(1, 6));
    queue.print();
    System.out.println();
    System.out.println(queue.poll());
    queue.print();
    System.out.println();
    System.out.println(queue.poll());
    queue.print();
    System.out.println("\nisEmpty: " + queue.isEmpty());
    System.out.println(queue.peek());
    queue.print();
    
  }
}
