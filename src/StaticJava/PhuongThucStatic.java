package StaticJava;

public class PhuongThucStatic {

   public static int timeout = 1000;

   public static void clickElement(String element) {
      System.out.println("Wait for timeout: " + timeout);
      System.out.println("Click on element: " + element);
   }

   public static void setText(String text, String element) {
      System.out.println("Wait for timeout: " + timeout);
      System.out.println("Set text " + text + " on element " + element);
   }

}
