import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
  public static BST readFile(BST bst) {
    try {
      File file = new File("data.inp");
      Scanner sc = new Scanner(file);
      while (sc.hasNextLine()) {
        String line = sc.nextLine();
        String[] parts = line.split(" ");
        Package pack = new Package(parts[0], parts[1], Integer.parseInt(parts[2]));
        bst.insert(pack);
      }
      sc.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
    return bst;
  }

  public static void main(String[] args) {
    BST bst = new BST();
    bst = readFile(bst);
    System.out.println("Cau 2:\n" + bst.findMin().getPackage().getPrice());
    System.out.println("Cau 3:\n" + bst.totalByCountry("Vietnam"));
    System.out.println("Cau 4:");
    for (Node node : bst.findMinByCountry("Thailan")) {
      System.out.print(node.getPackage().getCode()+" ");
    }
    // example data file data.inp
    // P01 Vietnam 100
    // P02 Vietnam 200
    // P03 Vietnam 300
    // P04 Thailan 400
    // P05 Thailan 500
    // P06 Thailan 600
    // P07 Thailan 700
    // P08 HanQuoc 800
    // P09 HanQuoc 900
    // P10 HanQuoc 1000


    
    
  }
}
