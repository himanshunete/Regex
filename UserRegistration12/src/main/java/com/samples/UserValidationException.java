package com.samples;

public class UserValidationException extends RuntimeException {
	public UserValidationException(String ffirstname,String flastname,String femail,String fmobilenumber,String fpassword ) {
       super(flastname);
    }
}

