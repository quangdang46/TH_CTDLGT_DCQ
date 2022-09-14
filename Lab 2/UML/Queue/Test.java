public class Test {
  public static void main(String[] args) {
    MyQueue<Integer> queue = new MyQueue<Integer>();
    queue.enQueue(1);
    queue.enQueue(2);
    queue.enQueue(3);
    queue.enQueue(4);
    queue.enQueue(5);
    queue.enQueue(6);

    queue.print();

    System.out.println("Dequeue: " + queue.deQueue());

    queue.print();

    //get front
    System.out.println("Front: " + queue.getFront());
    //size
    System.out.println("Size: " + queue.size());
    //contains
    System.out.println("Contains 3: " + queue.contains(3));
    System.out.println("Contains 7: " + queue.contains(7));

    //isEmpty
    System.out.println("Is Empty: " + queue.isEmpty());
  }
}
