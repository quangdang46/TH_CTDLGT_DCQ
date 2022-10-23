public class IntegerTriple {
  private Integer weight;
  private Integer source;
  private Integer dest;

  public IntegerTriple(Integer weight, Integer source, Integer dest) {
    this.weight = weight;
    this.source = source;
    this.dest = dest;
  }

  public Integer getWeight() {
    return weight;
  }

  public Integer getSource() {
    return source;
  }

  public Integer getDest() {
    return dest;
  }

  public void setWeight(Integer weight) {
    this.weight = weight;
  }

  public void setSource(Integer source) {
    this.source = source;
  }

  public void setDest(Integer dest) {
    this.dest = dest;
  }

  @Override
  public String toString() {
    return this.weight + " " + this.source + " " + this.dest;
  }

}


