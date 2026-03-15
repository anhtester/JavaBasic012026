package PhuongThuc;

public class HamTraVe {

   //Khai báo hàm CÓ trả về giá trị để dùng lại được

   public String getVersion() {
      String version = "2.0.0";
      return version;
   }

   public int getCategoryTotal() {
      int categoryTotal = 100;
      return categoryTotal;
   }

   public float getPriceTotal(String productName){
      float priceTotal = 80.5F;
      System.out.println("Navigate to Cart page");
      System.out.println("Verify product price");
      System.out.println("Get product total price");

      return  priceTotal;
   }

   public static void main(String[] args) {

      HamTraVe object1 = new HamTraVe();

      String version1 = object1.getVersion();
      System.out.println(version1);

      String version2 = object1.getVersion();
      System.out.println(version2);

      String version3 = "3.0.0";

      float priceTotal = object1.getPriceTotal("Laptop");

      //Lấy priceTotal dùng tiếp cho test cases khác để verify priceTotal đúng trong Invoice/Export/Print

   }

}
