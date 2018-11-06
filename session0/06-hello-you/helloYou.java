import java.util.Scanner;

public class HelloYou {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Who are you?");
		String name = scan.nextLine();
		System.out.println("Hello " + name + ". How are you?");
		String mood = scan.nextLine();
		System.out.println("Oh I am also feeling " + mood + ".");
		System.out.println("Well, goodbye " + mood + " " + name + ".");
	}
}
