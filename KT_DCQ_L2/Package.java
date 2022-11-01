public class Package {
  private String code;

  private String country;
  private int price;

  public Package(String code, String country, int price) {
    this.code = code;
    this.country = country;
    this.price = price;
  }

  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public int getPrice() {
    return price;
  }
  
  public void setPrice(int price) {
    this.price = price;
  }
}