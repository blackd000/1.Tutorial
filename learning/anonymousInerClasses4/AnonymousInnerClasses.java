package learning.anonymousInerClasses4;

public class AnonymousInnerClasses {
  public static void main(String[] args) {
    /**
   * ********Anonymous class là:
   * - Một inner class không có tên
   * - Chỉ có một thực thể (single object) được tạo từ nó
   * - Thực thể này có thể có "extras"(bổ sung) hoặc là "changes"(thay đổi)
   * - Và không cần tạo một innerclass riêng biệt (separate innerclass) vì nó chỉ sử dụng nó một lần (còn nếu muốn sử dụng nhiều lần thì separate nó ra)
   * - Giúp chúng ta tránh được cluttering code (code bừa bộn) với một class name
   * 
   * - Syntax thì giống với một constructor ngoại trừ đây cũng có một class definition (định nghĩa lớp) trong một block of code.
   * 
   * ==> GREAT FOR LISTENERS
   */

    // Greeting greeting = new Greeting() {
    //   //Ở đây giống như một class mới vậy

    //   @Override
    //   public void welcome() {
    //     System.out.println("Hello guys and gals, it's me mutahar");
    //   }
    // };
    // Greeting greeting2 = new Greeting();

    // greeting.welcome();
    // greeting2.welcome();

    new MyFrame();
  }
}
