import java.util.LinkedList;

public class AdjacencyList {
  private int V;
  private LinkedList<Integer>[] adj;
  
  public AdjacencyList(int v) {
    V = v;
    adj = new LinkedList[v];
    for (int i = 0; i < v; i++) {
      adj[i] = new LinkedList<Integer>();
    }
  }

  public int getV() {
    return V;
  }

  public void addEdge(int v, int w) {
    adj[v].add(w);
  }



  public LinkedList<Integer>[] getAdj() {
    return adj;
  }

  public void printGraph() {
    for (int i = 0; i < V; i++) {
      System.out.print("Vertex " + i + ": ");
      System.out.print("head");
      for (Integer j : adj[i]) {
        System.out.print(" -> " + j);
      }
      System.out.println();
    }
  }
}
