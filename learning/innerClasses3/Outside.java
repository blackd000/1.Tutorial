package learning.innerClasses3;

public class Outside {
  String x = "Hello ";

  public class Inside {
    public String y = "Dong dep trai";

    //methods
    public void greeting() {
      System.out.println(x+y);
    }
  }
}
