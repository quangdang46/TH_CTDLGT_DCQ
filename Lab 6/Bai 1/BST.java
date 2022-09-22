public class BST {
  private Node root;

  public BST() {
    this.root = null;
  }

  public Node getRoot() {
    return root;
  }

  public void setRoot(Node root) {
    this.root = root;
  }

  public void insert(int key) {
    Node newNode = new Node(key);
    if (root == null) {
      root = newNode;
    } else {
      Node current = root;
      Node parent = null;
      while (true) {
        parent = current;
        if (key < current.getKey()) {
          current = current.getLeft();
          if (current == null) {
            parent.setLeft(newNode);
            return;
          }
        } else {
          current = current.getRight();
          if (current == null) {
            parent.setRight(newNode);
            return;
          }
        }
      }
    }
  }

  public void inOrder(Node localRoot) {
    if (localRoot != null) {
      inOrder(localRoot.getLeft());
      System.out.print(localRoot.getKey() + " ");
      inOrder(localRoot.getRight());
    }
  }

  public void preOrder(Node localRoot) {
    if (localRoot != null) {
      System.out.print(localRoot.getKey() + " ");
      preOrder(localRoot.getLeft());
      preOrder(localRoot.getRight());
    }
  }

  public void postOrder(Node localRoot) {
    if (localRoot != null) {
      postOrder(localRoot.getLeft());
      postOrder(localRoot.getRight());
      System.out.print(localRoot.getKey() + " ");
    }
  }

  public Node find(int key) {
    Node current = root;
    while (current.getKey() != key) {
      if (key < current.getKey()) {
        current = current.getLeft();
      } else {
        current = current.getRight();
      }
      if (current == null) {
        return null;
      }
    }
    return current;
  }

  public boolean delete(int key) {
    Node current = root;
    Node parent = root;
    boolean isLeftChild = true;

    while (current.getKey() != key) {
      parent = current;
      if (key < current.getKey()) {
        isLeftChild = true;
        current = current.getLeft();
      } else {
        isLeftChild = false;
        current = current.getRight();
      }
      if (current == null) {
        return false;
      }
    }

    if (current.getLeft() == null && current.getRight() == null) {
      if (current == root) {
        root = null;
      } else if (isLeftChild) {
        parent.setLeft(null);
      } else {
        parent.setRight(null);
      }
    } else if (current.getRight() == null) {
      if (current == root) {
        root = current.getLeft();
      } else if (isLeftChild) {
        parent.setLeft(current.getLeft());
      } else {
        parent.setRight(current.getLeft());
      }
    } else if (current.getLeft() == null) {
      if (current == root) {
        root = current.getRight();
      } else if (isLeftChild) {
        parent.setLeft(current.getRight());
      } else {
        parent.setRight(current.getRight());
      }
    } else {
      Node successor = getSuccessor(current);
      if (current == root) {
        root = successor;
      } else if (isLeftChild) {
        parent.setLeft(successor);
      } else {
        parent.setRight(successor);
      }
      successor.setLeft(current.getLeft());
    }
    return true;

  }

  public Node getSuccessor(Node delNode) {
    Node successorParent = delNode;
    Node successor = delNode;
    Node current = delNode.getRight();
    while (current != null) {
      successorParent = successor;
      successor = current;
      current = current.getLeft();
    }
    if (successor != delNode.getRight()) {
      successorParent.setLeft(successor.getRight());
      successor.setRight(delNode.getRight());
    }
    return successor;
  }
}
