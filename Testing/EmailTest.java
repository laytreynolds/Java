package com.qa.testdrivendevelopment;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class EmailTest {

    @Before
    public void setUp() {
        new Email();
    }

    @Test
    public void testIsValidEmailGreenPath() {
        boolean actual = Email.isValidEmail("firstName.surname@qa.com");
        assertTrue(actual);
    }

    @Test
    public void testIsValidEmailGreenPathDifferentDomainName() {
        boolean actual = Email.isValidEmail("firstNameSurname@gmail.com");
        assertTrue(actual);
    }

    @Test
    public void testIsValidEmailRedPathDomainTooLong() {
        boolean actual = Email.isValidEmail("firstName.surname@qa.helloWorld");
        assertFalse(actual);
    }

    @Test
    public void testIsValidEmailRedPathNoAddress() {
        boolean actual = Email.isValidEmail("@qa.com");
        assertFalse(actual);
    }

    @Test
    public void testIsValidEmailRedPathNoDomainName() {
        boolean actual = Email.isValidEmail("firstName.surname@com");
        assertFalse(actual);
    }

    @Test
    public void testIsValidEmailRedPathSpecialCharacterAtBeginning() {
        boolean actual = Email.isValidEmail("_firstName.surname@qa.com");
        assertFalse(actual);
    }

    @Test
    public void testIsValidEmailRedPathSpecialCharacterAtEnd() {
        boolean actual = Email.isValidEmail("firstName.surname@qa.com)");
        assertFalse(actual);
    }
}