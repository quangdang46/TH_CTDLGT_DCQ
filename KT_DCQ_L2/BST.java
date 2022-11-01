public class BST {
  Node root;

  public BST() {
    this.root = null;
  }

  private Node insert(Node node, Package pack) {
    if (node == null) {
      return new Node(pack);
    }
    if(node.getPackage().getPrice() > pack.getPrice()) {
      node.setLeft(insert(node.getLeft(), pack));
    } else if (node.getPackage().getPrice() < pack.getPrice()) {
      node.setRight(insert(node.getRight(), pack));
    }
    return node;
  }
}
