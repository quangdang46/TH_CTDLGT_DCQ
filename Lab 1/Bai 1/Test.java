public class Test {
  public static void main(String[] args) {
    MyLinkedList list = new MyLinkedList();
    list.addFirst(new Fraction(1, 2));
    list.addFirst(new Fraction(1, 3));
    list.addFirst(new Fraction(1, 4));
    list.addFirst(new Fraction(1, 5));
    list.addFirst(new Fraction(1, 1));
    list.print();
    System.out.println();
    list.addAfter(list.getFirst(), new Fraction(1, 6));
    list.print();
    System.out.println();
    list.addLast(new Fraction(1, 19));
    list.print();
    System.out.println();
    list.removeFirst();
    list.print();
    System.out.println();
    list.removeLast();
    list.print();

    list.removeFirst();
    list.print();
    System.out.println();
    list.removeAfter(list.getFirst());
    list.print();
  }
}
