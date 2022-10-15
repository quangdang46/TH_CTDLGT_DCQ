public class Test {
  public static void main(String[] args) {
    BST tree = new BST();
    tree.insert(tree.getRoot(), 5);
    tree.insert(tree.getRoot(), 3);
    tree.insert(tree.getRoot(), 7);
    tree.insert(tree.getRoot(), 2);
    tree.insert(tree.getRoot(), 4);
    tree.insert(tree.getRoot(), 6);

    tree.NLR(tree.getRoot());

    System.out.println("\nSearch 2:"+tree.search(tree.getRoot(),2).getData());
    System.out.println("Search 4:" + tree.search(tree.getRoot(), 4).getData());
    
    tree.delete(tree.getRoot(), 3);

    tree.NLR(tree.getRoot());

    


  }
  

}



