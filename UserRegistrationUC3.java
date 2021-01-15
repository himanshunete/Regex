import java.util.Scanner;
import java.util.regex.*;

public class UserRegistrationUC3{
   public static void main(String[] args){
      Scanner enterEmail = new Scanner(System.in);
      System.out.println(" Enter a Valid Email ");
      String email = enterEmail.nextLine();
      System.out.println(Pattern.matches( "^[a-zA-Z]{2,}([.][0-9a-zA-Z]+)*@[0-9A-Za-z]+.[c]{1}[o]{1}([.][i]{1}[n]{1})*$", email));
   }
}
