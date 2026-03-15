package StaticJava;

public class Counter2 {
   static int count = 0; // sẽ lấy bộ nhớ chỉ một lần

   Counter2() {
      count++;
      System.out.println(count);
   }


   public static void main(String args[]) {

      Counter2 c1 = new Counter2();
      Counter2 c2 = new Counter2();
      Counter2 c3 = new Counter2();

   }
}