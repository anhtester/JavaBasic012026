package StaticJava;

public class KhoiStatic {

   static String browser = "";

   static String getBrowser() {
      return browser;
   }

   static{
      System.out.println("Browser Initialized");
      browser = System.getProperty("browser");
      getBrowser();
   }

   public static void main(String[] args) {
      System.out.println("Chạy test case");
   }
}
