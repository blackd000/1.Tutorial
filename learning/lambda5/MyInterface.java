package learning.lambda5;

@FunctionalInterface
public interface MyInterface {

  // funtional interface only contain only one abstract method
  public void message(String name, char symbol);
}