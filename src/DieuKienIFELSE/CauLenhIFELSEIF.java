package DieuKienIFELSE;

public class CauLenhIFELSEIF {

   public void checkRoleAndMenuDisplay(String role) {
      if (role.equals("Admin")) {
         System.out.println("Thấy hết 15 menu");
         //Dùng automation để check đủ 15 cái menu
      } else if (role.equals("Customer")) {
         System.out.println("Thấy được 5 menu");
         //Dùng automation để check đủ 5 cái menu
      } else if (role.equals("Employee")) {
         System.out.println("Chuyển đến trang User Home luôn");
      } else {
         System.out.println("Chuyển trang Project Manager");
      }

      //Ở đây có thể thay thế thành 4 IF vẫn được
   }

   public static void main(String[] args) {

      float diemTrungBinh = 1F;

      if (diemTrungBinh >= 8) {
         System.out.println("Học sinh giỏi");
      } else if (diemTrungBinh < 8 && diemTrungBinh >= 6.5) {
         System.out.println("Học sinh khá");
      } else if (diemTrungBinh < 6.5 && diemTrungBinh >= 5) {
         System.out.println("Học sinh trung bình");
      } else if (diemTrungBinh < 5 && diemTrungBinh >= 2) {
         System.out.println("Học sinh yếu");
      } else {
         System.out.println("Ở lại lớp");
      }

   }

}
