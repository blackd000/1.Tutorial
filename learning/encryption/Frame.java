package learning.encryption;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Frame {
  private Scanner input;
  private ArrayList<Character> list;
  private ArrayList<Character> shuffledList;
  private char[] letters;

  public Frame() {
    input = new Scanner(System.in);
    list = new ArrayList<Character>();
    shuffledList = new ArrayList<Character>();
    letters = new char[100];

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
        break;

      case 'G':
        getKey();
        break;

      case 'E':
        encrypt();
        break;

      case 'D':
        decrypt();
        break;

      case 'Q':
        return;

      default:
        System.out.println("what the fuck are you doing, please type the key that make sense");
      }

      System.out.print("\nPress enter to continue...");
      input.nextLine();
    }
  }

  private void newKey() {
    list.clear();
    shuffledList.clear();

    for(int i = 32; i < 127; i++) {
      list.add(Character.valueOf((char)i));
      //System.out.print((char)i);
    }

    shuffledList = new ArrayList(list); //making a copy of an ArrayList
    Collections.shuffle(shuffledList); //shuffle list

    System.out.println("**A new key has been generated**");
  }

  private void getKey() {
    System.out.println("Key:");

    for(Character i : list) {
      System.out.print(i);
    }
    System.out.println();
    for(Character i : shuffledList) {
      System.out.print(i);
    }

    System.out.println();
  }

  private void encrypt() {
    System.out.print("Enter your message: ");
    String userInput = input.nextLine();

    for(int i = 0; i < userInput.length(); i++) {
      for(Character j : list) {
        if(userInput.charAt(i) == j) {
          letters[i] = shuffledList.get(list.indexOf(j));
          break;
        }
      }
    }

    System.out.println("\nYour new message is:");
    for(char i : letters) {
      System.out.print(i);
    }

    System.out.println();
  }

  private void decrypt() {
    System.out.println("Your message is: ");

    for(int i = 0; i < letters.length; i++) {
      for(Character j : shuffledList) {
        if(letters[i] == j) {
          letters[i] = list.get(shuffledList.indexOf(j));
          System.out.print(letters[i]);
          break;
        }
      }
    }

    System.out.println();
  }
}
