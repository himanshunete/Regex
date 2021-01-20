package com.samples;

import org.junit.Assert ;
import org.junit.Test ;
import org.junit.rules.ExpectedException;

public class UserValidatorTest {

    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validateFirstName("Himanshu");
        Assert.assertEquals(true, result);
    }
    
    @Test
    public void givenFirstName_WhenInvalid_ShouldReturnFalse() {
        UserValidator validator = new UserValidator();
        try {
			ExpectedException exceptionRule = ExpectedException.none();
            exceptionRule.expect(UserValidationException.class);
            boolean result = validator.validateFirstName("Hi");
            Assert.assertEquals(true, result);
        } catch (UserValidationException e) {
        	Assert.assertEquals("Hi", e.getMessage());
        }
    }
    
    @Test
    public void givenLastName_WhenProper_ShouldReturnTrue() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validateLastName("Nete");
        Assert.assertEquals(true, result);
    }
    
    @Test
    public void givenLastName_WhenInvalid_ShouldReturnFalse() {
        UserValidator validator = new UserValidator();
        try {
			ExpectedException exceptionRule = ExpectedException.none();
            exceptionRule.expect(UserValidationException.class);
            boolean result = validator.validateLastName("Ne");
            Assert.assertEquals(true, result);
        } catch (UserValidationException e) {
        	Assert.assertEquals("Ne", e.getMessage());
        }
    }
    
    
    @Test
    public void givenEmail_WhenValid_ShouldReturnTrue() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validateEmailAddress("himanshuneteh@gmail.com");
        Assert.assertEquals(true, result);
    }
    
    @Test
    public void givenEmailAddress_WhenInvalid_ShouldReturnFalse() {
        UserValidator validator = new UserValidator();
        try {
			ExpectedException exceptionRule = ExpectedException.none();
            exceptionRule.expect(UserValidationException.class);
            boolean result = validator.validateEmailAddress("Himshu@1.com.com.com");
            Assert.assertEquals(true, result);
        } catch (UserValidationException e) {
        	Assert.assertEquals("Himshu@1.com.com.com", e.getMessage());
        }
    }
    
    @Test
    public void givenMobileNumber_WhenValid_ShouldReturnTrue() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validateMobileNumber("91 8805956103");
        Assert.assertEquals(true, result);
    }
    
    @Test
    public void givenMobileNumber_WhenInvalid_ShouldReturnFalse() {
        UserValidator validator = new UserValidator();
        try {
			ExpectedException exceptionRule = ExpectedException.none();
            exceptionRule.expect(UserValidationException.class);
            boolean result = validator.validateMobileNumber("91 45135");
            Assert.assertEquals(true, result);
        } catch (UserValidationException e) {
        	Assert.assertEquals("91 45135", e.getMessage());
        }
    }
    
    @Test
    public void givenPassword_WhenValid_ShouldReturnTrue() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validatePassword("Himanshuetefs@12345");
        Assert.assertEquals(true, result);
    }
    
    @Test
    public void givenPassword_WhenInvalid_ShouldReturnFalse() {
        UserValidator validator = new UserValidator();
        try {
			ExpectedException exceptionRule = ExpectedException.none();
            exceptionRule.expect(UserValidationException.class);
            boolean result = validator.validatePassword("Nete1234");
            Assert.assertEquals(true, result);
        } catch (UserValidationException e) {
        	Assert.assertEquals("Nete1234", e.getMessage());
        }
    }
    
   
    
}
