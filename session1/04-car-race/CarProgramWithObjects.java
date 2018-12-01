
public class CarProgramWithObjects {

	public static void main(String[] args) {	
		new CarProgramWithObjects();
	}
		
	public CarProgramWithObjects() {
		Car racecar = new Car("Speedy", 0, 10);
		racecar.move();
		racecar.move();
		racecar.move();
		racecar.completelyStop();
		racecar.move();
		racecar.accelerate();
		racecar.teleport(100);
		racecar.goToLightSpeed();

	}
}
