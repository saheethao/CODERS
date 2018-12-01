
public class CarSolution {
	
	/* Car Attributes */
	private String name;
	private int position;
	private int velocity;
	private int acceleration;
	private int gas;
	
	/* Car Constructor */
	public CarSolution(String name, int startingPosition, int acceleration) {
		this.name = name;
		this.position = startingPosition;
		this.velocity = 0;
		this.acceleration = acceleration;
		this.gas = 20;
	}
	
	/**
	 * This method is the move() method you have seen before!
	 */
	public void move() {
		if (gas <= 0) {
			acceleration = acceleration - 5;
			System.out.print("Out of gas! ");
		} else {
			gas = gas - 2 * acceleration;
		}
		velocity = velocity + acceleration;
		position = position + velocity;
		System.out.println("Vroom! " + name + " is at position " + position + " and travelling at " + velocity + " m/s! ");
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
