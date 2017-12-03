/**Program:Prog_Exercise2_2
 * File:Prog_Exercise2_2.java
 * Summary:Converts a user given temperature in either C or F to the opposite temperature measurement.
 * Author:Lorenzo Quintana
 * Date:Nov 26, 2017
 */
import java.util.Scanner;

public class Prog_Exercise2_2 {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter a temperature in Fahrenheit:");
		double f_temp1 = input.nextDouble();
		double c_temp1 = ((f_temp1 - 32) * 5/9);
		System.out.println(f_temp1 + "F is equivalent to " + c_temp1 + "C");
		
		System.out.println("Please enter a temperature in Celsius:");
		double c_temp2 = input.nextDouble();
		double f_temp2 = (c_temp2 * 9/5 + 32);
		System.out.println(c_temp2 + "C is equivalent to " + f_temp2 + "F");
		
	}

}