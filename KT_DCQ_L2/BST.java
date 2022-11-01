import java.util.ArrayList;

public class BST {
  Node root;

  public BST() {
    this.root = null;
  }

  public void insert(Package p) {
    this.root = insert(root, p);
  }
  
  public Node findMin() {
    return findMin(root);
  }

  public int totalByCountry(String country) {
    return totalByCountry(root, country);
  }

  public ArrayList<Node> findMinByCountry(String country) {
    ArrayList<Node> list = new ArrayList<Node>();
    findPackagesInCountry(root, country, list);
    return list;
  }
  

  private Node insert(Node node, Package pack) {
    if (node == null) {
      return new Node(pack);
    }
    if (node.getPackage().getPrice() > pack.getPrice()) {
      node.setLeft(insert(node.getLeft(), pack));
    } else if (node.getPackage().getPrice() < pack.getPrice()) {
      node.setRight(insert(node.getRight(), pack));
    }
    return node;
  }

  private Node findMin(Node node) {
    if (node.getLeft() == null) {
      return node;
    }
    return findMin(node.getLeft());
  }

  private int totalByCountry(Node node, String country) {
    if (node == null) {
      return 0;
    }
    if (node.getPackage().getCountry().equals(country)) {
      return node.getPackage().getPrice() + totalByCountry(node.getLeft(), country)
          + totalByCountry(node.getRight(), country);
    }
    return totalByCountry(node.getLeft(), country) + totalByCountry(node.getRight(), country);
  }

  private void findPackagesInCountry(Node node, String country, ArrayList<Node> packs) {
    if (node == null) {
      return;
    }
    if (node.getPackage().getCountry().equals(country)) {
      packs.add(node);
    }
    findPackagesInCountry(node.getLeft(), country, packs);
    findPackagesInCountry(node.getRight(), country, packs);
  }
}
