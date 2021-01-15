import java.util.Scanner;
import java.util.regex.*;

public class UserRegistrationUC4{
   public static void main(String[] args){
      Scanner enterMobileNumber = new Scanner(System.in);
      System.out.println(" Enter a Valid Mobile Number ");
      String mobileNumber = enterMobileNumber.nextLine();
      System.out.println(Pattern.matches( "^[9]{1}[1]{1}[ ][0-9]{10}$", mobileNumber));
   }
}
