/*
 * Question 5:
Write a program that reads three 2D points A, B, and C from the user. 
Next, calculate the length of each side of the triangle using the 
distance formula: sqrt((x2-x1)^2+(y2-y1)^2). Finally, determine if it's a 
real triangle. For a triangle to be real, the sum of any two sides needs 
to be greater than the third. Make sure your output has some real and at 
least one fake triangle.
 */

import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		double xa, xb, xc, ya, yb, yc;
		double ab, bc, ca;
		
		Scanner input = new Scanner (System.in);
		System.out.println("Enter coordinates for point A");
		xa = input.nextDouble();
		ya = input.nextDouble();
		System.out.println("Enter coordinates for point B");
		xb = input.nextDouble();
		yb = input.nextDouble();
		System.out.println("Enter coordinates for point C");
		xc = input.nextDouble();
		yc = input.nextDouble();
		
		ab =  Math.sqrt(Math.pow((xb-xa),2) + Math.pow((yb-ya),2));
		bc =  Math.sqrt(Math.pow((xc-xb),2) + Math.pow((yc-yb),2));
		ca =  Math.sqrt(Math.pow((xa-xc),2) + Math.pow((ya-yc),2));
		
		if(ab + bc > ca && bc + ca > ab && ca + ab > bc){
			System.out.println("The points form a triangle");
		}
		else{
			System.out.println("The points do not form a triangle");
		}
		return;

	}

}
