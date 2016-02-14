import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author Priti
 *
 */
public class Circle {
	public double radius;
	 
    public static int ObjectCount;
	
	
	private String formatNumber;
   
	public Circle(double radius){
		this.radius = radius;
		ObjectCount++;
	}
	
	
	/**
	 * @return the formatNumber
	 */
	public String getformatNumber(double number) {
		BigDecimal bd = new BigDecimal(number);
		bd=bd.setScale(2, RoundingMode.UP);
		formatNumber = bd.toString();
		return formatNumber;
			
	}
	/**
	 * @return the radius
	 */
	public double getRadius(double rad) {
		
		return rad;
	}
	/**
	 * @return the area
	 */
	public double getArea() {
		 return Math.PI * radius* radius;
		
	}
	
	 /**
		 * @return the formattedArea
		 */
		public String getFormattedArea() {
			
			return getformatNumber(getArea());
			 
		}
			
	/**
	 * @return the circumference
	 */
	public double getCircumference() {
		return 2*Math.PI*radius;
			
	}
	/**
	 * @return the formatted circumference with 
	 * the formatted  Number method.
	 */
	public String getFormattedCircumference() {
		
		return getformatNumber(getCircumference());
	}
	/**
	 * @return the objectCount
	 */
	public static int getObjectCount() {
		ObjectCount++;
		return ObjectCount;
	}

}
