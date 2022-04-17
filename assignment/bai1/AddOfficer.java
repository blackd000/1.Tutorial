package assignment.bai1;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;

import java.awt.Font;

public class AddOfficer extends JFrame {
  final private Font mainFont = new Font("segoe print", Font.BOLD, 15);
  
  public AddOfficer(OfficerManager officerManager) {

    /**************** Form choose Button ****************/
    JButton workerButton = new JButton("Add worker");
    workerButton.setFont(mainFont);
    workerButton.addActionListener((e) -> {
      new FrameAddOfficer("worker", officerManager);
      this.dispose();
    });

    JButton engineerButton = new JButton("Add engineer");
    engineerButton.setFont(mainFont);
    engineerButton.addActionListener((e) -> {
      new FrameAddOfficer("engineer", officerManager);
      this.dispose();
    });

    JButton employeeButton = new JButton("Add employee");
    employeeButton.setFont(mainFont);
    employeeButton.addActionListener((e) -> {
      new FrameAddOfficer("employee", officerManager);
      this.dispose();
    });

    /*******/
    JPanel panelChoose = new JPanel();
    panelChoose.add(workerButton);
    panelChoose.add(engineerButton);
    panelChoose.add(employeeButton);


    /**************** Form frame ****************/
    this.add(panelChoose);

    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setSize(500, 700);
    //this.setMinimumSize(new Dimension(350, 450));
    this.setLocationRelativeTo(null);
    this.setVisible(true);
  }

}
