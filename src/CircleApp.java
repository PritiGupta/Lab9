import java.util.Scanner;

/**
 * 
 */

/**
 * @author Priti
 *
 */
public class CircleApp {

	public static void main(String[] args) {
		
		double radius;
		Circle circle;
		Scanner scan;
		System.out.println("Welcome to The Circle Tester");
		System.out.println("******************************************");

		do{
		scan = new Scanner(System.in);
		System.out.println("Enter Radius:");
		radius = Validation.getValidDouble(scan);
		circle = new Circle(radius);
		System.out.println("Circumference :" + circle.getFormattedCircumference());
		System.out.println("Area :" + circle.getFormattedArea());
		
		}while(Validation.getChoice(scan).equals("y"));
		System.out.println("You created: = " +Circle.ObjectCount+ " Circle objects. C U Later");
	}
	}

