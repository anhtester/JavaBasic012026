package VongLapFOR;

public class ForCoBan {
   public static void main(String[] args) {

      //Khai báo vòng lặp FOR

      for (int i = 0; i <= 10; i+=2) {
         System.out.println("Selenium Java: " + i);
      }

      //Dùng để lặp đoạn code nhất định (ví dụ Login)
      for (int i = 1; i <= 10; i++) {
         System.out.println("Navigate to url...");
         System.out.println("Enter email:");
         System.out.println("Enter password:");
         System.out.println("Click Login button");
         System.out.println("Verify alert message success display");
      }

      //Duyệt Mảng hoặc ArrayList để kiểm tra từng phần tử trong mảng

      //[2,5,6,8,9,24,0]
      //["Dashboard", "Customer", "Project",...]

      //Khai báo mảng số
      int mang1[] = new int[]{2,5,6,8,9,24,0};
      String mang2[] = new String[]{"Dashboard", "Customer", "Project"};

      //Duyệt mảng số bên trên
      for (int i = 0; i < mang1.length; i++) {
         System.out.println(mang1[i]);
      }

      //Duyệt mảng chuỗi bên trên
      for (int i = 0; i < mang2.length; i++) {
         System.out.println(mang2[i]);
      }

   }
}
