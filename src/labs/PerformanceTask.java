package labs;

import java.util.Scanner;

public class PerformanceTask {

	public static void main(String[] args) {
		
		Scanner inKey = new Scanner (System.in);
		System.out.print("Enter launch velocity (m/s) >>>> ");
		double velocity = inKey.nextDouble();
		System.out.print("Enter launch angle (degrees) >>>> ");
		double angle = inKey.nextDouble();
		
		int time = 0;
		boolean onGround = false;
		double xPosition = 0.0;
		double yPosition = 0.0;
		int time2 = 0;
		
		System.out.println("Time: 0s\nxPos: 0.0\nyPos: 0.0");
		
		while (yPosition >= 0) {
			time++;
			xPosition = Math.cos(Math.toRadians(angle)) * time * velocity;
			yPosition = Math.sin(Math.toRadians(angle)) * time * velocity - 0.5 * 9.8 * time * time;
			if (yPosition < 0) {
				yPosition = 0;
				System.out.println("Time: " + time + "s\nx-Pos: " + xPosition + "\ny-Pos: " + yPosition);
				break;
			}
			System.out.println("Time: " + time + "s\nx-Pos: " + xPosition + "\ny-Pos: " + yPosition);
				
		
			
			
		
		}	
	}
	
	
}
