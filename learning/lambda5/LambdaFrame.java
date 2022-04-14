package learning.lambda5;

import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;

public class LambdaFrame extends JFrame {

  public LambdaFrame() {
    this.setSize(750, 550);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setLayout(new FlowLayout());

    /**
     * //Nếu như làm theo cách Anonymous class
     * 
     * JButton button = new JButton();
     * button.addActionListener(new ActionListener() {
     *    
     *    @Override
     *    public void ActionPreform() {
     *      System.out.println("hello");
     *    }
     * });
     */

    JButton button = new JButton("My button");
    button.addActionListener((e) -> System.out.println("hello"));

    JButton button2 = new JButton("Another button");
    button2.addActionListener((e) -> {
      System.out.println("nani the fuck");
      System.out.println("yes yes yes");
    });

    this.add(button);
    this.add(button2);

    this.setVisible(true);
  }
}
