import java.util.List;

public class Test {
  public static void main(String[] args) {
    DoubleNode list = new DoubleNode();
    list.addFirst(1);
    list.addFirst(2);
    list.addFirst(3);
    list.addFirst(4);
    list.addFirst(5);
    list.addFirst(6);
    list.print();
    System.out.println(list.find(1));
  }
}
