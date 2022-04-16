package assignment.bai1;

public class Employee extends Officer {
  private String work;

  public Employee(String name, short age, String gender, String address, String work) {
    super(name, age, gender, address);
    this.work = work;
  }

  @Override
  public String toString() {
    return "Your name is: " + this.name + "\n" +
            "Your age is: " + this.age + "\n" +
            "Your gender is: " + this.gender + "\n" +
            "Your address is: " + this.address + "\n" +
            "Your work is: " + this.work + "\n\n";
  }
}
