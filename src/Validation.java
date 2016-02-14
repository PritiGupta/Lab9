import java.util.Scanner;

/**
 * 
 */

/**
 * @author Priti
 *
 */
public class Validation {

	/**
	 * 
	 */
	private Validation() {
		// TODO Auto-generated constructor stub
	}
	
	public static double getValidDouble(Scanner scan) {
		while(!scan.hasNextDouble()){//use hasNextDouble to check if input # is a integer
			System.out.println("Please enter a valid number");
			scan.nextLine();
		}
			double number = scan.nextDouble();
			scan.nextLine();
			return number;
		}
	
	public static String getChoice(Scanner scan){
		String choice="y";
	scan = new Scanner(System.in);
	while(choice.equalsIgnoreCase("y"))
	{
		System.out.print("Continue: y/n: ");
		choice=scan.next();
		return choice;
	
	}
	scan.close();
	System.out.println("Bye bye");
		return "";
	}
	
}
