package learning.enum1;

import javax.swing.JFrame;

enum Planet {
  MERCURY(1), 
  VENUS(2), 
  EARTH(3), 
  MARS(4), 
  JUPITER(5), 
  SATURN(6);

  public int number;

  private Planet(int number) {
    this.number = number; // gán giá trị cho number để in ra number
  }
}

public class EnumJava {
  public static void main(String[] args) {
    /*
    enum = enumerated (liệt kê)
    ==> Một danh sách có thứ tự của các items (mục) trong collection (bộ sưu tập)

    ==> Các item trong enum là constant
    ==> enum là một nhóm gồm các constants hành xử (that behave) y chang như là các đối tượng
    */

    /*
    JFrame frame = new JFrame("hello");

    frame.setSize(750, 550);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
    */

    Planet planet = Planet.VENUS;

    //canILiveHere(planet.EARTH);
    canILiveHere(planet);

  }

  static void canILiveHere(Planet planet) {
    switch(planet) {
      case EARTH:
      System.out.println("you live on earth");
      System.out.println("this is planet #" + planet.number);
      break;

      case VENUS:
      System.out.println("you live on venus");
      System.out.println("this is planet #" + planet.number);
      break;

      default:
      System.out.println("you dont live any where");
    }
  }
}