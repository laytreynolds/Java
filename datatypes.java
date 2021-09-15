package DataTypes;

public class DataTypeExercise {

	// Create a main method, either in the class, or in a separate runner.
	public static void main(String[] args) {
		
		// Declare 3 variables, 2 primitive types and one String.
		boolean bool = true;
		int number = 45;
		String str = "Hello";
		
		// Print all 3 to the console.
		System.out.println(bool);
		System.out.println(number);
		System.out.println(str);
		System.out.println(returnNumber());
		System.out.println(addNumbers(20,98));
	}
	
	public static int returnNumber() {
		return(1578);
	}
	
	public static int addNumbers(int num1, int num2) {
	int sum = num1 + num2;
	return(sum);
	}
	
	
}
