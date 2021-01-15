import java.util.Scanner;
import java.util.regex.*;

public class UserRegistrationUC9{
   public static void main(String[] args){
      Scanner enterEmail = new Scanner(System.in);
      System.out.println(" Enter a Sample Email ");
      String sampleEmail = enterEmail.nextLine();
      System.out.println(Pattern.matches( "^[0-9a-zA-Z]+([.]{1}[_+-])*([0-9a-zA-Z]+)*@[0-9A-Za-z]+.([c]{1}[o]{1}[m]{1})*([n]{1}[e]{1}[t]{1})*[,]*([.][a]{1}[u]{1})*([.][c]{1}[o]{1}[m]{1})*$", sampleEmail ));
   }
}


