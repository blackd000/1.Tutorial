package learning.hashMap0;

import java.util.HashMap;

public class BT_HashMap {
  
  public static void main(String[] args) {
    
    HashMap<Integer, String> employee = new HashMap<Integer, String>();

    employee.put(1, "James");
    employee.put(23, "Jack");
    employee.put(342, "Mariza");
    employee.put(59, "Pewdiepie");

    for(Integer i : employee.keySet()) {
      System.out.printf("%-3d = %s\n", i, employee.get(i));
    }
  }
}
