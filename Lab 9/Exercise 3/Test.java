import java.util.HashSet;
import java.util.Set;

public class Test {
  public static int countVertices(EdgeList graph) {
    int max = 0;
    for (int i = 0; i < graph.getSize(); i++) {
      IntegerTriple edge = graph.get(i);
      max = Math.max(max, edge.getSource());
      max = Math.max(max, edge.getDest());
    }
    return max + 1;
  }

  public static int getEdges(EdgeList graph) {
    return graph.getSize();
  }


  public static Set<Integer> neighbors(EdgeList edgeList, int u) {
    Set<Integer> neighbors = new HashSet<>();
    for (int i = 0; i < edgeList.getSize(); i++) {
      IntegerTriple edge = edgeList.get(i);
      if (edge.getSource() == u || edge.getDest() == u) {
        neighbors.add(edge.getDest());
        neighbors.add(edge.getSource());
        neighbors.remove(u);
      }
    }
    return neighbors;
  }

  public static void main(String[] args) {
    EdgeList el = new EdgeList();

    String[] graph = {
        "2 1 2",
        "4 0 1",
        "4 0 2",
        "6 0 3",
        "6 0 4",
        "8 2 3",
        "9 3 4",
    };

    for (int i = 0; i < graph.length; i++) {
      String[] parts = graph[i].split(" ");
      el.addEdge(Integer.parseInt(parts[0]),
          Integer.parseInt(parts[1]),
          Integer.parseInt(parts[2]));
    }

    System.out.println("Number of vertices: " + countVertices(el));
    System.out.println("Number of edges: " + getEdges(el));

    System.out.println("Neighbors of 0: " + neighbors(el, 0));
    System.out.println("Neighbors of 1: " + neighbors(el, 1));

  }
}
