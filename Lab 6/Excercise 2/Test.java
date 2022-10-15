public class Test {

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
  }

}
