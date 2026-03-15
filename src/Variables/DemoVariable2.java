package Variables;

public class DemoVariable2 {

   public String name = "Anh Tester"; //Đây là biến toàn cục

   public static int age = 29; //Đây là biến static

   //Đây là cấu trúc của 1 hàm
   public void getInfo1(){
      String address = "Can Tho"; //Biến local

      System.out.println(address);

      System.out.println(name);
      System.out.println(age);
   }

   public void getInfo2(){
      String address = "Ha Noi";
      System.out.println(address);

      System.out.println(name);
   }


   public static void main(String[] args) {
      System.out.println(age); //Gọi trực tiếp
      System.out.println(DemoVariable2.age); //Thông qua tên class

      //Phải thông qua đối tượng class thì mới gọi sử dụng được biến toàn cục
      DemoVariable2 demo2 = new DemoVariable2();
      demo2.getInfo1();
      demo2.getInfo2();

      System.out.println(demo2.name);
   }

}
