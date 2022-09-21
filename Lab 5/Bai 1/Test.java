public class Test {
  public static void main(String[] args) {
    IntLinkedList list = new IntLinkedList();
    list.addFirst(1);
    list.addFirst(2);
    list.addFirst(3);
    list.addFirst(4);
    list.addFirst(5);
    list.printList();
    System.out.println("Size: " + list.size());
    System.out.println("Odd count: " + list.countOdd());
    System.out.println("Search for 3: " + list.searchKey(3));
    System.out.println("Add 6: " + list.addLast(6));
    list.printList();
    //remove at
    System.out.println("Remove at 3: " + list.removeAt(3));
    list.printList();
    //checkSorted
    System.out.println("Check sorted: " + list.checkSorted());
  }
}
