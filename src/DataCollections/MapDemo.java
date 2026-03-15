package DataCollections;

import StaticJava.ConfigData;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo {
   public static void main(String[] args) {

      //- Dạng Key - Value

      //Khai báo Map
      Map<String, String> map = new TreeMap<>();

      //Thêm dữ liệu
//      map.put("browser", "chrome");
      map.put("os", "windows");
      map.put("headless", "true");
//      map.put("browser", "edge");
      map.put("screenshot", "true");

      //In dữ liệu từ Map
      //Truy xuất giá trị theo từng key
      System.out.println(map.get("os"));

      System.out.println("=====================");
      //Get hết giá trị của key và value
      for (Map.Entry<String, String> entry : map.entrySet()) {
         System.out.println(entry.getKey() + ": " + entry.getValue());
      }

      //Xoá theo key
      System.out.println("=====================");
      map.remove("headless");
      for (Map.Entry<String, String> entry : map.entrySet()) {
         System.out.println(entry.getKey() + ": " + entry.getValue());
      }

      //Kiểm tra Key và Value
      System.out.println("Check key: " + map.containsKey("headless"));
      System.out.println("Check value: " + map.containsValue("edge"));

      System.out.println("**************************");
      if(map.containsKey("browser")==true){
         System.out.println(map.get("browser"));
      }else {
         System.out.println(ConfigData.browser);
      }

   }
}
