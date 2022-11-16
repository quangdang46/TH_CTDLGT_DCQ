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
    public int findNumberDestinations() {
        HashSet<Integer> set = new HashSet<Integer>();
        for (VisitedObject obj : visitedObjects) {
            set.add(obj.getDestination().getId());
        }
        return set.size();
    }

    // Cau 2
    public ArrayList<String> getVisitorsByDestinationRating(int d, int r) {
        ArrayList<String> data = new ArrayList<String>();
        for (VisitedObject obj : visitedObjects) {
            if (obj.getDestination().getId() == d && obj.getRating() == r) {
                data.add(obj.getVisitor().getName());
            }
        }
        return data;
    }

    // Cau 3
    public double getAverageRating(int id) {
        double sum = 0;
        int count = 0;
        for (VisitedObject obj : visitedObjects) {
            if (obj.getVisitor().getId() == id) {
                sum += obj.getRating();
                count++;
            }
        }
        return sum / count;
    }

    // Cau 4
    public ArrayList<String> findOddDegree() {
        // code here
        return null;
    }

}
