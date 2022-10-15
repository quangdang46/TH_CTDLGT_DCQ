public class Test {

  // Ex2
  public static BST createTree(String strTree) {
    BST tree = new BST();
    String[] arr = strTree.split(" ");
    for (String number : arr) {
      tree.insert(tree.getRoot(), Integer.parseInt(number));
    }
    return tree;
  }



  public static void main(String[] args) {
    BST tree = createTree("1 8 2 0 10 5 6");
    tree.NLR(tree.getRoot());
    System.out.println();
    tree.printAsc();
    System.out.println();
    tree.printDesc();
    System.out.println();
    System.out.println(tree.contains(10));
    System.out.println(tree.contains(-9));

    tree.deleteMax();
    tree.NLR(tree.getRoot());

    System.out.println("\nheight:" + tree.height());
    
    System.out.println("Sum:" + tree.sum());
    System.out.println("Sum:" + tree.sum(tree.getRoot()));


  }

}
