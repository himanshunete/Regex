import java.util.Scanner;
import java.util.regex.*;

public class UserRegistrationUC1{
   public static void main(String[] args){
      Scanner enterFirstName = new Scanner(System.in);
      System.out.println(" Enter a Valid First Name ");
      String firstName = enterFirstName.nextLine();
      System.out.println(Pattern.matches("^[A-Z]{1}[a-z]{2,}$",firstName));
   }
}



