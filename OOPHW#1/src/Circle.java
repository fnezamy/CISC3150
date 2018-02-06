import java.util.Scanner;

/*
 * Question 6: 
Write a program that prompts the user to enter the center coordinates and 
radiuses of two circles. Determine whether the circles are separate from 
each other, touching each other, overlapping each other, or completely 
within one another. Test each case and show the output.

 */
public class Circle {

	public static void main(String[] args) {
		double x1, x2, y1, y2, r1, r2, d;
		Scanner input = new Scanner (System.in);
		System.out.println("Enter Circle 1's center coordinates and radius");
		x1 = input.nextDouble();
		y1 = input.nextDouble();
		r1 = input.nextDouble();
		System.out.println("Enter Circle 2's center coordinates and radius");
		x2 = input.nextDouble();
		y2 = input.nextDouble();
		r2 = input.nextDouble();
		
		d = Math.pow((x1-x2)*(x1-x2)+ (y1-y2) * (y1-y2),0.5);
		
		if (d > (r1+r2))
			System.out.println("The circles do not overlap.");
		else if (d ==(r1+r2))
			System.out.println("The circles touch each other.");
		else if (r1 > r2 && d <= (r1-r2) || r2 > r1 && d <= (r2-r1))
			System.out.println("The circles are inside each other");
		else
			System.out.println("There is an overlap between the circles.");
		
	}
}


