import java.util.ArrayList;
public class Test {
  public static void main(String[] args) {
    ArrayList<Student> list = new ArrayList<Student>();
    list.add(new Student("D", 8, 7, 9));
    list.add(new Student("A", 4.9, 8, 9));
    list.add(new Student("N", 7, 5, 9));
    list.add(new Student("G", 3.6, 9, 9));
    list.add(new Student("F", 8, 8, 3));
    list.add(new Student("A", 9, 7, 8));
    list.add(new Student("T", 7.5, 3, 9));
    list.add(new Student("Q", 9, 5.5, 8));
    list.add(new Student("N", 7, 8, 8));
    list.add(new Student("H", 8, 9, 9));
    list.add(new Student("Q", 6.9, 9, 8.2));
    // list.sort(new StudentComparator());
    list.sort(new StudentComparator().reversed());

    //
    for (Student s : list) {
      System.out.println(s);
    }

  }
}
