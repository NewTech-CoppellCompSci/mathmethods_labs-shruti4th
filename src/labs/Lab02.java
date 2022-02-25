package labs;

import java.util.Scanner;

public class Lab02 {

	public static void main(String[] args) {
		
		//problem01();
		//problem02();
		//problem03();
		problem04();
		
	}
	

	
	public static void problem01() {
		
		Scanner inKey = new Scanner (System.in);
		
		System.out.print("Enter a positive integer: ");
		int input1 = inKey.nextInt();
		System.out.print("Enter another positive integer: ");
		int input2 = inKey.nextInt();
		
		//takes the max and min between the two nums
		int max = Math.max(input1, input2);
		int min = Math.min(input1, input2);
		
		//finds out how many numbers can be used
		int scope = max - min;
		
		for(int i = 1; i <= 10; i++) {
			int randNum = (int) (Math.random()* scope + min);//takes a random number from between the two integers
			System.out.print(randNum + " ");
		}
		
		System.out.println();
	}
	
	
	
	
	public static void problem02() {
		Scanner inKey = new Scanner (System.in);
		
		System.out.print("Enter in the radius: ");
		int radius = inKey.nextInt();
		System.out.print("Enter in the height: ");
		int height = inKey.nextInt();
		
		//finds the volume of a cylinder using pi * radius2 * height
		double volume = Math.PI * Math.pow(radius, 2) * height;
		
		System.out.println("The volume of the cylinder is " + volume);
		
		
		System.out.println();
	}

	
	

	public static void problem03() {
		Scanner inKey = new Scanner (System.in);
		
		System.out.print("Enter x1: ");
		int x1 = inKey.nextInt();
		System.out.print("Enter y1: ");
		int y1 = inKey.nextInt();
		System.out.print("Enter x2: ");
		int x2 = inKey.nextInt();
		System.out.print("Enter y2: ");
		int y2 = inKey.nextInt();
		
		//uses distance formula to find difference between points and math.pow to square root
		double xSquare = Math.pow(x2 - x1, 2);
		double ySquare = Math.pow(y2 - y1, 2);
		double distance = Math.sqrt(xSquare + ySquare);//takes square root √(x2-x1)^2 + (y2-y1)^2
		
		System.out.println("Distance between points = " + distance);
		
		
		System.out.println();
	}
	


	
	
	public static void problem04() {
		Scanner inKey = new Scanner (System.in);
		
		System.out.print("Enter a-value: ");
		int a = inKey.nextInt();
		System.out.print("Enter b-value: ");
		int b= inKey.nextInt();
		System.out.print("Enter c-value:");
		int c = inKey.nextInt();
		//System.out.println("x1 = 4.0");
		//System.out.println("x2 = 3.0");
		
		double neg = b * -1; //-b
		double b2 = Math.pow(b, 2);//b^2
		double num = 4 * a * c;//4ac
		double squareRoot = Math.sqrt(b2 - num);//√b^2 - 4ac
		double topPart = neg + squareRoot;//-b +- √b^2 - 4ac
		double botPart = 2 * a; //2a
		double x1 = topPart/botPart;//[-b +- √(b^2 - 4acz)]/2a
		
		System.out.println("x1 = " + x1);
		
		double topPart2 = neg - squareRoot;//-b +- √b^2 - 4ac
		double botPart2 = 2 * a; //2a
		double x2 = topPart2/botPart2;//[-b +- √(b^2 - 4acz)]/2a
		
		System.out.println("x2 = " + x2);
		
		
	}
	
	

	
}
