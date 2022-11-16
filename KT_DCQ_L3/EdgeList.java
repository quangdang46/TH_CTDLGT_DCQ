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
        ArrayList<String> names = new ArrayList<String>();
        for (VisitedObject obj : visitedObjects) {
            if (obj.getVisitor().getId() == v && obj.getRating() >= r) {
                names.add(obj.getDestination().getName());
            }
        }
        return names;
    }

    // Cau 3
    public double getAverageRating(int id) {
        double sum = 0;
        int count = 0;
        for (VisitedObject obj : visitedObjects) {
            if (obj.getDestination().getId() == id) {
                sum += obj.getRating();
                count++;
            }
        }
        return sum / count;
    }

    // Cau 4
    public ArrayList<String> findEvenDegree() {
        ArrayList<String> names = new ArrayList<String>();
        for (VisitedObject obj : visitedObjects) {
            int count = 0;
            for (VisitedObject obj1 : visitedObjects) {
                if (obj.getDestination().getId() == obj1.getDestination().getId()) {
                    count++;
                }
            }
            if (count % 2 == 0) {
                names.add(obj.getDestination().getName());
            }
        }
        return names;
    }
}
