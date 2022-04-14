package learning.anonymousObject2;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.FlowLayout;

import java.util.ArrayList;

public class AnonymousObject {
  public static void main(String[] args) {

    JFrame frame = new JFrame("demon");
    ArrayList<JLabel> deck = new ArrayList<JLabel>();

    for(int i = 1; i <= 12; i++) {
      deck.add(new JLabel(new ImageIcon("learning\\picture\\" + i + ".png")));
      frame.add(deck.get(i-1));
    }

    frame.setSize(750, 550);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setLayout(new FlowLayout());

    frame.setVisible(true);
  }
  
}
