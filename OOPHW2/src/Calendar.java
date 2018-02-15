import java.util.Scanner;

/*
 * Question 2: 
Write a program that displays a calendar on the screen. It asks the user 
the year, what day the first of January fell on, then displays every month 
from January to December. Make sure to get the leap years and the number 
of days in each month right. Your months should resemble the following 
format:

   February 2015      
Su Mo Tu We Th Fr Sa  
 1  2  3  4  5  6  7  
 8  9 10 11 12 13 14  
15 16 17 18 19 20 21  
22 23 24 25 26 27 28 
 */
public class Calendar {

	public static void main(String[] args) {
		int year;
		int startDay;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the year and what day the first of january fell on. Enter the day using 0 for Sunday, 1 for Monday, etc");
		year = sc.nextInt();
		startDay = sc.nextInt();
		sc.close();
		String month=""; 
		int days = 0;
		int dayCounter = startDay;
		
		for (int monthNum = 1; monthNum <=12; monthNum++)
	    {
	    	switch (monthNum) {
	    		case 1:  month = "January"; days = 31; break;
	            case 2:  month = "February";
	                    if ((year % 4 == 0 && year % 100 !=0) || year % 400 == 0) {
	                    	days = 29;
	                             break;
	                    }
	                    else {  
	                    	days = 28;
	                        break;
	                     }
	            case 3:  month = "March"; 	  days = 31; break; 
	            case 4:  month = "April"; 	  days = 30; break; 
	            case 5:  month = "May"; 	  days = 31; break;
	            case 6:  month = "June"; 	  days = 30; break;
	            case 7:  month = "July";  	  days = 31; break;
	            case 8:  month = "August";    days = 31; break;
	            case 9:  month = "September"; days = 30; break; 
	            case 10: month = "October";   days = 31; break; 
	            case 11: month = "November";  days = 30; break; 
	            case 12: month = "December";  days = 31; break;                  
	        }

	    		System.out.printf("%10s %d  \n", month , year);	    		
	    		System.out.println("Su Mo Tu We Th Fr Sa");

	    		for (int space = 1; space <= startDay; space++) 
	    			System.out.printf("%3s", " ");
	    		
	    		for (int i = 1; i <=days; i++)
	    		{
	    			dayCounter++;
	    			if (dayCounter% 7==0)
	    				System.out.printf("%-3d\n", i);
	                else
	                    System.out.printf("%-3d", i);
	    		}
	    		startDay = (startDay + days)%7;
	    		System.out.println("\n");
	    }    
	    }
}



