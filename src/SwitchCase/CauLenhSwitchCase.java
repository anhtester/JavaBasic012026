package SwitchCase;

public class CauLenhSwitchCase {

   public static void main(String[] args) {

      String browser = "Chrome";

      switch (browser) {
         case "Chrome":
            System.out.println("Khởi tạo trình duyệt Chrome");
            //WebDriver driver = new ChromeDriver();
            break;
         case "Edge":
            System.out.println("Khởi tạo trình duyệt Edge");
            //WebDriver driver = new EdgeDriver();
            break;
         case "Firefox":
            System.out.println("Khởi tạo trình duyệt Firefox");
            //WebDriver driver = new FirefoxDriver();
            break;
         default:
            System.out.println("Khởi tạo trình duyệt Default là Chrome");
            //WebDriver driver = new ChromeDriver();
      }

   }

}
