package DataCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListDemo {
   public static void main(String[] args) {

      //- Cho phép lưu trữ giá trị trùng
      //- Dữ liệu có thứ tự vị trí

      //Khai báo List dạng 1
      List<String> listMenu = new ArrayList<>();

      //Khai báo List dạng 2
      ArrayList<String> listMenu1 = new ArrayList<>();

      //Thêm phần từ vào List
      listMenu.add("Dashboard");
      listMenu.add("Customers");
      listMenu.add("Projects");
      listMenu.add("Tasks");
      listMenu.add("Dashboard");
      listMenu.add("Contracts");
      listMenu.add("Projects");

      //Get phần tử theo vị trí (bắt đầu là 0)

      System.out.println(listMenu.get(2));
      System.out.println("===============");

      //Duyệt hết List
      for (String menu : listMenu) {
         System.out.println(menu);
      }

      System.out.println("===============");
      listMenu.add("Reports"); //Thêm phần tử mới với giá trị chỉ định

      // Thêm phần từ theo vị trí chỉ định (bắt đầu vị trí là 0)
      listMenu.add(1, "Supports");

      for (String menu : listMenu) {
         System.out.println(menu);
      }

      System.out.println("===============");
      listMenu.remove("Dashboard"); //Xoá phần tử theo giá trị "Dashboard"
      for (String menu : listMenu) {
         System.out.println(menu);
      }

      System.out.println("===============");
      //Kiểm tra giá trị trong List
      System.out.println("Kiểm tra menu Reports: " + listMenu.contains("Reports"));

      System.out.println("**********************");
      //So sánh 2 List

      List<String> listMenu2 = new ArrayList<>();
      listMenu2.add("Supports");
      listMenu2.add("Customers");
      listMenu2.add("Projects");
      listMenu2.add("Tasks");
      listMenu2.add("Dashboard");
      listMenu2.add("Contracts");
      listMenu2.add("Projects");
      listMenu2.add("Reports");

      for (String menu : listMenu2) {
         System.out.println(menu);
      }

      System.out.println("So sánh 2 list: " + listMenu.equals(listMenu2));

      //Sắp xếp tăng dần các phần tử
      System.out.println("**********************");
      Collections.sort(listMenu);

      for (String menu : listMenu) {
         System.out.println(menu);
      }

   }
}
