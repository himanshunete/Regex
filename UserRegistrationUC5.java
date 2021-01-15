import java.util.Scanner;
import java.util.regex.*;

public class UserRegistrationUC5{
   public static void main(String[] args){
      Scanner enterRule1 = new Scanner(System.in);
      System.out.println(" Enter a Password Rule-1 ");
      String passwordRule1 = enterRule1.nextLine();
      System.out.println(Pattern.matches( "^[A-Za-z]{8,}$", passwordRule1));
   }
}
