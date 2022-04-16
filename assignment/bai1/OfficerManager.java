package assignment.bai1;

import java.util.ArrayList;

public class OfficerManager {
  private ArrayList<Officer> officers = new ArrayList<Officer>();

  public OfficerManager() {

  }

  public void addOfficer(Officer officer) {
    officers.add(officer);
  }

  public void searchOfficer(String officerName) {
    for(Officer i : officers) {
      if(i.getName().equals(officerName)) {
        System.out.println(i);
        return;
      }
    }
  }

  public void displayOfficer() {
    for(Officer i : officers) {
      System.out.println(i);
    }
  }
}
