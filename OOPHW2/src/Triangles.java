/*
 * Question 1:
Write a program that asks the user how tall of a pyramid do they want to 
display on the screen, and then displays the pyramid that counts up on the 
left, and counts down on the right. For eg, if the user enters 4, the 
program shows:

        1
      1 2 1
    1 2 3 2 1
  1 2 3 4 3 2 1
 */

import java.util.Scanner;

public class Triangles {

	public static void main(String[] args) {
		
		int count;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter height of pyramid");
		count = sc.nextInt();
		sc.close();
		   int row = 1;
			 
		    for (int i = count; i > 0; i--) {
		    	for (int j = 1; j <= i*2; j++)
		    		System.out.print(" ");
		 
		        for (int j = 1; j <= row; j++)             
		            System.out.print(j+" ");

		        for (int j = row-1; j >= 1; j--)
		        	System.out.print(j+" ");             
		             
		            System.out.println();
		            row++;
		     }
		}
}
