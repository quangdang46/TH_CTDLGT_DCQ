import java.util.ArrayList;
import java.util.HashSet;

public class EdgeList {

    private ArrayList<VisitedObject> visitedObjects;

    public EdgeList() {
        this.visitedObjects = new ArrayList<VisitedObject>();
    }

    public void addEdge(VisitedObject obj) {
        visitedObjects.add(obj);
    }

    // Cau 1
    public int findNumberVisitors() {
        int count = 0;
        HashSet<Integer> set = new HashSet<Integer>();
        for (VisitedObject obj : visitedObjects) {
            if (!set.contains(obj.getVisitor().getId())) {
                set.add(obj.getVisitor().getId());
                count++;
            }
        }
        return count;
    }

    // Cau 2
    public ArrayList<String> getDestinationsByVisitorRating(int v, int r) {

        return null;
    }

    // Cau 3
    public double getAverageRating(int id) {

        return 1.0;
    }

    // Cau 4
    public ArrayList<String> findEvenDegree() {

        return null;
    }
}
