
public class Contact {

  // private not to change fields
  private String name;
  private String phone;

  // constructor
  public Contact(String name, String phone) {
    this.name = name;
    this.phone = phone;
  }

  public String getName() {
    return name;
  }

  public String getPhone() {
    return phone;
  }

  // methods doing something here

  public String toString() {
    return name + " | " + phone;
  }

}
