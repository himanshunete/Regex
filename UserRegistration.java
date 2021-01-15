import java.util.Scanner;
import java.util.regex.*;

class AllCases{
   static void firstname(){
      Scanner enterFirstName = new Scanner(System.in);
      System.out.println(" Enter a Valid First Name ");
      String firstName = enterFirstName.nextLine();
      System.out.println(Pattern.matches("^[A-Z]{1}[a-z]{2,}$",firstName));
   }
   static void lastname(){
      Scanner enterLastName = new Scanner(System.in);
      System.out.println(" Enter a Valid Last Name ");
      String lastName = enterLastName.nextLine();
      System.out.println(Pattern.matches("^[A-Z]{1}[a-z]{2,}$", lastName));

   }
   static void email(){
      Scanner enterEmail = new Scanner(System.in);
      System.out.println(" Enter a Valid Email ");
      String email = enterEmail.nextLine();
      System.out.println(Pattern.matches( "^[0-9a-zA-Z]+([.]{1}[_+-])*([0-9a-zA-Z]+)*@[0-9A-Za-z]+.([c]{1}[o]{1}[m]{1})*([n]{1}[e]{1}[t]{1})*[,]*([.][a]{1}[u]{1})*([.][c]{1}[o]{1}[m]{1})*$", email));
   }
   static void mobilenumber(){
      Scanner enterMobileNumber = new Scanner(System.in);
      System.out.println(" Enter a Valid Mobile Number ");
      String mobileNumber = enterMobileNumber.nextLine();
      System.out.println(Pattern.matches( "^[9]{1}[1]{1}[ ][0-9]{10}$", mobileNumber));
   }
   static void password(){
      Scanner enterAllRules = new Scanner(System.in);
      System.out.println(" Enter a Password  ");
      String password = enterAllRules.nextLine();
      System.out.println(Pattern.matches( "^[A-Z]{1}[a-zA-Z]{7,}[@#$%^&*+-_]{1}([0-9]+)*$", password));
   }
}
public class UserRegistration{  
   public static void main(String[] args){
      AllCases namefirstobj = new AllCases();
      namefirstobj.firstname();     
      AllCases surnameobj = new AllCases();
      surnameobj.lastname();
      AllCases emailobj = new AllCases();
      emailobj.email();
      AllCases mobilenumberobj = new AllCases();
      mobilenumberobj.mobilenumber();
      AllCases passwordobj = new AllCases();
      passwordobj.password();
   }
}

