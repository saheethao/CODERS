
public class CarProgramWithMethods {

	public static void main(String[] args) {	
		new CarProgramWithMethods();
	}
	
	/* These variables are now global variables */
	private int carPosition = 0;
	private int carVelocity = 0;
	private int carAcceleration = 5;
	
	public CarProgramWithMethods() {
		//int x = 0; //This variable would be a local variable. If you tried to use x in move(), it will not work.
		/* Every time you call a method. One second has passed. */
		move();
		move();
		move();
		
		applyBreaks();
		applyBreaks();
		applyBreaks();
		
		reverse(5);
		reverse(1);
	}
	/**
	 * This is a method!
	 * This method does the pattern in the past program
	 */
	private void move() {		
		/* How can you modify your code to have a max speed? For example a car that can at max got 10 m/s */
		
		
		/* These variables can be used because all of these variables are global variables */
		//System.out.println(x); //This does not work as x would be not in scope.
		carVelocity = carVelocity + carAcceleration;
		carPosition = carPosition + carVelocity;
		System.out.println("Vroom! Car is at position " + carPosition + " and travelling at " + carVelocity + " m/s!");
	}
	/**
	 * The car should reduce in acceleration. The speed should go to zero but not below zero.
	 */
	private void applyBreaks() {
		/* Insert your code here! */
		System.out.println("Breaking!! Car is at position " + carPosition + " and travelling at " + carVelocity + " m/s!");
	}
	
	/**
	 * The car should acceleration negatively. The speed should head to values below zero.
	 */
	private void reverse(int pressure) {
		/* Insert your code here! */
		System.out.println("Reversing! Car is at position " + carPosition + " and travelling at " + carVelocity + " m/s!");
	}
}
