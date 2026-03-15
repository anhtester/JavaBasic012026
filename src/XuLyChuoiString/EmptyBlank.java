package XuLyChuoiString;

public class EmptyBlank {
   public static void main(String[] args) {

      String chuoi1 = "";
      String chuoi2 = "      ";

      if(chuoi2.isEmpty() == true){
         System.out.println("Rỗng");
      }else {
         System.out.println("Không rỗng");
      }

      if(chuoi2.isBlank() == true){
         System.out.println("Rỗng");
         System.out.println("Test case bị fail, tại vì nó không chứa text nào cả");
      }else {
         System.out.println("Không rỗng");
         System.out.println("Test case passed");
      }



   }
}
