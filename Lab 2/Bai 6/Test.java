public class Test {
  public static void main(String[] args) {
    MyQueue<Integer> queue = new MyQueue<Integer>();
    queue.offer(1);
    queue.offer(2);
    queue.offer(3);
    queue.offer(4);
    queue.offer(5);

    queue.print();
    System.out.println(queue.poll());
    queue.print();
    System.out.println(queue.peek());
    queue.print();
    System.out.println("Empty:"+queue.isEmpty());
  }
}
