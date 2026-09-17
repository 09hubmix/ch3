import java.util.Scanner;

public class Convert {
	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	System.out.print("Enter a temperature in Celsius: ");
	double Celcius = in.nextInt();
	double fahrenheit = Celcius * 9/5 + 32;
	System.out.print(Celcius + "C = " + fahrenheit);
	}
}
