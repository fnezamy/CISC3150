import java.util.Random;
import java.util.Scanner;

/*
 * Question 1: Let's say that you draw a square around the top right 
quadrant of a circle. If the circle has a radius r, then the square that 
covers the top right quadrant of the circle will cover an area r^2.

The area of a circle is Pi*r^2. Given that we're dealing with only the top 
right quadrant, the area will be (Pi*r^2)/4. The ratio of the area of the 
top right quadrant of the circle to the area of the square that covers it 
would be...?

Generate 4 billion random dots (yes, it has to be exactly 4 billion) that 
fall within that square. Figure out how many of them fall inside the 
circle, and how many fall outside of it (if a point is right on the 
perimeter of the circle, it's considered inside). If you divide the number 
of dots that fall within the circle by the total number of dots you 
generated, you should get roughly the same ratio as the one you computed 
in the second paragraph. From there, you should be able to calculate the 
value of PI. Print that.

The important thing is that you'll be timing your code. The very first 
statement in your main should be:
long before = System.currentTimeMillis();
And the very last statement in your main should be:
System.out.println(System.currentTimeMillis()-before);

While this is not an accurate way to measure the speed of your code, it is 
a pretty good benchmark for your code on your computer. Write this program 
in your normal programming style and calculate your base time. Save this 
source code as version 1. Then research optimization techniques and 
improve your code the best that you can. I'm interested in your first run, 
and your best run. Provide the source code for each version.

Figure out how fast your code got as a percentage and put that in the body 
of the email. Also summarize and provide sources for the optimization 
techniques you used.



https://stackoverflow.com/questions/481144/equation-for-testing-if-a-point-is-inside-a-circle
Got the equation for checking if a point is inside a circle from here

I am assuming the center is (0,0) but the radius could be any Int number. 

Ratio of area of top right quadrant to area of square = (PIr^2/4) / r^2  = PI/4 

 */
public class Circle {

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
