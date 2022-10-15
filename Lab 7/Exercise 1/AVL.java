
public class AVL {
  private Node root;

  public AVL() {
    this.root = null;
  }

  public Node getRoot() {
    return this.root;
  }

  public void setRoot(Node root) {
    this.root = root;
  }
  public int height(Node node) {
    if (node == null) {
      return -1;
    }
    return node.getHeight();
  }

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

  public void NLR(Node x) {
    if (x == null) {
      return;
    }
    System.out.print(x.getData() + " ");
    NLR(x.getLeft());
    NLR(x.getRight());
  }

  public int checkBalance(Node x) {
    if (x == null) {
      return 0;
    }
    return height(x.getLeft()) - height(x.getRight());
  }

  public Node rotateLeft(Node x) {
    Node y = x.getRight();
    x.setRight(y.getLeft());
    y.setLeft(x);
    x.setHeight(Math.max(height(x.getLeft()), height(x.getRight())) + 1);
    y.setHeight(Math.max(height(y.getLeft()), height(y.getRight())) + 1);
    return y;
  }

  public Node rotateRight(Node x) {
    Node y = x.getLeft();
    x.setLeft(y.getRight());
    y.setRight(x);
    x.setHeight(Math.max(height(x.getLeft()), height(x.getRight())) + 1);
    y.setHeight(Math.max(height(y.getLeft()), height(y.getRight())) + 1);
    return y;
  }

  public Node rotateRightLeft(Node x) {
    x.setRight(rotateRight(x.getRight()));
    return rotateLeft(x);
  }


  public Node rotateLeftRight(Node x) {
    x.setLeft(rotateLeft(x.getLeft()));
    return rotateRight(x);
  }

  public Node insertBalanced(Node x, int data) {
    if (x == null) {
      return new Node(data);
    }
    if (data < x.getData()) {
      x.setLeft(insertBalanced(x.getLeft(), data));
    } else {
      x.setRight(insertBalanced(x.getRight(), data));
    }
    x.setHeight(Math.max(height(x.getLeft()), height(x.getRight())) + 1);
    int balance = checkBalance(x);
    if (balance > 1) {
      if (data < x.getLeft().getData()) {
        return rotateRight(x);
      } else {
        x.setLeft(rotateLeft(x.getLeft()));
        return rotateRight(x);
      }
    }
    if (balance < -1) {
      if (data > x.getRight().getData()) {
        return rotateLeft(x);
      } else {
        x.setRight(rotateRight(x.getRight()));
        return rotateLeft(x);
      }
    }
    return x;
  }

  public void printTree(Node curr, String indent, boolean last) {
    if (curr == null)
      return;

    System.out.print(indent);
    if (last) {
      System.out.print("R----");
      indent += "   ";
    } else {
      System.out.print("L----");
      indent += "|  ";
    }
    System.out.println(curr.getData());
    printTree(curr.getLeft(), indent, false);
    printTree(curr.getRight(), indent, true);

  }
  

  public Node minValueNode(Node node) {
    Node current = node;
    while (current.getLeft() != null) {
      current = current.getLeft();
    }
    return current;
  }

  public Node delete(Node node, int data) {
    if (node == null) {
      return null;
    }
    
    if (data < node.getData()) {
      node.setLeft(delete(node.getLeft(), data));
    } else if (data > node.getData()) {
      node.setRight(delete(node.getRight(), data));
    } else {
      if (node.getLeft() == null) {
        return node.getRight();
      } else if (node.getRight() == null) {
        return node.getLeft();
      }
      node.setData(minValueNode(node.getRight()).getData());
      node.setRight(delete(node.getRight(), node.getData()));
    }
    node.setHeight(Math.max(height(node.getLeft()), height(node.getRight())) + 1);
    int balance = checkBalance(node);
    if (balance > 1) {
      if (checkBalance(node.getLeft()) >= 0) {
        return rotateRight(node);
      } else {
        node.setLeft(rotateLeft(node.getLeft()));
        return rotateRight(node);
      }
    }
    if (balance < -1) {
      if (checkBalance(node.getRight()) <= 0) {
        return rotateLeft(node);
      } else {
        node.setRight(rotateRight(node.getRight()));
        return rotateLeft(node);
      }
    }
    return node;

  }
}
