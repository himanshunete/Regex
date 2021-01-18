package com.samples;

import java.util.regex.Pattern;

public class UserValidator {
	
	private static final String FIRST_NAME_PATTERN = "^[A-Z]{1}[a-z]{2,}$" ;
	private static final String LAST_NAME_PATTERN = "^[A-Z]{1}[a-z]{2,}$" ;
	private static final String EMAIL_ADDRESS_PATTERN = "^[0-9a-zA-Z]+([.]{1}[_+-])*([0-9a-zA-Z]+)*@[0-9A-Za-z]+.([c]{1}[o]{1}[m]{1})*([n]{1}[e]{1}[t]{1})*[,]*([.][a]{1}[u]{1})*([.][c]{1}[o]{1}[m]{1})*$" ;
	private static final String MOBILE_NUMBER_PATTERN = "^[9]{1}[1]{1}[ ][0-9]{10}$"  ;
	private static final String PASSWORD_PATTERN = "^[A-Z]{1}[a-zA-Z]{7,}[@#$%^&*+-_]{1}([0-9]+)*$"  ;
    
	public boolean validateFirstName(String ffirstname) {
		Pattern pattern = Pattern.compile(FIRST_NAME_PATTERN);
		return pattern.matcher(ffirstname).matches();
	}
	
	public boolean validateLastName(String flastname) {
		Pattern pattern = Pattern.compile(LAST_NAME_PATTERN);
		return pattern.matcher(flastname).matches();
	}
    
	public boolean validateEmailAddress(String femail) {
		Pattern pattern = Pattern.compile(EMAIL_ADDRESS_PATTERN);
		return pattern.matcher(femail).matches();
	}
	
	public boolean validateMobileNumber(String fmobilenumber) {
		Pattern pattern = Pattern.compile(MOBILE_NUMBER_PATTERN);
		return pattern.matcher(fmobilenumber).matches();
	}
	
	public boolean validatePassword(String fpassword) {
		Pattern pattern = Pattern.compile(PASSWORD_PATTERN);
		return pattern.matcher(fpassword).matches();
	}
	
	
   
}
