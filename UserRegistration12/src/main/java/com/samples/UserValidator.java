package com.samples;
import java.util.regex.PatternSyntaxException;
import java.util.regex.Pattern;

public class UserValidator {
	
	private static final String FIRST_NAME_PATTERN = "^[A-Z]{1}[a-z]{2,}$" ;
	private static final String LAST_NAME_PATTERN = "^[A-Z]{1}[a-z]{2,}$" ;
	private static final String EMAIL_ADDRESS_PATTERN = "^[0-9a-zA-Z]+([._+-]?[0-9a-zA-Z]+)*@[0-9A-Za-z]+.([c]{1}[o]{1}[m]{1})*([n]{1}[e]{1}[t]{1})*[,]*([.][a]{1}[u]{1})*([.][c]{1}[o]{1}[m]{1})*$" ;
	private static final String MOBILE_NUMBER_PATTERN = "^[9]{1}[1]{1}[ ][0-9]{10}$"  ;
	private static final String PASSWORD_PATTERN = "^[A-Z]{1}[a-zA-Z]{7,}[@#$%^&*+-_]{1}([0-9]+)*$"  ;
    
	public boolean validateFirstName(String ffirstname) throws UserValidationException {
		try {
		    Pattern pattern = Pattern.compile(FIRST_NAME_PATTERN);
		    return pattern.matcher(ffirstname).matches();
		} catch (Exception e) {
			throw new UserValidationException("Hi");
		}
	}
	
	public boolean validateLastName(String flastname) throws UserValidationException{   
		try {
		    Pattern pattern = Pattern.compile(LAST_NAME_PATTERN);
		    return pattern.matcher(flastname).matches();
		} catch (Exception e) {
			throw new UserValidationException("Ne");
		}
	}
	
    
	public boolean validateEmailAddress(String femail) throws UserValidationException{
		try {
		    Pattern pattern = Pattern.compile(EMAIL_ADDRESS_PATTERN);
		    return pattern.matcher(femail).matches();
		} catch (Exception e) {
			throw new UserValidationException("Himshu@1.com.com.com");
		}
	}
	
	
	public boolean validateMobileNumber(String fmobilenumber) throws UserValidationException{
		try {
		    Pattern pattern = Pattern.compile(MOBILE_NUMBER_PATTERN);
		    return pattern.matcher(fmobilenumber).matches();
		} catch (Exception e) {
			throw new UserValidationException("91 45135");
		}
	}
	
	
	public boolean validatePassword(String fpassword) throws UserValidationException{
		try {
		    Pattern pattern = Pattern.compile(PASSWORD_PATTERN);
		    return pattern.matcher(fpassword).matches();
		} catch (Exception e) {
			throw new UserValidationException("Nete1234");
		}
	}
	
	
	
   
}
