package com.lambdaexpression;

public class UserValidationException extends RuntimeException {
	public UserValidationException(String ffirstname,String flastname,String femail,String fmobilenumber,String fpassword ) {
	   super(ffirstname);
	       
	}
    public UserValidationException(String message) {
	   super(message);
    }
}
