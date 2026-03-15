package PhuongThuc;

public class HamKhongTraVe {

   //Khai báo hàm KHÔNG trả về giá trị để dùng lại

   //Ctrl + /  => Comment code
   //Ctrl + Alt + L  => Format code

   public void showInfo() {
      String name = "Lan";
      String address = "Đắk Lắk";
      System.out.println(name);
      System.out.println(address);
   }

   public void displayVersion() {
      String version = "1.0.0";
      System.out.println(version);
   }


   public static void main(String[] args) {
      HamKhongTraVe object1 = new HamKhongTraVe();

      object1.showInfo();
      object1.displayVersion();

   }

}
