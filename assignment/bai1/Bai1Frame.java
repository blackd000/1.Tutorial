package assignment.bai1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Bai1Frame extends JFrame {
  final private Font mainFont = new Font("segoe print", Font.BOLD, 15);

  public Bai1Frame(OfficerManager officerManager) {

    /****************** Form Panel ******************/
    JLabel officerForm = new JLabel("Officer Form", SwingConstants.CENTER);
    officerForm.setFont(mainFont);
    officerForm.setForeground(Color.red);

    /****************/ 
    JLabel addLabel = new JLabel("Add officer");
    addLabel.setFont(mainFont);
    addLabel.setForeground(Color.blue);

    JButton addButton = new JButton("Add");
    addButton.setFont(mainFont);
    addButton.addActionListener((e) -> {
      new AddOfficer(officerManager);
      this.dispose();
    });

    /****************/ 
    JLabel searchLabel = new JLabel("Search officer");
    searchLabel.setFont(mainFont);
    searchLabel.setForeground(Color.blue);

    JTextField searchText = new JTextField();
    searchText.setFont(mainFont);

    JButton searchButton = new JButton("Search");
    searchButton.setFont(mainFont);
    searchButton.addActionListener((e) -> {
      officerManager.searchOfficer(searchText.getText());
      searchText.setText("");
    });

    /****************/ 
    JLabel displayLabel = new JLabel("Display officer");
    displayLabel.setFont(mainFont);
    displayLabel.setForeground(Color.blue);

    JButton displayButton = new JButton("Display");
    displayButton.setFont(mainFont);
    displayButton.addActionListener((e) -> {
      officerManager.displayOfficer();
    });

    /****************/ 
    JPanel panel0 = new JPanel();
    panel0.setLayout(new GridLayout(0, 1, 10, 10));
    panel0.add(officerForm);
    panel0.add(addLabel);
    panel0.add(addButton);
    panel0.add(searchLabel);
    panel0.add(searchText);
    panel0.add(searchButton);
    panel0.add(displayLabel);
    panel0.add(displayButton);


    /****************** Form Frame ******************/
    this.add(panel0, BorderLayout.NORTH);

    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setSize(500, 700);
    //this.setMinimumSize(new Dimension(350, 450));
    this.setLocationRelativeTo(null);
    this.setVisible(true);
  }
}
