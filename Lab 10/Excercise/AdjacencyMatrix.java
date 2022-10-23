import java.util.Arrays;
import java.util.Comparator;

public class AdjacencyMatrix {
  private int[][] adj;
  private final int NUMBER_OF_VERTICES;

  public AdjacencyMatrix(int numberOfVertices) {
    NUMBER_OF_VERTICES = numberOfVertices;
    adj = new int[NUMBER_OF_VERTICES][NUMBER_OF_VERTICES];
  }

  public int size() {
    return NUMBER_OF_VERTICES;
  }

  public void setEdge(int vertexSource, int vertexDestination, int weight) {
    try {
      adj[vertexSource][vertexDestination] = weight;
      adj[vertexDestination][vertexSource] = weight;
    } catch (ArrayIndexOutOfBoundsException indexBounce) {
      System.out.println("The vertices does not exists");
    }
  }

  public int getEdge(int vertexSource, int vertexDestination) {
    try {
      return adj[vertexSource][vertexDestination];
    } catch (ArrayIndexOutOfBoundsException indexBounce) {
      System.out.println("The vertices does not exists");
    }
    return -1;
  }

  public void printGraph() {
    for (int i = 0; i < NUMBER_OF_VERTICES; i++) {
      for (int j = 0; j < NUMBER_OF_VERTICES; j++) {
        System.out.print(adj[i][j] + " ");
      }
      System.out.println();
    }
  }

  public void Kruskal() {
    UnionFind union = new UnionFind(NUMBER_OF_VERTICES);
    int minCost = 0;
    int edgeCount = 0;
    int[][] sortedEdges = new int[NUMBER_OF_VERTICES * NUMBER_OF_VERTICES][3];
    for (int i = 0; i < NUMBER_OF_VERTICES; i++) {
      for (int j = 0; j < NUMBER_OF_VERTICES; j++) {
        if (adj[i][j] != 0) {
          sortedEdges[edgeCount][0] = adj[i][j];
          sortedEdges[edgeCount][1] = i;
          sortedEdges[edgeCount][2] = j;
          edgeCount++;
        }
      }
    }
    Arrays.sort(sortedEdges, new Comparator<int[]>() {
      @Override
      public int compare(int[] o1, int[] o2) {
        return o1[0] - o2[0];
      }
    });
    for (int i = 0; i < edgeCount; i++) {
      int weight = sortedEdges[i][0];
      int vertexSource = sortedEdges[i][1];
      int vertexDestination = sortedEdges[i][2];
      if (union.findSet(vertexSource) != union.findSet(vertexDestination)) {
        union.unionSet(vertexSource, vertexDestination);
        System.out.println("Edge (" + vertexSource + ", " + vertexDestination + "): " + weight);
        minCost += weight;
      }
    }

    System.out.println("Minimum cost: " + minCost);

  }

  public void Prim() {
    int[] parent = new int[NUMBER_OF_VERTICES];
    int[] key = new int[NUMBER_OF_VERTICES];
    boolean[] mstSet = new boolean[NUMBER_OF_VERTICES];
    for (int i = 0; i < NUMBER_OF_VERTICES; i++) {
      key[i] = Integer.MAX_VALUE;
      mstSet[i] = false;
    }
    key[0] = 0;
    parent[0] = -1;
    for (int i = 0; i < NUMBER_OF_VERTICES - 1; i++) {
      int u = minKey(key, mstSet);
      mstSet[u] = true;
      for (int v = 0; v < NUMBER_OF_VERTICES; v++) {
        if (adj[u][v] != 0 && mstSet[v] == false && adj[u][v] < key[v]) {
          parent[v] = u;
          key[v] = adj[u][v];
        }
      }
    }
    int minCost = 0;
    for (int i = 1; i < NUMBER_OF_VERTICES; i++) {
      System.out.println("Edge (" + parent[i] + ", " + i + "): " + adj[i][parent[i]]);
      minCost += adj[i][parent[i]];
    }
    System.out.println("Minimum cost: " + minCost);
    
  }

  private int minKey(int[] key, boolean[] mstSet) {
    int min = Integer.MAX_VALUE;
    int minIndex = -1;
    for (int i = 0; i < NUMBER_OF_VERTICES; i++) {
      if (mstSet[i] == false && key[i] < min) {
        min = key[i];
        minIndex = i;
      }
    }
    return minIndex;
  }




}