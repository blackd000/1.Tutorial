package learning.anonymousInerClasses4;

import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame {
  JButton[] button = new JButton[3];

  public MyFrame() {
    this.setSize(750, 550);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setLayout(new FlowLayout());

    initButton();
    for(int i = 0; i < 3; i++) {
      this.add(button[i]);
    }

    button[0].addActionListener(new ActionListener() {

      @Override
      public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        System.out.println("You pressed button #1");
      }
      
    });
    button[1].addActionListener(new ActionListener() {

      @Override
      public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        System.out.println("You pressed button #2");
      }
      
    });
    button[2].addActionListener(new ActionListener() {

      @Override
      public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        System.out.println("You pressed button #3");
      }
      
    });

    this.setVisible(true);
  }

  private void initButton() {
    for(int i = 0; i < 3; i++) {
      button[i] = new JButton("Button #"+(i+1));
    }
  }

}
