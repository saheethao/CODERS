
public class CarProgramWithMoreCars {

	public static void main(String[] args) {	
		new CarProgramWithMoreCars();
	}
	
	/* These variables are now global variables */
	private int carPositionA = 0;
	private int carVelocityA = 0;
	private int carAccelerationA = 5;
	
	private int carPositionB = 10;
	private int carVelocityB = 0;
	private int carAccelerationB = 2;
	
	public CarProgramWithMoreCars() {
		//int x = 0; //This variable would be a local variable. If you tried to use x in move(), it will not work.
		moveA();
		moveB();
		moveA();
		moveB();
		moveA();
		moveB();
	}

	private void moveA() {
		/* These variables can be used because all of these variables are global variables */
		//System.out.println(x); //This does not work as x would be not in scope.
		carVelocityA = carVelocityA + carAccelerationA;
		carPositionA = carPositionA + carVelocityA;
		System.out.println("Vroom! Car A is at position " + carPositionA + " and traveling at " + carVelocityA + " m/s!");
	}
	
	private void moveB() {
		/* These variables can be used because all of these variables are global variables */
		//System.out.println(x); //This does not work as x would be not in scope.
		carVelocityB = carVelocityB + carAccelerationB;
		carPositionB = carPositionB + carVelocityB;
		System.out.println("Vroom! Car B is at position " + carPositionB + " and traveling at " + carVelocityB + " m/s!");
	}
}
