/*
 * Question 3:
Write a program that randomly generates an integer between 1 & 12, and 
displays the English name of that month. Run the program & show the 
output.
 */

public class Random {

	public static void main(String[] args) {
		int num= (int) (Math.ceil((Math.random()*12)));
		System.out.println(num);
		
		String month = "";
		
		switch(num){
		
		case 1 : month = "January";
				break;
		case 2 : month = "Feburary";
				break;
		case 3 : month = "March";
				break;
		case 4 : month = "April";
				break;
		case 5 : month = "May";
				break;
		case 6 : month = "June";
				break;
		case 7:  month = "July";
		 		break;
		case 8:  month = "August";
		 		break;
		case 9:  month = "September";
		 		break;
		case 10: month = "October";
				break;
		case 11: month = "November";
		 		break;
		case 12: month = "December";	
		 		break;
		}
		System.out.println(month);
	}

}
