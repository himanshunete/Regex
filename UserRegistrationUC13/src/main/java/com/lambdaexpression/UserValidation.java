package com.lambdaexpression;
import java.util.regex.Pattern ;

interface IUserValidationFirstName {
	boolean patternMatch(String firstName);
}
interface IUserValidationLastName {
	boolean patternMatch(String lastName);
}
interface IUserValidationEmailAddress {
	boolean patternMatch(String email);
}
interface IUserValidationMobileNumber {
	boolean patternMatch(String number);
}
interface IUserValidationPassword {
	boolean patternMatch(String password);
}



class UserValidator {
	 //public static void main(String[] args){
		 
		 //Lambda Expression for First Name
		 
		 //IUserValidationFirstName validFirstName = (String firstName) -> Pattern.matches("^[A-Z]{1}[a-z]{2,}$",firstName);
		 //System.out.println( " First Name User Entry is : " + validFirstName.patternMatch("Himanshu"));
		 
		//Lambda Expression for Last Name
		// IUserValidationLastName validLastName = (String lastName) -> Pattern.matches("^[A-Z]{1}[a-z]{2,}$",lastName);
		// System.out.println(" Last Name User Entry is : " + validLastName.patternMatch("Nete"));
		 
		//Lambda Expression for Email Address
		// IUserValidationLastName validEmail = (String email) -> Pattern.matches("^[0-9a-zA-Z]+([._+-]?[0-9a-zA-Z]+)*@[0-9A-Za-z]+.([c]{1}[o]{1}[m]{1})*([n]{1}[e]{1}[t]{1})*[,]*([.][a]{1}[u]{1})*([.][c]{1}[o]{1}[m]{1})*$", email);
		// System.out.println(" Email Address User Entry is : " + validEmail.patternMatch("himanshuneteh@gmail.com"));
		 
		//Lambda Expression for Mobile Number
		// IUserValidationLastName validMobileNumber = (String number) -> Pattern.matches("^[9]{1}[1]{1}[ ][0-9]{10}$", number);
		// System.out.println(" Mobile Number User Entry is : " + validMobileNumber.patternMatch("91 8805956103"));
		 
		//Lambda Expression for Password
		// IUserValidationLastName validPassword = (String password) -> Pattern.matches("^[A-Z]{1}[a-zA-Z]{7,}[@#$%^&*+-_]{1}([0-9]+)*$", password);
		// System.out.println(" Password User Entry is : " + validPassword.patternMatch("Himanshunete@1234"));
		 

	public boolean validateFirstName(String ffirstName) throws UserValidationException {		
		 try {
		     IUserValidationFirstName validFirstName = (String firstName) -> Pattern.matches("^[A-Z]{1}[a-z]{2,}$",firstName);
		     System.out.println( " First Name User Entry is : " + validFirstName.patternMatch(ffirstName));
		     return validFirstName.patternMatch(ffirstName);

		 } catch (Exception e) {
			 throw new UserValidationException(ffirstName); 
		 }
	}
	public boolean validateLastName(String flastName) throws UserValidationException {
		 try {
			 IUserValidationLastName validLastName = (String lastName) -> Pattern.matches("^[A-Z]{1}[a-z]{2,}$",lastName);
		     System.out.println(" Last Name User Entry is : " + validLastName.patternMatch(flastName));
		     return validLastName.patternMatch(flastName);
		 
	     } catch (Exception e) {
		     throw new UserValidationException(flastName); 
	     }
	}
	
	public boolean validateEmailAddress(String femail) throws UserValidationException {
		 try{
			 IUserValidationEmailAddress validEmail = (String email) -> Pattern.matches("^[0-9a-zA-Z]+([._+-]?[0-9a-zA-Z]+)*@[0-9A-Za-z]+.([c]{1}[o]{1}[m]{1})*([n]{1}[e]{1}[t]{1})*[,]*([.][a]{1}[u]{1})*([.][c]{1}[o]{1}[m]{1})*$", email);
		     System.out.println(" Email Address User Entry is : " + validEmail.patternMatch(femail));		
		     return validEmail.patternMatch(femail);
           
		 } catch (Exception e) {
			 throw new UserValidationException(femail); 
		 }
    }
	
	public boolean validateMobileNumber(String fnumber) throws UserValidationException {
		 try{
			 IUserValidationMobileNumber validMobileNumber = (String number) -> Pattern.matches("^[9]{1}[1]{1}[ ][0-9]{10}$", number);
		     System.out.println(" Mobile Number User Entry is : " + validMobileNumber.patternMatch(fnumber));
		     return validMobileNumber.patternMatch(fnumber);

		 } catch (Exception e) {
			 throw new UserValidationException(fnumber); 
		 }
	}
	
	public boolean validatePassword(String fpassword) throws UserValidationException {
		 try{
			 IUserValidationPassword validPassword = (String password) -> Pattern.matches("^[A-Z]{1}[a-zA-Z]{7,}[@#$%^&*+-_]{1}([0-9]+)*$", password);
		     System.out.println(" Password User Entry is : " + validPassword.patternMatch(fpassword));		 
		     return validPassword.patternMatch(fpassword);
		 } catch (Exception e) {
			 throw new UserValidationException(fpassword); 
		 }
	
    }

}





