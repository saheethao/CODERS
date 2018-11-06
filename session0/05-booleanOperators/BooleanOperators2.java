public class BooleanOperators2 {
	public static void main(String[] args) {
		int x = 15;
		System.out.println("1) " + x);
		System.out.println("x starts out at " + x + ".");
		
		if (x < 5) {
			System.out.println(x + " is less than 5 so we add 5 to " + x + ".");
			x = x + 5;
		} else {
			System.out.print(x + " is 5 or more so we subtract 5 from " + x + ".");
			x = x - 5;
		}
		System.out.println("\n2) " + x);
		System.out.println("Now x is " + x + ".");
		
		if ((x % 3) != 0 ) {
			System.out.println("Since " + x + " is not divisible by three, we multiply it by three.");
			x = x * 3;
		} else {
			System.out.println(x + " is divisible by three. We do nothing.");
		}
		System.out.println("\n3) " + x);
		System.out.println("Now x is " + x + ".");
		
		if (15 <= x && x <= 20) {
			System.out.println(x + " is between 15 and 20 so we subtract 5 from " + x + ".");
			x = x - 5;
		} else {
			System.out.println(x + " is not between 15 and 20 so we do nothing.");
		}
		System.out.println("\n4) " + x);
		System.out.println("Now x is " + x + ".");
		
		System.out.println("If we divide " + x + " by two it is less than 5. " + x + " / 2 = " + (x/2.0) + ".");
		System.out.println("Normally if the statement was \"if ( (x / 2) < 5)\" it would go into this if statement");
		System.out.println("Since we used the ! operator we take the oposite result.");
		if (!((x / 2) < 5)) {
			System.out.println(x + " / 2 < 5 is false so we add 50 to " + x + ".");
			x = x + 50;
		} else {
			System.out.println(x + " / 2 < 5 is true so we do nothing.");
		}
		System.out.println("\n5) " + x);
		System.out.println("Finally x is " + x + ".");
	}
}
