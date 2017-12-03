/**Program:Prog_Exercise2_1
 * File:Prog_Exercise2_1.java
 * Summary:Imports user positive numerical input than adds the inputs together
 * Author:Lorenzo Quintana
 *Date: Nov 26,2017
 */
import java.util.Scanner;

public class Prog_Exercise2_1 {
	public static void main(String[]args){
		Scanner input  = new Scanner(System.in);
		
		System.out.println("Below you will enter 5 positive whole numbers one at a time, " + 
		" the program will output the sum of the 5 numbers.");
		
		System.out.println("Enter the 1st positive whole number:");
		int value1  = input.nextInt();
		
		System.out.println("Enter the 2nd positive whole numbers:");
		int value2 = input.nextInt();
		
		System.out.println("Enter the 3rd positive whole numbers:");
		int value3 = input.nextInt();
		
		System.out.println("Enter the 4th positive whole numbers:");
		int value4 = input.nextInt();
		
		System.out.println("Enter the 5th positive whole numbers:");
		int value5 = input.nextInt();
		
		int answer = value1 + value2 + value3 + value4 + value5;
		
		System.out.println("The sum of " + value1 + " + " + value2 + " + " + value3 + " + " + value4 + " + " + value5 + " is " + answer);
	}
/*Note for Professor:
 * In the question for Programming Exercise 2.1 you wrote "Using only the / and % operations, compute each digit and display the sum of the digits."
 * To be quite honest I didn't understand what you wanted me to use the / or % functions for if the user was going to give me the straight value.
 * I figured if I used either of those values it would give me different numbers than they gave me.  I guess one way around the value changing was to have them enter, 
 * a value like 5 then tell java to multiple the number by itself then divide by itself like 5=a so (5*a)/a would also give me the same value will using the
 * division function but???? why would I do that when it would just make things more cluttered?
 * I just figured I would share my confusion here so that you would understand why I didn't follow that part of the instructions.  Yes, I understand I could have asked
 * on the forums but since I'm doing this the last minute I understand if you deduct points for that part, I'm just sharing that I didn't do it not because I didn't know how,
 * but more that I didn't see a reason to.
 */
}
