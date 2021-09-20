package com.qa.testdrivendevelopment;

import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;

public class Email {

	public static boolean isValidEmail(String email) {
		   boolean result = true ;
		   try {
		      InternetAddress emailAddr = new InternetAddress(email);
		      emailAddr.validate();
		   } catch (AddressException ex) {
		      result = false;
		   }
		   return result;
		}
	
	

}