package learning.thread7;

public class ThreadJava {
  public static void main(String[] args) {
    //System.out.println(Thread.activeCount());
    //System.out.println(Thread.currentThread().getName());


    /**
     * implement Rnnable insterface và pass instance như là đối số (argument) to Thread()
     */
    Thread thread1 = new Thread(new MyRunnable());
    Thread thread2 = new Thread(new MyRunnable() {
      @Override
      public void run() {
        for(int i = 10; i > 0; i--) {
          System.out.println(i + " -> Thread#2");
          try {
            Thread.sleep(1000);
          } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
          }
        }

        System.out.println("Xong Thread#2 btw");
      }
    });

    /**
     * - Set thread 2 có độ ưu tiên cao hơn
     * - Nếu như mình tạo thread mà chung với thread main thì nó có chung độ ưu tiên nghĩa là priotity = 5
     */
    thread2.setPriority(6);

    thread1.start();

    /**
     * Đ/N: the calling thread (main thread) sẽ đợi cho tới khi cái thread được chỉ định chết hoặc là hết thời gian (mlilis giây)
     * 
     * Nghĩa là thread nào gọi hàm này thì sẽ được execute trước sau khi thread này chết thì mới tới mấy cái thread khác
     * 
     * **Lưu ý:
     * - Phải để join ở đằng sau thằng thread1.start();
     */
    try {
      thread1.join(2000); //Đợi 2 giây (ngay cả khi trong quá trình execute) thì chuyển qua Thread khác)
    } catch (InterruptedException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
     

    thread2.start();

  }
}
