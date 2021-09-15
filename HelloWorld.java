package helloworld;

public class HelloWorld {
	
	public static void main(String[] args) {
		// output Hello World
		System.out.println("Hello World");
		
		// output string to console
		String message = "Good Morning";
		System.out.println(message);
		
		hi("Output One");
		useReturn("Output Two");
	}

	// Void - No return
	public static void hi(String input) {
		System.out.println(input);
		
	}
	public static String useReturn(String input) {
		System.out.println(input);
		return input;
	}
}
