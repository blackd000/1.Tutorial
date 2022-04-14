package learning.innerClasses3;

public class InnerClasses {
  public static void main(String[] args) {
    /**
     * *********inner class là: 
     * - Một class nằm trong một class khác.
     * - Hữu ích nếu class cần được giới hạn trong một scope (phạm vi)
     * - Thường là private (không quan trọng)
     * - Giúp group classes thuộc về nhau
     * - Cực kỳ hữu dụng cho listeners cho một events nào đó (dùng anonymous classes)
     * - Precursor (người đi trước) cho anonymous inner classes
     */

     //trong đây mình có thể tạo được thực thể Outside class và Inside class

     //Trước hết tạo Outside trước
     Outside outside = new Outside();
     System.out.println(outside.x);

     //Tạo Inside
     Outside.Inside inside = outside.new Inside();
     System.out.println(inside.y+"\n\n");

     //System.out.println(outside.x + inside.y);
     inside.greeting();
  }
}