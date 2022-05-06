package learning.encryption;

import java.util.ArrayList;
import java.util.Scanner;

public class Frame {
  private char firstKey;
  private Scanner input;
  private ArrayList<Character> list;
  private ArrayList<Character> shuffledList;

  public Frame() {
    firstKey = ' ';
    input = new Scanner(System.in);
    list = new ArrayList<Character>();
    shuffledList = new ArrayList<Character>();

    start();
  }

  private void start() {
    while(true) {
      for(int i = 0; i < 30; i++) {
        System.out.println();
      }

      System.out.println("(N)ewKey, (G)etKey, (E)ncrypt, (D)ecrypt, (Q)uit");
      System.out.print("Enter your choice(N,G,E,D,Q): ");

      char response = Character.toUpperCase(input.nextLine().charAt(0));

      switch(response) {
      case 'N':
        newKey();
        System.out.println("Bitch");
        break;

      case 'G':
        getKey();
        break;

      case 'Q':
        return;

      default:
        System.out.println("what the fuck are you doing, please type the key that make sense");
      }
    }
  }

  private void newKey() {

    
  }

  private void getKey() {

  }
}
