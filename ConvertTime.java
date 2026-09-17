import java.util.Scanner;

public class ConvertTime {
	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	System.out.print("Enter a number of seconds: ");
	double seconds = in.nextInt();
	double hours = seconds / 3600;
	double hours_remainder = seconds % 3600;
	double minutes = hours_remainder / 60;
	double minutes_remainder = hours_remainder / 60;
	double seconds_remaining = minutes_remainder / 60;
	
	System.out.print(hours);
	System.out.print(minutes);
	System.out.print(seconds_remaining);
	}
}
	
