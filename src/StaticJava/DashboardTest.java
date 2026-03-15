package StaticJava;

import PhuongThuc.pages.LoginPage;

public class DashboardTest {
   //public String browser = "Chrome";  //Tốn 1 bộ nhớ

   public void test01_CheckCustomerTotal(){

      System.out.println(ConfigData.browser);
      System.out.println(ConfigData.window_size);

      System.out.println("Test success");
      LoginPage loginPage = new LoginPage();
      loginPage.loginSuccess("admin@example.com", "123456");

      PhuongThucStatic.clickElement("Search input");
      PhuongThucStatic.setText("10", "Search input");

      PhuongThucStatic.clickElement("Add customer button");
      PhuongThucStatic.setText("10", "VAT");
      PhuongThucStatic.setText("Can Tho", "Address");
   }

   public static void main(String[] args) {
      DashboardTest dashboardTest = new DashboardTest();
      dashboardTest.test01_CheckCustomerTotal();
   }
}
