public class Test {
  public static void main(String[] args) {
    CharLinkedList list = new CharLinkedList();
    list.addFirst('c');
    list.addFirst('b');
    list.addFirst('A');
    list.print(list.getHead());
    // System.out.println(list.addAfterFirstKey('E', 'b'));
    System.out.println();
    list.print(list.getHead());
    System.out.println(list.largestCharPostition());
  }
}
