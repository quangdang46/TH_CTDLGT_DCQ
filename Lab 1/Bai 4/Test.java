public class Test {
  public static void main(String[] args) {
    MyDoubleLinkedList list = new MyDoubleLinkedList();
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);
    list.add(5);
    list.add(6);

    list.print();
    System.out.println();
    System.out.println("Size: " + list.size());

    list.remove(3);
    list.remove(6);
    list.print();
    System.out.println(list.find(3));
  }
}
