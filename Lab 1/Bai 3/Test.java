public class Test {
  public static void main(String[] args) {
    MyLinkedList list = new MyLinkedList();
    list.add(1);
    list.add(5);
    list.add(10);
    list.add(3);
    list.add(7);
    list.add(2);
    list.add(9);
    list.add(11);
    list.add(8);
    list.add(13);
    list.print();
    System.out.println();
    System.out.println(list.countEven());
    System.out.println(list.countPrime());
    list.addBeforeEven(100);
    list.print();
    System.out.println();
    System.out.println(list.max());
    list.reverse();
    list.print();
    System.out.println();
    list.sort();
    list.print();
  }
}
