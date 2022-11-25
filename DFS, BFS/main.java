import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

public class main {

  public static void main(String[] args) {

    int[][] graph = new int[][] {
        // 0 1 2 3 4 5 6 7 8 9
        { 0, 0, 0, 0, 0, 1, 0, 1, 0, 0 },
        { 0, 0, 0, 0, 0, 0, 1, 0, 1, 0 },
        { 0, 0, 0, 1, 0, 0, 0, 1, 0, 0 },
        { 0, 0, 1, 0, 0, 0, 0, 0, 1, 0 },
        { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1 },
        { 1, 0, 0, 0, 0, 0, 1, 0, 0, 0 },
        { 0, 1, 0, 0, 0, 1, 0, 0, 0, 0 },
        { 1, 0, 1, 0, 0, 0, 0, 0, 0, 0 },
        { 0, 1, 0, 1, 0, 0, 0, 0, 0, 1 },
        { 0, 0, 0, 0, 1, 0, 0, 0, 1, 0 },

    };

    // DFS
    Set<Integer> visited = new HashSet<>();
    Stack<Integer> stack = new Stack<>();
    stack.push(0);
    visited.add(0);
    while (!stack.isEmpty()) {
      int node = stack.pop();
      System.out.print(node + " ");

      for (int i = 0; i < graph[node].length; i++) {
        if (graph[node][i] == 1 && !visited.contains(i)) {
          stack.push(i);
          visited.add(i);
        }
      }
    }

    // // BFS
    // Queue<Integer> queue = new LinkedList<>();
    // Set<Integer> visited = new HashSet<>();
    // queue.add(0);
    // visited.add(0);
    // while (!queue.isEmpty()) {
    //   int node = queue.poll();
    //   System.out.print(node + " ");
    //   for (int i = 0; i < graph[node].length; i++) {
    //     if (graph[node][i] == 1 && !visited.contains(i)) {
    //       queue.add(i);
    //       visited.add(i);
    //     }
    //   }
    // }
  }

}