import java.util.Scanner;
import java.util.regex.*;

public class UserRegistrationUC2{
   public static void main(String[] args){
      Scanner enterLastName = new Scanner(System.in);
      System.out.println(" Enter a Valid Last Name ");
      String lastName = enterLastName.nextLine();
      System.out.println(Pattern.matches("^[A-Z]{1}[a-z]{2,}$", lastName));
   }
}
