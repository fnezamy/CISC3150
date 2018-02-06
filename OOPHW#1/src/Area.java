import java.lang.Math;
import java.util.Scanner;

/*
 * Question 2: 
In a loop, read radiuses from a user. Calculate the area of a circle using 
the formula PI*r^2. Use the pow function, and the PI constant in the Math 
class. Pick your data types wisely. Exit when the user sends EOF (either 
ctrl-d, or ctrl-z depending on your operating system). Show your output.

 * 
 */
public class Area {
	public static void main(String[] args) {
		double radius;
		System.out.println("Enter a radius");
		Scanner sc = new Scanner(System.in);
		
		while(true){
			radius = sc.nextInt();
			double area;
			area = Math.PI * Math.pow(radius,2);
			System.out.println(area);
		}
	}


}
