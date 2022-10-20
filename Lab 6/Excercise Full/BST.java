import java.util.LinkedList;
import java.util.Queue;

public class BST {
  private Node root;
  private int rootValue=Integer.MAX_VALUE;

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

  public void RNL(Node x) {
    if (x == null) {
      return;
    }
    RNL(x.getRight());
    System.out.print(x.getData() + " ");
    RNL(x.getLeft());
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

  // Ex3
  public void printAsc() {
    LNR(this.root);
  }

  // Ex4
  public void printDesc() {
    RNL(this.root);
  }

  // Ex5
  public boolean contains(int key) {
    if (root == null) {
      return false;
    }
    Node temp = root;
    while (temp != null) {
      if (temp.getData() == key) {
        return true;
      }
      if (key < temp.getData()) {
        temp = temp.getLeft();
      } else {
        temp = temp.getRight();
      }
    }
    return false;
  }

  // Ex6

  public void deleteMax() {
    // max(this.root);

    if (root == null) {
      return;
    }
    Node temp = root;
    Node parent = null;
    while (temp.getRight() != null) {
      parent = temp;
      temp = temp.getRight();
    }
    if (parent == null) {
      root = root.getLeft();
    } else {
      parent.setRight(temp.getLeft());
    }
  }

  // Ex7
  public void delete_pre() {
    if (root == null) {
      return;
    }
    Node temp = root;
    Node parent = null;
    while (temp.getRight() != null) {
      parent = temp;
      temp = temp.getRight();
    }
    if (parent == null) {
      root = root.getLeft();
    } else {
      parent.setRight(temp.getLeft());
    }
  }

  // Ex8
  public int height() {
    if (root == null) {
      return 0;
    }
    Queue<Node> queue = new LinkedList<>();
    queue.add(root);
    int height = 0;
    while (!queue.isEmpty()) {
      int size = queue.size();
      while (size > 0) {
        Node temp = queue.poll();
        if (temp.getLeft() != null) {
          queue.add(temp.getLeft());
        }
        if (temp.getRight() != null) {
          queue.add(temp.getRight());
        }
        size--;
      }
      height++;
    }
    return height;
  }

  public int height(Node x) {
    if (x == null) {
      return 0;
    }
    return 1 + Math.max(height(x.getLeft()), height(x.getRight()));
  }

  // Ex9
  public int sum(Node x) {
    if (rootValue == Integer.MAX_VALUE) {
      rootValue = x.getData();
    } else {
      rootValue = 0;
    }
    if (x == null) {
      return 0;
    }
    return x.getData()-rootValue + sum(x.getLeft()) + sum(x.getRight());
  }
  // Ex10

  public int sum() {
    if (root == null) {
      return 0;
    }
    Queue<Node> queue = new LinkedList<>();
    queue.add(root);
    int sum = 0;
    while (!queue.isEmpty()) {
      int size = queue.size();
      while (size > 0) {
        Node temp = queue.poll();
        sum += temp.getData();
        if (temp.getLeft() != null) {
          queue.add(temp.getLeft());
        }
        if (temp.getRight() != null) {
          queue.add(temp.getRight());
        }
        size--;
      }
    }
    return sum;
  }
}
