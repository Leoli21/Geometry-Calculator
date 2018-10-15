import java.util.Scanner;

public class GeometryCalculator
{

	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Please enter your name: ");
		String name = keyboard.nextLine();
		System.out.print("\n\n\nHello" + name + ", welcome to the Geometry Calculator!" + "\nPress enter to continue...");
		keyboard.nextLine()
		int base;
		String baseString;
		int height;
		
		System.out.print("\n\nAREA OF A TRIANGLE");
		System.out.print("Please enter the value of the base of a triange: ");
		baseString = keyboard.nextLine();
		base = Integer.parseInt(baseString);
		
		
	}

}
