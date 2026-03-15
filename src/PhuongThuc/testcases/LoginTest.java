package PhuongThuc.testcases;

import PhuongThuc.pages.LoginPage;

public class LoginTest {

   public void test_01_LoginSuccess() {
      LoginPage loginPage = new LoginPage();
      loginPage.loginSuccess("admin@example.com", "admin");
   }

   public void test_02_LoginFailWithWrongEmail() {
      LoginPage loginPage = new LoginPage();
      loginPage.loginFail("admin1234@example.com", "admin");
   }

   public void test_03_LoginFailWithWrongPassword() {
      LoginPage loginPage = new LoginPage();
      loginPage.loginFail("admin@example.com", "admin12345");
   }

}
