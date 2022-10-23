public class Test {

  public static void main(String[] args) {
    AdjacencyMatrix adj = new AdjacencyMatrix(5);
    int[][] data = {
        { 0, 4, 0, 0, 5 },
        { 4, 0, 3, 6, 1 },
        { 0, 3, 0, 6, 2 },
        { 0, 6, 6, 0, 7 },
        { 5, 1, 2, 7, 0 }
    };
    for (int i = 0; i < data.length; i++) {
      for (int j = 0; j < data[i].length; j++) {
        adj.setEdge(i, j, data[i][j]);
      }
    }

    adj.Kruskal();



  }
}
