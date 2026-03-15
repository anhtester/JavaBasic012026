package ToanTu;

public class ToanTuLogic {
   public static void main(String[] args) {

      int a = 10;
      int b = 20;
      int c = 30;


      System.out.println((a > b) && (b < c));
      System.out.println((5 + 10) * 2);
      System.out.println(5 + (10 * 2));

      //Toán tử AND &&
      int age = 20;
      boolean hasID = true;
      String address = "Hà Nội";

      if (age >= 18 && hasID == true && address.equals("Cần Thơ")) {
         System.out.println("Được phép vào");
      } else {
         System.out.println("Không được truy cập");
      }

      //Toán tử HOẶC ||
      boolean isAdmin = false;
      boolean isManager = false;

      if (isAdmin || isManager) {
         System.out.println("Có quyền truy cập");
      }

      String alertMessage = "Category has been inserted successfully";
      String alertMessageActual = "Dùng Selenium để lấy";
      String categoryName = "Dùng Selenium để lấy";

      if (alertMessageActual.equals(alertMessage) && categoryName.equals("Category 01")) {
         System.out.println("Add new category success");
      }

      if(!(age > 20)){
         System.out.println("Được xét đi NVQS");
      }

      int number1, number2;
      number1 = number2 = 5;

      System.out.println(number1 + number2);

   }
}
