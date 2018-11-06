public class BooleanOperators {
	public static void main(String[] args) {
		int x = 0;
		System.out.println("1) " + x);
		
		if (x < 5) {
			x = x + 5;
		} else {
			x = x - 5;
		}
		System.out.println("2) " + x);
		
		if ((x % 3) != 0 ) {
			x = x * 3;
		}
		System.out.println("3) " + x);
		
		if (15 <= x && x <= 20) {
			x = x - 5;
		}
		System.out.println("4) " + x);
		
		if (!((x / 2) < 5)) {
			x = x + 50;
		}
		System.out.println("5) " + x);
	}
}
