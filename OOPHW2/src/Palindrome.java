/*
 * Question 3:
Write a program to check whether a string is a palindrome (a string that's 
the same forward and backwards, for eg, madamimadam)
 */

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		String s;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		s = sc.nextLine();
		sc.close();
		int length = s.length();
		int j = length-1;
		for(int i = 0;i<length-1;i++){
			if(s.charAt(i)!=s.charAt(j)){
				System.out.println("String is not a palindrome");
				return;
			}
			else
				j--;
		}
		System.out.println("String is palindrome");
	}

}
