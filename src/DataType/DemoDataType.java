package DataType;

public class DemoDataType {
   public static void main(String[] args) {

      String name = "Selenium Java";
      String gioiTinh = "Nam";
      String kituChuoi = "&";

      char kitu1 = '#';
      char kitu2 = '@';
      char kitu3 = '&';
      char kitu4 = '$';

      //Kiểu dữ liệu chỉ lưu SỐ NGUYÊN
      byte number1 = 0;
      short number2 = 32000;
      int number3 = 2100000000; //Thường dùng trong Test Automation
      long number4 = 3000000000L;

      //Kiểu dữ liệu chỉ lưu SỐ THỰC
      float laiSuatNganHang = 5.2F;
      double soPi = 3.14963590759; //Thường dùng trong Test Automation

      //Kiểu dữ liệu ĐÚNG SAI
      boolean check = true;
      boolean result = false;
      boolean result2 = true;
      String actual = "Login successfully.";
      String expected = "Login success";
      boolean checkCondition = 15 > 10;

      //Kiểu ký tự
      char kitu = 'a';
      char isDeleted = '1';
      //Ví dụ so sánh chuỗi chứa kí tự
      boolean checkGia = ((String.valueOf(number2) + '$').equals("32000$"));
      System.out.println(checkGia);

      System.out.println(number1 + number2);
      System.out.println(number2);
      System.out.println(number3);
      System.out.println(number4);
      System.out.println(laiSuatNganHang);
      System.out.println(soPi);
      System.out.println(checkCondition);
   }
}
