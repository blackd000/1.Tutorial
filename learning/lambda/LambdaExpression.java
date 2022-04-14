package learning.lambda;

public class LambdaExpression {
  public static void main(String[] args) {
    /*
		 * lambda expression = là một tính năng có trong java 8 trở lên
		 * 		và còn được gọi là một phương pháp ẩn danh
		 * 		một cách ngắn hơn để ghi một class ẩn (anonymous classes)
		 * với chỉ một method (hàm)
		 * 
		 * 		//Lưu ý: A functional interface is an 
		 * interface that contains only one abstract method 
		 * They can have only one functionality to exhibit.
		 * 
		 * 		Để mà sử dụng biểu thức lambda thì mình cần dùng 
		 * giao diện chức năng (functional interface) hoặc là giao diện
		 * chức năng được xác định trước (pre-defined functional interface)
		 * về cở bản là các giao diện mà có chứa MỘT abstract method
		 * VD: ActionListener, Runnable, (user-defined)
		 * 
		 * 		Một biểu thức Lambda có thể được dùng ở bất cứ chổ nào mà
		 * functional interface (giao diện chức năng) yêu cầu
		 * 
		 * 		Cách dùng:
		 * "->" là lambda operator (toán tử lambda)
		 * (đối số) -> {câu lệnh/một block code}
		 * (arguments) -> {statement/s}
		 */

    System.out.println("hello");
  }
}
