import java.util.Random;
import java.util.Scanner;

public class Optimizing {

	public static void main(String[] args) {
		
		long before = System.currentTimeMillis();
		System.out.println("Enter the radius r");
		Scanner sc = new Scanner(System.in);
		int radius = sc.nextInt();
		long dotsInsideCircle = 0;
		long dotsInsideSquare = 0;
		long totalDots = 0;
		double areaRatio;
		Random rand = new Random();							
		
		for(totalDots = 0; totalDots < 4000000000L; totalDots++) {
			
			double x = rand.nextDouble();
			double y = rand.nextDouble();
			
			if(x * x + y * y <= radius)										
				dotsInsideCircle++;
			else
				dotsInsideSquare++;
		}
		
		areaRatio = (double) dotsInsideCircle/totalDots;
		
		System.out.println("Dots that hit the circle: " + dotsInsideCircle);
		System.out.println("Dots that hit the square: " + dotsInsideSquare);
		System.out.println("Ratio of areas (PI/4) = " + areaRatio);
		System.out.println("The estimated value of PI = 4 X (PI/4): " + 4*areaRatio);
		
		System.out.println(System.currentTimeMillis()-before);

	}

}
