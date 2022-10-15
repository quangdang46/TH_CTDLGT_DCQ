public class Test {
  public static void main(String[] args) {
    AVL tree = new AVL();

    tree.setRoot(tree.insertBalanced(tree.getRoot(), 10));
    tree.setRoot(tree.insertBalanced(tree.getRoot(), 20));
    tree.setRoot(tree.insertBalanced(tree.getRoot(), 30));
    tree.setRoot(tree.insertBalanced(tree.getRoot(), 40));
    tree.setRoot(tree.insertBalanced(tree.getRoot(), 50));
    tree.setRoot(tree.insertBalanced(tree.getRoot(), 25));
    // tree.NLR(tree.getRoot());
    // tree.printTree(tree.getRoot(), "", true);

  
    BTreePrinter btp = new BTreePrinter();
    btp.printNode(tree.getRoot());




  }
}
