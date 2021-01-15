import java.util.Scanner;
public class UserRegistrationUC1{
   public static void main(String[] args){
      Scanner enterFirstName = new Scanner(System.in);

      PATTERN_FOR_VALID_FIRST_NAME = "^[A-Z]{1}[a-z]{2,}$"
      System.out.println("Enter Valid First Name");
      String firstName = enterFirstName.nextLine();

      if ( firstName ==  PATTERN_FOR_VALID_FIRST_NAME ) {
         System.out.println(" first Name is valid ");
      else
         System.out.println("  first Name is not valid ");
      }

   }
}



