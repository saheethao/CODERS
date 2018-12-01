
public class CarProgram {

	public static void main(String[] args) {	
		new CarProgram();
	}
	public CarProgram() {
		int carPosition = 0; //Keeps track of the position of the car (meters or m).
		
		/* The position changes based on the speed. For example if a car is at meter 5
		 * and moves 2 meters per second (m/s), after 1 second, it is at meter 7.
		 * After 5 seconds it is at meter 15 (5m + 2m/s * 5s = 15m)
		 */
		
		int carVelocity = 0; //Keeps track of the speed of the car (meters per second or m/s).
		
		int carAcceleration = 5; //Keeps track of the acceleration of the car (meters per second per second or m/s/s or m/s^2.
		
		/* The speed changes based on the acc. For example if a car is at meter 5
		 * and moves 2 meters per second (m/s), after 1 second, it is at meter 7.
		 * After 5 seconds it is at meter 15 (5m + 2m/s * 5s = 15m)
		 */
		
		
		/* Running Pattern */
		carVelocity = carVelocity + carAcceleration;
		carPosition = carPosition + carVelocity;
		System.out.println("Vroom! Car is at position " + carPosition + " and travelling at " + carVelocity + " m/s!");
		
		carVelocity = carVelocity + carAcceleration;
		carPosition = carPosition + carVelocity;
		System.out.println("Vroom! Car is at position " + carPosition + " and travelling at " + carVelocity + " m/s!");
		
		carVelocity = carVelocity + carAcceleration;
		carPosition = carPosition + carVelocity;
		System.out.println("Vroom! Car is at position " + carPosition + " and travelling at " + carVelocity + " m/s!");
	}
}
