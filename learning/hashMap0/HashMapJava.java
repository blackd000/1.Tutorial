package learning.hashMap0;

import java.util.HashMap;

public class HashMapJava {
  
  public static void main(String[] args) {
    /**
     * HashMap
     * - HashMap implements (thực thi) the Map interface (need import)
     * - HashMap giống như là ArrayList, nhưng HashMap có thể lưu trữ key-value pars (cặp giá trị key) đối tượng (nghĩa là lưu cặp ĐỐI TƯỢNG ==> Dùng int, char thì không được nhưng Integer và Character thì được), cần dùng Wrapper Class (như là Integer, Double)
     * -- VD: (name, email), (username, userID), (country, capital)
     * -- VD: HashMap<String, Double> nameID = new HashMap<String, Double>();
     */

    HashMap<String, String> countries = new HashMap<String, String>();

    //add a key and value
    countries.put("Viet Nam", "Ha Noi");
    countries.put("USA", "Washington DC");
    countries.put("India", "New Delhi");
    countries.put("Russia", "Moscow");

    //System.out.println(countries);

    //1. remove a country on the HashMap
    //countries.remove("Viet Nam");

    //2. chúng ta có thể lấy thủ đô (value) từ nước (key)
    //System.out.println(countries.get("India"));

    //Xóa hết
    //countries.clear();

    /**
     * 3.
     * Hiển thị kích thước của countries, size của HashMap, có bao nhiêu key value pairs (cặp giá trị key) ở đây
     * VD: countries.size();
     * VD: System.out.println(countries.size());
     */

    //4. Thay thế một trong những value của một key cụ thể
    //countries.replace("Viet Nam", "Ho Chi Minh");

    //5. Chúng ta sẽ kiểm tra nếu một key nào đó có nằm trong HashMap không
    // hàm containsKey trả về boolean value
    // VD: System.out.println(countries.containsKey("Viet Nam"));
    // ==> true

    //6. Kiểm tra xem HashMap có chứa giá trị nhất định nào đó không
    // VD: System.out.println(countries.containsValue("Mosscow"));
    // ==> false

    //7. Cách để display HashMap đẹp hơn ==> Dùng for each

    //Lập lập mỗi key trong HashMap
    for(String i : countries.keySet()) {
      // không dùng '+', phải dùng dấu ','
      System.out.printf("%-8s = %s \n" , i , countries.get(i));
    }

    //System.out.println(countries);
  }
}
