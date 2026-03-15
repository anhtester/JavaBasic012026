package DieuKienIFELSE;

public class CauLenhIFELSE {
   public static void main(String[] args) {

      String actualCustomerName = "Nga 0123"; //Từ automation lấy được
      int customerID = 123;

      if (actualCustomerName.equals("Nga 01") && customerID == 123) {
         System.out.println("Test case Add New Customer passed.");
      } else {
         System.out.println("Test case Add New Customer failed.");
      }
   }
}
