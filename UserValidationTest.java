package com.lambdaexpression;

import org.junit.Assert ;
import org.junit.Test ;
import org.junit.rules.ExpectedException;

public class UserValidationTest {

    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validateFirstName("Himanshu");
        Assert.assertEquals(true, result);
        
    }
    
    @Test
    public void givenFirstName_WhenInvalid_ShouldReturnFlse() {
        UserValidator validator = new UserValidator();
        try {
            boolean result = validator.validateFirstName("Hi");
        } catch (UserValidationException e) {
          	System.out.println(e.getMessage());
          	Assert.assertEquals("Hi", e.getMessage());
        }
    }
    
    @Test
    public void givenLastName_WhenProper_ShouldReturnTrue() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validateLastName("Himanshu");
        Assert.assertEquals(true, result);
        
    }
    
    @Test
    public void givenLastName_WhenInvalid_ShouldReturnFlse() {
    	UserValidator validator = new UserValidator();
        try {
            boolean result = validator.validateLastName("Ne");
        } catch (UserValidationException e) {
            System.out.println(e.getMessage());
            Assert.assertEquals("Ne", e.getMessage());
        }
        
    }
    
    @Test
    public void givenEmailAddress_WhenProper_ShouldReturnTrue() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validateEmailAddress("himanshu@gmil.com");
        Assert.assertEquals(true, result);
        
    }
    
    @Test
    public void givenEmailAddress_WhenInvalid_ShouldReturnFlse() {
    	UserValidator validator = new UserValidator();
        try {
            boolean result = validator.validateEmailAddress("Himan@1.com.com.com");
        } catch (UserValidationException e) {
            System.out.println(e.getMessage());
            Assert.assertEquals("Himan@1.com.com.com", e.getMessage());
        }
        
    }
    
    @Test
    public void givenMobileNumber_WhenProper_ShouldReturnTrue() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validateMobileNumber("91 8805956103");
        Assert.assertEquals(true, result);
        
    }
    
    @Test
    public void givenMobileNumber_WhenInvalid_ShouldReturnFlse() {
    	UserValidator validator = new UserValidator();
        try {
            boolean result = validator.validateMobileNumber("91 880595");
        } catch (UserValidationException e) {
            System.out.println(e.getMessage());
            Assert.assertEquals("91 880595", e.getMessage());
        }
        
    }
    
    @Test
    public void givenPassword_WhenProper_ShouldReturnTrue() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validatePassword("Himnshunete@12345");
        Assert.assertEquals(true, result);
        
    }
    
    @Test
    public void givenPassword_WhenInvalid_ShouldReturnFlse() {
    	UserValidator validator = new UserValidator();
        try {
            boolean result = validator.validatePassword("himnshu1234");
        } catch (UserValidationException e) {
            System.out.println(e.getMessage());
            Assert.assertEquals("himnshu1234", e.getMessage());
        }
    }
    
    
    
    
    
}    
