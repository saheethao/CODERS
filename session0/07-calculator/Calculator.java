import java.util.Scanner;

public class Calculator {
	
	public static void main(String[] args) {
		//Declare variables
		int firstInt;
		String operator;
		int secondInt;
		
		//Get user inputs
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		firstInt = scan.nextInt();
		System.out.print("Enter an operator: ");
		operator = scan.next();
		System.out.print("Enter an integer: ");
		secondInt = scan.nextInt();
		/* Add you code below */
		if (operator.equals("+")) {
			System.out.println(firstInt + secondInt);
		} else {
			System.out.println("Invalid operator!");
		}
		/* Your code stops here */
	}

}
