package labs;

import java.util.Scanner;

public class Lab01 {

	public static void main(String[] args) {
		
		problem01();
		problem02();
		problem03();
		problem04();
		
	}
	

	
	public static void problem01() {
		
		Scanner inKey = new Scanner (System.in);
		System.out.print("Enter in a number: ");
		int num = inKey.nextInt();
		System.out.print("Enter in a number: ");
		int num2 = inKey.nextInt();
		
		double exponent = Math.pow(num, num2); //gets the power of the base 
		System.out.println(num + "^" + num2 + " = " + exponent);
		
		System.out.println();
	}
	
	
	
	
	public static void problem02() {
		
		Scanner inKey = new Scanner (System.in);
		System.out.print("Enter in a positive integer: ");
		double num3 = inKey.nextDouble();
		
		double root = Math.sqrt(num3);//gets the square root of the number
		System.out.println("The square root of " + num3 + " is " + root);
		
		System.out.println();
	}

	
	

	public static void problem03() {
		
		Scanner inKey = new Scanner (System.in);
		System.out.print("Enter length of side A: ");//takes one side of the triangle
		double num4 = inKey.nextDouble();
		System.out.print("Enter length of side B: ");//takes another side of the triangle
		double num5 = inKey.nextDouble();
		
		double aSquare = Math.pow(num4, 2);
		double bSquare = Math.pow(num5, 2);
		
		double hypotenuse = Math.sqrt(aSquare + bSquare); //uses pythagoreum theorem a2 + b2 = c2
				
		System.out.println("Hypotenuse = " + hypotenuse);
		
		System.out.println();
	}


	
	
	public static void problem04() {
		Scanner inKey = new Scanner (System.in);
		
		int max = Integer.MIN_VALUE; 
		int min = Integer.MAX_VALUE;
		int input = -1;
		
		while (input != 0) {
			
			
		System.out.print("Enter an integer: ");
		input = inKey.nextInt();
		max = Math.max(max, input);//compares input to max value and stores the max
		min = Math.min(min, input);//compares input to min value and stores the min
		
			
		}
		
		System.out.println("Max = " + max + "\nMin = " + min);
		
	}
	
	
}
	
	
	

