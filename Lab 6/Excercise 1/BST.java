public class BST {
  private Node root;

  public BST() {
    this.root = null;
  }

  public Node getRoot() {
    return this.root;
  }

  // 3. Insert a node into the BST
  public void insert(Node node, int data) {
    if (node == null) {
      this.root = new Node(data);
      return;
    }
    if (data <= node.getData()) {
      if (node.getLeft() == null) {
        node.setLeft(new Node(data));
      } else {
        insert(node.getLeft(), data);
      }
    } else {
      if (node.getRight() == null) {
        node.setRight(new Node(data));
      } else {
        insert(node.getRight(), data);
      }
    }
  }

  // 4.1 Pre-order
  public void NLR(Node x) {
    if (x == null) {
      return;
    }
    System.out.print(x.getData() + " ");
    NLR(x.getLeft());
    NLR(x.getRight());
  }

  // 4.2.In-order
  public void LNR(Node x) {
    if (x == null) {
      return;
    }
    LNR(x.getLeft());
    System.out.print(x.getData() + " ");
    LNR(x.getRight());
  }

  // 4.3.Post-order
  public void LRN(Node x) {
    if (x == null) {
      return;
    }
    LRN(x.getLeft());
    LRN(x.getRight());
    System.out.print(x.getData() + " ");
  }

  // 5. Search a key
  public Node search(Node x, int key) {
    if (x == null || x.getData() == key) {
      return x;
    }
    if (key < x.getData()) {
      return search(x.getLeft(), key);
    }
    return search(x.getRight(), key);
  }
  // 6. Find minimum key and maximum key

  public Node min(Node x) {
    if (x.getLeft() == null) {
      return x;
    }
    return min(x.getLeft());
  }

  public Node max(Node x) {
    if (x.getRight() == null) {
      return x;
    }
    return max(x.getRight());
  }

  // 7. Delete the node containing minimum key
  public Node deleteMin(Node x) {
    if (x.getLeft() == null) {
      return x.getRight();
    }
    x.setLeft(deleteMin(x.getLeft()));
    return x;
  }

  // 8. Delete a Node in BST
  public Node delete(Node x, int data) {
    if (x == null) {
      return null;
    }
    if (data < x.getData()) {
      x.setLeft(delete(x.getLeft(), data));
    } else if (data > x.getData()) {
      x.setRight(delete(x.getRight(), data));
    } else {
      if (x.getLeft() == null) {
        return x.getRight();
      }
      if (x.getRight() == null) {
        return x.getLeft();
      }
      Node t = x;
      x = min(t.getRight());
      x.setRight(deleteMin(t.getRight()));
      x.setLeft(t.getLeft());
    }
    return x;
  }

}
