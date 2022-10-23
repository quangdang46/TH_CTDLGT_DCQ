

public class Test {
  public static void main(String[] args) {
    AdjacencyMatrix adj = new AdjacencyMatrix(7);
    int[][] graph = {
        { 0, 1, 1, 0, 0, 0, 0 },
        { 1, 0, 1, 1, 0, 0, 0 },
        { 1, 1, 0, 0, 1, 1, 0 },
        { 0, 1, 0, 0, 1, 0, 0 },
        { 0, 0, 1, 1, 0, 1, 0 },
        { 0, 0, 0, 0, 1, 0, 1 },
        { 0, 0, 0, 0, 0, 1, 0 }
    };
    for (int i = 0; i < graph.length; i++) {
      for (int j = 0; j < graph.length; j++) {
        adj.setEdge(i, j, graph[i][j]);
      }
    }

    adj.BFS(0);
    System.out.println();
    adj.DFS(0);

    System.out.println();

    adj.DFS_Stack(0);

    System.out.println();

    System.out.println(adj.IsReachable(2, 3));


  }

}