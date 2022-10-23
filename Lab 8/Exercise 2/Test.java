public class Test {
  
  public static void main(String[] args) {
    MinHeap minHeap = new MinHeap(10);
    minHeap.insert(3);
    minHeap.insert(2);
    minHeap.insert(1);
    minHeap.insert(5);
    minHeap.insert(4);
    minHeap.insert(6);
    minHeap.insert(7);
    minHeap.insert(8);
    minHeap.insert(9);
    minHeap.insert(10);
    minHeap.insert(0);
    


    int[] arr = minHeap.heap;
    
    for (int i = 1; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }

  }

}
