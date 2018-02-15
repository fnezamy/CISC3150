/*
 * 
Question 5:
Change Scanner's delimiter, and tokenize comma separated values entered by 
the keyboard
 */

import java.util.Scanner;

public class Delimiter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useDelimiter(",");
		System.out.println("Enter numbers seperated by commas");
		while(sc.hasNext()){
			System.out.println(sc.nextInt());
		}
		sc.close();
	}
}
