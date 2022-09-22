public class Test {
  public static void main(String[] args) {
    BST tree = new BST();
    tree.insert(50);
    tree.insert(25);
    tree.insert(75);
    tree.insert(12);
    tree.insert(37);
    tree.insert(43);
    tree.insert(30);
    tree.insert(33);
    tree.insert(87);
    tree.insert(93);
    tree.insert(97);
    System.out.println("Inorder traversal:");
    tree.inOrder(tree.getRoot());
    System.out.println();
    System.out.println("Preorder traversal:");
    tree.preOrder(tree.getRoot());
    System.out.println();
    System.out.println("Postorder traversal:");
    tree.postOrder(tree.getRoot());
    System.out.println();
    System.out.println("Find 37: " + tree.find(37));
    System.out.println("Find 100: " + tree.find(100));
  }
}
