package learning.thread7;

public class MyRunnable implements Runnable {
  
  @Override
  public void run() {
    for(int i = 1; i <= 5; i++) {
      System.out.println(i + " -> Thread#1");
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }
    }

    System.out.println("Done bitch!!! Thread#1 btw");
  }
}
