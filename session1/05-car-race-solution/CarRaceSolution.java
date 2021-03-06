
public class CarRaceSolution {

	public static void main(String[] args) {	
		new CarRaceSolution();
	}
	
	CarSolution carOne;
	CarSolution carTwo;
	CarSolution carThree;
	
	public CarRace() {
		carOne = new Car("Hot Rod", 30, 2);
		carTwo = new Car("Batmobile", 15, 4);
		carThree = new Car("Kachow", 0, 8);
		
		carOne.move();
		carTwo.move();
		carThree.move();
		this.whoIsWinning();
		System.out.println("------------------------------------");
		carOne.move();
		carTwo.move();
		this.carThree.move();
		this.whoIsWinning();
		System.out.println("------------------------------------");
		carOne.move();
		carTwo.move();
		this.carThree.move();
		this.whoIsWinning();
		System.out.println("------------------------------------");
		carOne.move();
		carTwo.move();
		carThree.move();
		this.whoIsWinning();
		System.out.println("------------------------------------");
		carOne.move();
		carTwo.move();
		carThree.move();
		this.whoIsWinning();
		System.out.println("------------------------------------");
		carOne.move();
		carTwo.move();
		carThree.move();
		this.whoIsWinning();
	}
	
	/**
	 * This method prints out who is winning.
	 */
	private void whoIsWinning() {
		CarSolution winner = carOne;
		if (carTwo.getPosition() > winner.getPosition()) {
			winner = carTwo;
		}
		if (carThree.getPosition() > winner.getPosition()) {
			winner = carThree;
		}
		System.out.println(winner.getName() + " is in the lead!");
	}
}
