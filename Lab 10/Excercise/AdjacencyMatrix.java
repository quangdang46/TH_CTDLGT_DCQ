
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
    int[][] result = new int[NUMBER_OF_VERTICES][NUMBER_OF_VERTICES];
    int[] edge = new int[3];
    int index = 0;
    int total = 0;

    while (index < NUMBER_OF_VERTICES - 1) {
      edge = getMinEdge();
      if (!union.isSameSet(edge[0], edge[1])) {
        result[index][0] = edge[0];
        result[index][1] = edge[1];
        result[index][2] = edge[2];
        union.unionSet(edge[0], edge[1]);
        index++;
        total += edge[2];
      }
      adj[edge[0]][edge[1]] = Integer.MAX_VALUE;
      adj[edge[1]][edge[0]] = Integer.MAX_VALUE;
    }
    
    //print mst
    for (int i = 0; i < NUMBER_OF_VERTICES - 1; i++) {
      System.out.println("Edge: " + result[i][0] + " - " + result[i][1] + " weight: " + result[i][2]);
    }

  }

  private int[] getMinEdge() {
    int[] edge = new int[3];
    edge[0] = -1;
    edge[1] = -1;
    edge[2] = Integer.MAX_VALUE;
    for (int i = 0; i < NUMBER_OF_VERTICES; i++) {
      for (int j = 0; j < NUMBER_OF_VERTICES; j++) {
        if (adj[i][j] < edge[2]) {
          edge[0] = i;
          edge[1] = j;
          edge[2] = adj[i][j];
        }
      }
    }
    return edge;
  }



}