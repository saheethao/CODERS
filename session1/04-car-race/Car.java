
public class Car {
	
	/* Car Attributes */
	private String name;
	private int position;
	private int velocity;
	private int acceleration;
	//private int gas;
	
	/* Car Constructor */
	public Car(String name, int startingPosition, int acceleration) {
		this.name = name;
		this.position = startingPosition;
		this.velocity = 0;
		this.acceleration = acceleration;
		//this.gas = 20;
	}
	
	/* Below are the actions a car can take. These are its methods. */
	/**
	 * This method is the move() method you have seen before!
	 */
	public void move() {
		/* Insert code here! */
		
		/* Change the code so that the gas reduces based on the acceleration. 
		 * A car uses 2 units of gas for every 1 meter per second per second (acceleration).
		 * If a car has 0 or less gas, it should slow down (have negative acceleration).
		 */
		
		velocity = velocity + acceleration;
		position = position + velocity;
		System.out.println("Vroom! " + name + " is at position " + position + " and travelling at " + velocity + " m/s!");
	}
	
	/**
	 * This method accepts a position to teleport the car to.
	 */
	public void teleport(int newPosition) {
		position = newPosition;
		System.out.print(name + " appears at position " + position + "! ");
		move();
	}
	
	/**
	 * This method makes the car completely stop.
	 */
	public void completelyStop() {
		velocity = 0;
		acceleration = 0;
		System.out.println(name + " stops at position " + position + "!");
	}
	
	/**
	 * This method makes the car accelerate.
	 */
	public void accelerate() {
		acceleration = acceleration + 1;
		System.out.print("Accelerating! ");
		move();
	}
	
	/**
	 * This method makes the car set to the speed of light.
	 */
	public void goToLightSpeed() {
		velocity = 299792458;
		acceleration = 0;
		System.out.print(name + " goes to the speed of light! ");
		move();
	}
	
	/**
	 * This method gets the position of this car
	 */
	public int getPosition() {
		return position;
	}
	
	/**
	 * This method gets the name of this car
	 */
	public String getName() {
		return name;
	}
}
