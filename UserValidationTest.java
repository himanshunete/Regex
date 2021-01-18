package com.samples;

import org.junit.Assert ;
import org.junit.Test ;

/**
 * Unit test for simple App.
 */
public class UserValidatorTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validateFirstName("Himanshu");
        Assert.assertEquals(true, result);
    }
    
    @Test
    public void givenFirstName_WhenShort_ShouldReturnFalse() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validateFirstName("Himanshu");
        Assert.assertEquals(true, result);
    }
    
    @Test
    public void givenLastName_WhenProper_ShouldReturnTrue() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validateLastName("Nete");
        Assert.assertEquals(true, result);
    }
    
    @Test
    public void givenEmail_WhenValid_ShouldReturnTrue() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validateEmailAddress("himanshuneteh@gmail.com");
        Assert.assertEquals(true, result);
    }
    
    @Test
    public void givenMobileNumber_WhenValid_ShouldReturnTrue() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validateMobileNumber("8805956103");
        Assert.assertEquals(true, result);
    }
    
    @Test
    public void givenPassword_WhenValid_ShouldReturnTrue() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validatePassword("Himanshuetefs@12345");
        Assert.assertEquals(true, result);
    }
    
    
}
