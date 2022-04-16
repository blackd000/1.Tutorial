package assignment.bai1;

public class Officer {
  protected String name;
  protected short age;
  protected String gender;
  protected String address;

  public Officer(String name, short age, String gender, String address) {
    this.name = name;
    this.age = age;
    this.gender = gender;
    this.address = address;
  }

  public String getName() {
    return this.name;
  }

}
