import java.util.Random;
import java.util.Scanner;

public class GuessTheNumberFinished {
	Random r = new Random();
	int number = 0;
	int count = 0;
	public static void main(String[] args) {
		new GuessTheNumberFinished();
	}
	
	public GuessTheNumberFinished() {
		number = r.nextInt(100) + 1;
		while (loop());
	}
	
	public boolean endLoop(int guess, int number) {
		count += 1;
		if (guess == number) {
			System.out.println("You got it! It took you " + count + " guesses!");
			return false;
		} else {
			return true;
		}
	}
	
	public boolean loop() {
		int guess = 0;
		//BONUS ANSWER: Haha I'm not going to give you the bonus answer!

		//Enter code below
		System.out.println("Guess the number!");
		Scanner scan = new Scanner(System.in);
		guess = scan.nextInt();
		if ((number - guess) < 5 && (number - guess) > -5 && number != guess) {
			System.out.println("You are really close!");
		}
		if (guess < number) {
			System.out.println("Guess higher!");
		}
		if (guess > number) {
			System.out.println("Guess lower!");
		}
		//You code should stop here
		return endLoop(guess, number);
	}
}
