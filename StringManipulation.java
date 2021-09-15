package stringmanipulation;

public class StringManipulation {

	public static void main(String[] args) {
		
//		Create string
		String str1 = "Hello World!";
		System.out.println(str1);
		
//		create string using new operator
		String str2 = new String("Hello Earth!");
		System.out.println(str2);
		
		System.out.println(concatString());
		
		System.out.println(strArray());
		
		System.out.println(chaString());
		
		System.out.println(concatMethod());
		
		
		String str6 = "Today it is sunny";
		String str7 = "Yesterday it was raining";

		
		String mySubString1 = str7.substring(0, 11);
		String mySubString2 = str6.substring(16, 24);
		
		System.out.println(mySubString1 + mySubString2);
		
		
		
	
	}
//		Create strings through arrays
		public static String strArray() {
			char[] helloArray = {'h', 'e', 'l', 'l', 'o'};
			String helloString = new String(helloArray);
			return helloString;
	}
	
//		method to concatenate and upper case strings
		public static String concatString() {
			
			String str3 = "today it is sunny";
			String str4 = "yesterday it was raining";

			
			String concat = (str3.toUpperCase() + ", " + str4.toUpperCase());
			
				return concat;
		}
		
//		return number of char in string
		public static String chaString() {
			 String chaStr1 = "This is my String";
			 int stringLength = chaStr1.length();
			 return ("The length of this string is " + stringLength);
			 
		}

//			concat method
		public static String concatMethod() {
		   String myStr = "My cat's name is ".concat("Copycat");
	        return myStr;
		}
		
		
		

		
		
		
		
	

}

