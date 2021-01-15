import java.util.Scanner;
import java.util.regex.*;

public class UserRegistrationUC6{
   public static void main(String[] args){
      Scanner enterRule2 = new Scanner(System.in);
      System.out.println(" Enter a Password Rule-2 ");
      String passwordRule2 = enterRule2.nextLine();
      System.out.println(Pattern.matches( "^[A-Z]{1}[a-zA-Z]{7,}$", passwordRule2));
   }
}
