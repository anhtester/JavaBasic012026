package DieuKienIFELSE;

public class CauLenhIF {

   public void createBrowser(String browser) {

      String browserSystem = System.getProperty("browser");

      //mvn clean test -Dbrowser=edge
      //mvn clean test -Dbrowser=firefox
      //mvn clean test -Dbrowser=safari

      if(browserSystem != null){
         browser =  browserSystem; //edge
      }

      System.out.println(browser);

   }


   public static void main(String[] args) {

      String actualCustomerName = "Nga 0123"; //Từ automation lấy được
      int customerID = 123;

      if (actualCustomerName.equals("Nga 01") && customerID == 123) {
         System.out.println("Test case Add New Customer passed. 1");
      }

//      if (customerID == 123) {
//         System.out.println("Test case Add New Customer passed. 2");
//      }

   }

}
