/*
 * Question 4:
Feed a file that contains numbers into your program using command line 
redirection. Have your program read & print the file on the screen.

 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


public class File {

	public static void main(String[] args) {
		String filename;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a file name");
		filename = input.next();
		
		try {
			BufferedReader reader = new BufferedReader (new FileReader(filename));
			String line;
			
			while((line = reader.readLine())!= null){
					System.out.println(line);
				}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		
}	

