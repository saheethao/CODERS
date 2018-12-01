
public class Car {
	
	private String name;
	private int position;
	private int velocity;
	private int acceleration;
	//private int gas;
	
	public Car(String name, int startingPosition, int acceleration) {
		this.name = name;
		this.position = startingPosition;
		this.velocity = 0;
		this.acceleration = acceleration;
		//this.gas = 20;
	}
	
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