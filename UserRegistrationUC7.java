import java.util.Scanner;
import java.util.regex.*;

public class UserRegistrationUC7{
   public static void main(String[] args){
      Scanner enterRule3 = new Scanner(System.in);
      System.out.println(" Enter a Password Rule-3 ");
      String passwordRule3 = enterRule3.nextLine();
      System.out.println(Pattern.matches( "^[A-Z]{1}[a-zA-Z]{7,}([0-9]+)$", passwordRule3));
   }
}


