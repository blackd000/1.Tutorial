package assignment.bai1;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Font;
import java.awt.BorderLayout;

public class FrameAddOfficer extends JFrame {
  final private Font mainFont = new Font("segoe print", Font.BOLD, 15);
  Officer officer = null;
  JTextField nameText;
  JTextField ageText;
  JTextField genderText;
  JTextField addressText;
  JTextField rankText = new JTextField("");
  JTextField branchText = new JTextField("");
  JTextField workText = new JTextField("");

  public FrameAddOfficer(String who, OfficerManager officerManager) {
    /**************** Panel add officer ****************/
    JLabel label = new JLabel("Add " + who, SwingConstants.CENTER);
    label.setFont(mainFont);
    label.setForeground(Color.red);

    /****************/
    JLabel nameLabel = new JLabel("Enter the name of this "+who);
    nameLabel.setFont(mainFont);
    nameLabel.setForeground(Color.blue);

    nameText = new JTextField("");
    nameText.setFont(mainFont);

    //
    JLabel ageLabel = new JLabel("Enter the age of this "+who);
    ageLabel.setFont(mainFont);
    ageLabel.setForeground(Color.blue);

    ageText = new JTextField("");
    ageText.setFont(mainFont);

    //
    JLabel genderLabel = new JLabel("Enter the gender of this "+who);
    genderLabel.setFont(mainFont);
    genderLabel.setForeground(Color.blue);

    genderText = new JTextField("");
    genderText.setFont(mainFont);

    //
    JLabel addressLabel = new JLabel("Enter the address of this "+who);
    addressLabel.setFont(mainFont);
    addressLabel.setForeground(Color.blue);

    addressText = new JTextField("");
    addressText.setFont(mainFont);

    //create panel for frame
    JPanel panelAdd = new JPanel();
    panelAdd.setLayout(new GridLayout(0, 1, 10, 10));
    panelAdd.add(label);
    panelAdd.add(nameLabel);
    panelAdd.add(nameText);
    panelAdd.add(ageLabel);
    panelAdd.add(ageText);
    panelAdd.add(genderLabel);
    panelAdd.add(genderText);
    panelAdd.add(addressLabel);
    panelAdd.add(addressText);

    if(who.equals("worker")) {
      JLabel rankLabel = new JLabel("Enter the rank of this "+who);
      rankLabel.setFont(mainFont);
      rankLabel.setForeground(Color.blue);

      rankText = new JTextField();
      rankText.setFont(mainFont);

      panelAdd.add(rankLabel);
      panelAdd.add(rankText);
    } else if(who.equals("engineer")) {
      JLabel branchLabel = new JLabel("Enter the branch of this "+who);
      branchLabel.setFont(mainFont);
      branchLabel.setForeground(Color.blue);

      branchText = new JTextField();
      branchText.setFont(mainFont);

      panelAdd.add(branchLabel);
      panelAdd.add(branchText);
    } else if(who.equals("employee")) {
      JLabel workLabel = new JLabel("Enter the work of this "+who);
      workLabel.setFont(mainFont);
      workLabel.setForeground(Color.blue);

      workText = new JTextField();
      workText.setFont(mainFont);

      panelAdd.add(workLabel);
      panelAdd.add(workText);      
    }


    /**************** Panel button officer ****************/
    JButton addButotn = new JButton("Add");
    addButotn.setFont(mainFont);
    addButotn.addActionListener((e) -> {
      if(nameText.getText().equals("") || ageText.getText().equals("") || genderText.getText().equals("") || addressText.getText().equals("")) {
        JOptionPane.showMessageDialog(null, "fill the blank", "ERROR", JOptionPane.ERROR_MESSAGE);
      } else if((who.equals("worker") && rankText.getText().equals("")) || (who.equals("engineer") && branchText.getText().equals("")) || (who.equals("employee") && workText.getText().equals(""))) {
        JOptionPane.showMessageDialog(null, "fill the blank", "ERROR", JOptionPane.ERROR_MESSAGE);
      } else {

        if(addMethod(who, officerManager)) {
          nameText.setText("");
          ageText.setText("");
          genderText.setText("");
          addressText.setText("");
          rankText.setText("");
          branchText.setText("");
          workText.setText("");
        }
      }
    });

    JButton returnButton = new JButton("Return");
    returnButton.setFont(mainFont);
    returnButton.addActionListener((e) -> {
      new Bai1Frame(officerManager);
      this.dispose();
    });

    JPanel panelButtonAdd = new JPanel();
    panelButtonAdd.setLayout(new GridLayout(1, 2, 10, 10));
    panelButtonAdd.add(addButotn);
    panelButtonAdd.add(returnButton);


    /**************** Form frame ****************/
    this.add(panelAdd, BorderLayout.NORTH);
    this.add(panelButtonAdd, BorderLayout.SOUTH);

    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setSize(500, 700);
    //this.setMinimumSize(new Dimension(350, 450));
    this.setLocationRelativeTo(null);
    this.setVisible(true);
  }

  private boolean addMethod(String who, OfficerManager officerManager) {

    try {
      if(who.equals("worker")) {
        officer = new Worker(nameText.getText(), Integer.parseInt(rankText.getText()), genderText.getText(), addressText.getText(), Integer.parseInt(rankText.getText()));
      } else if(who.equals("engineer")) {
        officer = new Engineer(nameText.getText(), Integer.parseInt(ageText.getText()), genderText.getText(), addressText.getText(), branchText.getText());
      } else if(who.equals("employee")) {
        officer = new Employee(nameText.getText(), Integer.parseInt(ageText.getText()), genderText.getText(), addressText.getText(), workText.getText());
      }
    } catch(NumberFormatException n) {
      JOptionPane.showMessageDialog(null, "Check age, if you are adding Worker check rank too", "ERROR", JOptionPane.ERROR_MESSAGE);
      return false;
    }

    officerManager.addOfficer(officer);
    return true;
  }
}
