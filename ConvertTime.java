import java.util.Scanner;

public class ConvertTime {
	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	System.out.print("Enter a number of seconds: ");
	int seconds = in.nextInt();
	int hours = seconds / 3600;
	int hours_remainder = seconds % 3600;
	int minutes = hours_remainder / 60;
	int minutes_remainder = hours_remainder / 60;
	int seconds_remaining = minutes_remainder / 60;
	
	System.out.print(hours + "hours, " + minutes + "minutes, and " + seconds_remaining + "seconds");	
	}
}
	
