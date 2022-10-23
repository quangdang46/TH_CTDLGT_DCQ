import java.util.Vector;

public class EdgeList {
  private Vector<IntegerTriple> edges;

  public EdgeList() {
    edges = new Vector<IntegerTriple>();
  }

  public int getSize() {
    return edges.size();
  }

  public IntegerTriple get(int index) {
    return edges.get(index);
  }
  public void addEdge(int w, int u, int v) {
    edges.add(new IntegerTriple(w, u, v));
  }

  public void printGraph() {
    for (int i = 0; i < edges.size(); i++) {
      System.out.println(edges.get(i));
    }
  }
}
