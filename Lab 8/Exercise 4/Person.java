public class Person {
  private String name;
  private int priority;

  public Person(String name, int priority) {
    this.name = name;
    this.priority = priority;
  }

  public String getName() {
    return name;
  }

  public int getPriority() {
    return priority;
  }

  @Override
  public String toString() {
    return this.name + "_" + this.priority;
  }

}
