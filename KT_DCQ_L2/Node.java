public class Node {
  private Package pack;
  private Node left;
  private Node right;

  public Node(Package pack) {
    this.pack = pack;
    left = null;
    right = null;
  }

  public Package getPackage() {
    return pack;
  }

  public void setPackage(Package pack) {
    this.pack = pack;
  }

  public Node getLeft() {
    return left;
  }

  public void setLeft(Node left) {
    this.left = left;
  }

  public Node getRight() {
    return right;
  }
  public void setRight(Node right) {
    this.right = right;
  }
}
