import java.util.Random;
import java.util.Scanner;

public class Optimzing2 {

	public static void main(String[] args) {
		
		long before = System.currentTimeMillis();
		System.out.println("Enter the radius r");
		Scanner sc = new Scanner(System.in);
		int radius = sc.nextInt();
		long dotsInsideCircle = 0;
		long dotsInsideSquare = 0;
		long totalDots = 0;
		double areaRatio;
		//Random rand = new Random();			
		Random rand = new Random(System.currentTimeMillis());
		
		for(totalDots = 0; totalDots < 4000000000L; totalDots++) {
			
			int x = rand.nextInt();
			int y = rand.nextInt();
			
			if(x * x + y * y <= radius)										
				dotsInsideCircle++;
			else
				dotsInsideSquare++;
		}
		
		areaRatio = (double) dotsInsideCircle/totalDots;
		
		System.out.println("Ratio of areas (PI/4) = " + areaRatio);
		System.out.println("The estimated value of PI = 4 X (PI/4): " + 4*areaRatio);
		System.out.println("The speed is ");
		System.out.print(System.currentTimeMillis()-before);

	}

}