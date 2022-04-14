package learning.lambda5;

import javax.swing.event.SwingPropertyChangeSupport;

public class LambdaExpression {
  public static void main(String[] args) {
    /*
		 * *********lambda expression
		 * - Là một tính năng có trong java 8 trở lên
		 * - Và còn được gọi là một phương pháp ẩn danh
		 * - Một cách ngắn hơn để ghi một class ẩn (anonymous classes) với chỉ một method (hàm)
		 * 
		 * 		//Lưu ý: A functional interface is an 
		 * interface that contains only one abstract method 
		 * They can have only one functionality to exhibit.
		 * 
		 * - Để mà sử dụng biểu thức lambda thì mình cần dùng 
		 * giao diện chức năng (functional interface) hoặc là giao diện
		 * chức năng được xác định trước (pre-defined functional interface)
		 * về cở bản là các giao diện mà có chứa MỘT abstract method
		 * VD: ActionListener, Runnable, (user-defined)
		 * 
		 * - Một biểu thức Lambda có thể được dùng ở bất cứ chổ nào mà
		 * functional interface (giao diện chức năng) yêu cầu
		 * 
		 * 		*****Cách dùng:
		 * "->" là lambda operator (toán tử lambda)
		 * (đối số) -> {câu lệnh/một block code}
		 * (arguments) -> {statement/s}
		 */

		 // tạo một instance interface (cũng giống như tạo một instance của 1 class như một object)

		// // // dùng theo cách anonymous class
		// // MyInterface myInterface = new MyInterface() {
		// //  @Override
		// // 	public void message() {
		// // 		System.out.println("Hello bois");
		// // 	}
		// // };
		
		// // //C1
		// // MyInterface myInterface = () -> System.out.println("hello world");

		// //C2
		// String name = "Bruh";
		// char symbol = '*';

		// MyInterface myInterface = (x, y) -> {
		// 	System.out.println("Hello bois " + x);
		// 	System.out.println("My name is Dong " + x + y);
		// };

		// MyInterface myInterface2 = (x, y) -> {
		// 	System.out.println("Why am i so handsome "+x);
		// 	System.out.println("I love novel"+ y);
		// };

		// myInterface.message(name, symbol);
		// myInterface2.message(name, symbol);

		//=================================================================//

		new LambdaFrame();
  }
}
