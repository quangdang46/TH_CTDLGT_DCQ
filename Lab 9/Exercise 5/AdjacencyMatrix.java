
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

  public AdjacencyList convertToAL() {
    AdjacencyList al = new AdjacencyList(NUMBER_OF_VERTICES);
    for (int i = 0; i < NUMBER_OF_VERTICES; i++) {
      for (int j = 0; j < NUMBER_OF_VERTICES; j++) {
        if (adj[i][j] != 0) {
          al.addEdge(i, j);
        }
      }
    }
    return al;
  }


}