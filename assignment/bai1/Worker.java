package assignment.bai1;

public class Worker extends Officer {
  private int rank;

  public Worker(String name, int age, String gender, String address, int rank) {
    super(name, age, gender, address);
    this.rank = rank;
  }

  @Override
  public String toString() {
    return "Your name is: " + this.name + "\n" +
            "Your age is: " + this.age + "\n" +
            "Your gender is: " + this.gender + "\n" +
            "Your address is: " + this.address + "\n" +
            "Your rank is: " + this.rank + "\n\n";
  }
}
