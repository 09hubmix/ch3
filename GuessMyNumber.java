import java.util.Scanner;
import java.util.Random;

public class GuessMyNumber {
	public static void main(String[] args) {
	System.out.print("I'm thinking of a number between 1 and 100");
	System.out.println("(including both). Can you guess what it is?");
	System.out.print("Type a number: ");
	Scanner in = new Scanner(System.in);
	int guess = in.nextInt();
	System.out.println("your guess is: " + guess);
	
	// pick a random number
	Random random =  new Random();
	int number = random.nextInt(100) + 1;
	System.out.println("The number I was thinking of is: " + number);
	int difference = Math.abs(number - guess);
	System.out.println("You were off by: " + difference);
	}
}
