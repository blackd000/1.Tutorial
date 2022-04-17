package assignment.bai1;

import java.util.ArrayList;

public class OfficerManager {
  private ArrayList<Officer> officers;

  public OfficerManager() {
    officers = new ArrayList<>();
  }

  public void addOfficer(Officer officer) {
    this.officers.add(officer);
  }

  public void searchOfficer(String officerName) {
    for(Officer i : this.officers) {
      if(i.getName().equals(officerName)) {
        System.out.println(i);
        return;
      }
    }
  }

  public void displayOfficer() {
    for(int i = 0; i < officers.size(); i++) {
      System.out.println("*Officer number " + (i+1));
      System.out.println(officers.get(i));
    }
  }
}
