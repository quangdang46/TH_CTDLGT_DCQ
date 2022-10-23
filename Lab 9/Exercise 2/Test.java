import java.util.ArrayList;

public class Test {

  public static int countVertices(AdjacencyList graph) {
    return graph.getV();
  }

  public static int countEdges(AdjacencyList graph) {
    int count = 0;
    for (int i = 0; i < graph.getV(); i++) {
      count += (graph.getAdj()[i].size() - 1);
    }
    return count / 2;
  }

  public static ArrayList<Integer> neighbors(AdjacencyList graph, int u) {
    ArrayList<Integer> neighbors = new ArrayList<Integer>();
    for (Integer i : graph.getAdj()[u - 1]) {
      if (i != u - 1) {
        neighbors.add(i + 1);
      }
    }
    return neighbors;

  }

  
  public static boolean exists(AdjacencyList graph, int u,int v) {
    return graph.getAdj()[u - 1].contains(v - 1);
  }
  public static void main(String[] args) {
    AdjacencyList adl = new AdjacencyList(7);

    String[] graph = {
        "0 1 2",
        "1 0 2 3",
        "2 0 1 4",
        "3 1 4",
        "4 2 3 5",
        "5 4 6",
        "6 5"
    };

    for (int i = 0; i < graph.length; i++) {
      String[] line = graph[i].split(" ");
      for (String s : line) {
        int v = Integer.parseInt(line[0]);
        int w = Integer.parseInt(s);
        adl.addEdge(v, w);
      }
    }
    adl.printGraph();

    System.out.println("Number of vertices: " + countVertices(adl));
    System.out.println("Number of edges: " + countEdges(adl));

    System.out.println("Neighbors of vertex 1: " + neighbors(adl, 1));

    System.out.println("Does edge (1, 2) exist " + exists(adl, 1, 2));
    System.out.println("Does edge (3, 7) exist " + exists(adl, 7, 3));
  }
}
