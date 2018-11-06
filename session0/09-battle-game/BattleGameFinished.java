import java.util.Random;
import java.util.Scanner;

public class BattleGameFinished {
	Random r = new Random();
	boolean sneers;
	
	String name = null;
	String weapon = null;
	String superWeapon = null;
	int damage = 0;
	int superDamage = 0;
	int playerHP = 0;
	int enemyHP = 0;
	
	public static void main(String[] args) {
		new BattleGameFinished();
	}
	
	public BattleGameFinished() {
		setup();
		while (loop());
	}
	
	public void setup() {
		/* Your code starts here! */
		//set up the player's weapon, super weapon, and how much damage the weapons do (a bat does 5 damage and a super bat does 20 damage!)
		//Hint use a scanner and the variables at the top! See example below.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("What is your name?");
		name = scan.next();
		System.out.println("What is your weapon?");
		weapon = scan.next();
		System.out.println("How much damage does it do?");
		damage = scan.nextInt();
		System.out.println("What is your super weapon?");
		superWeapon = scan.next();
		System.out.println("How much damage does it do?");
		superDamage = scan.nextInt();

		/* Your code ends here! */
		
		//HP means health points
		//The HPs are of type int
		playerHP = 100;
		enemyHP = 100;
	}
	
	public boolean loop() {
		// Use the variables playerHP and enemyHP to change the hit points
		int input = 0;
		
		System.out.println("[" + name + "'s HP: " + playerHP + "] \t [Opponent's HP:" + enemyHP + "]");
		System.out.println("Enter number to use:");
		System.out.println("\t1 " + superWeapon);
		System.out.println("\t2 " + weapon);
		System.out.println("\t3 Healing");

		Scanner scan = new Scanner(System.in);
		
		input = scan.nextInt();
		/* Your code starts here! */
		if (input == 1) { //This one is complete for you!
			System.out.println(name + " unleashs their " + superWeapon + "!");
			//50% chance you miss
			if (r.nextBoolean()) {
				//You miss
				System.out.println("But " + name + " missed!");
			} else {
				System.out.println(name + " deals " + superDamage + " damage!!");
				enemyHP = enemyHP - superDamage;
			}
		} else if (input == 2) {
			System.out.println(name + " uses their " + weapon + ".");
			System.out.println(name + " deals " + damage + " damage.");
			enemyHP = enemyHP - damage;
		} else {
			System.out.println(name + " heals 20 health points!");
			playerHP = playerHP + 20;
		}

		
		/* Your code ends here! */
		return endBattle();
	}
	
	public boolean endBattle() {
		enemyTurn();
		if (playerHP <= 0 || enemyHP <= 0) {
			if (playerHP <= 0) {
				System.out.println("You both lost!");
			} else if (playerHP <= 0) {
				System.out.println("Oh no you lost!");
			} else if (enemyHP <= 0) {
				System.out.println("Hooray you won!");
			}
			return false;
		} else {
			return true;
		}
	}
	
	public void enemyTurn() {
		String[] weapons = {"a baseball bat", "a frying pan", "two pencils", "a pair of crocs", "a ninja star", "a can of peas", "a wooden chair"};
		int weaponChoice = r.nextInt(weapons.length);
		int choice = r.nextInt(10);
		if (choice > 7 && sneers) {
			choice = 0;
		}
		if (choice < 5) {
			System.out.println("Your opponent grabs " + weapons[weaponChoice] + " and attacks you!");
			int damage = r.nextInt(20) + 1;
			if (sneers) {
				damage *= 3;
			}
			System.out.println("Your opponent deals " + damage + " damage to you!");
			playerHP -= damage;
			sneers = false;
		} else if (choice < 8) {
			int heal = r.nextInt(15) + 1;
			System.out.println("Your opponent decides to heal. They heal " + heal + " health points.");
			enemyHP += heal;
		} else {
			System.out.println("Your opponent sneers at you! The next time they attack they will deal triple damage!");
			sneers = true;
		}
	}
}
