package XuLyChuoiString;

public class XuLyChuoi {
   public static void main(String[] args) {

      String str1 = "Selenium Java - Web Test Automation";
      String str2 = "Playwright Java - Web&API Test Automation";

      //Chữ hoa thường
      System.out.println(str1.toUpperCase());
      System.out.println(str1.toLowerCase());

      //Lấy ký tự tại vị trí chỉ định
      System.out.println(str1.charAt(14)); //Bắt đầu vị trí 0

      //Lấy độ dài chuỗi
      System.out.println(str1.length());

      //Cắt chuỗi
      System.out.println(str1.substring(16));
      System.out.println(str1.substring(16, 19));

      //Kiểm tra so sánh chuỗi
      System.out.println(str1.contains("Selenium"));
      System.out.println(str2.contains("Playwright"));

      System.out.println(str1.equals("Selenium Java - Web Test Automation"));
      System.out.println(str2.equals("Playwright"));

      //Lấy số 40 trong chuỗi
      String textTableFooter = "Showing 1 to 25 of 40 entries";

      //Cách 1 - không ổn định bằng cách 2
      System.out.println(textTableFooter.substring(19, 21));

      //Cách 2
      String mangGiaTriSauTach[] = textTableFooter.split(" "); //Tách chuỗi theo khoảng trắng
      System.out.println(mangGiaTriSauTach[5]);

      //Kiểm tra chuỗi có bị rỗng không
      System.out.println("=======================");
      String chuoi1 = "";
      String chuoi2 = "          ";

      boolean check = chuoi1.isEmpty();
      System.out.println(check);
      System.out.println(chuoi2.isEmpty());

      System.out.println(chuoi1.isBlank());
      System.out.println(chuoi2.isBlank());
      System.out.println("=======================");

      //Nối chuỗi lại với nhau
      String str3 = "Thư viện automation: " + "Selenium";
      System.out.println(str3);
      System.out.println(str3.concat(" Playwright"));

      String actual = "27 / 40";
      String expected = "27" + " / " + mangGiaTriSauTach[5];
      System.out.println(expected);
      System.out.println(actual.equals(expected));

      //Thay thế chuỗi
      System.out.println(str1.replace("Java", "C#"));
      String str4 = "Selenium Java Selenium C# Selenium Python";
      System.out.println(str4.replaceAll("Selenium", "Playwright"));

      //Kiểm tra đoạn đầu và đoạn cuối
      System.out.println("startsWith: " + str1.startsWith("Selenium"));
      System.out.println("endsWith: " + str1.endsWith("Test Automation"));

      String str5 = "   Kiểm thử phần mềm   ";
      System.out.println(str5);
      System.out.println(str5.trim());

      System.out.println(str5.trim().replaceAll(" ", ""));
      System.out.println(str5.trim().replaceAll(" ", "").length());

      // Chuyển đổi số thành chuỗi
      String stringNumber = "1000";
      int number = 2000;
      System.out.println(stringNumber + 5);
      System.out.println("Chuyển số thành chuỗi: " + (String.valueOf(number) + 10));
      System.out.println("Chuyển chuỗi số thành số: " + (Integer.valueOf(stringNumber) + 5));

   }
}
