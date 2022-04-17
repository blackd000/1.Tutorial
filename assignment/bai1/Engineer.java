package assignment.bai1;

public class Engineer extends Officer {
  private String branch;

  public Engineer(String name, int age, String gender, String address, String branch) {
    super(name, age, gender, address);
    this.branch = branch;
  }

  @Override
  public String toString() {
    return "Your name is: " + this.name + "\n" +
            "Your age is: " + this.age + "\n" +
            "Your gender is: " + this.gender + "\n" +
            "Your address is: " + this.address + "\n" +
            "Your branch is: " + this.branch + "\n\n";
  }
}
