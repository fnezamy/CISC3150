import java.util.Scanner;
import java.util.Stack;

/*
 * Question 1

Write a command line calculator. Implement all the basic functions 
(addition, subtraction...) as well as the correct behavior for 
parenthesis. Make sure your calculator works with both integers and 
doubles. Here's an example run:

javac Calculator 2 + 3
5

Separate all the arguments with a space to make your life easy.

If the user enters anything other than a number where a number belongs, 
throw a AlgebraFailException derived from the IlleglArgumentException. If 
the user enters an operation which isn't supported, throw a 
QuitMashingOnYourKeyboardException derived from the 
IllegalArgumentException. If the user forgets to enter a number, throw a 
UserIsADumbassException also derived from IllegalArgumentException. Make 
sure you deal with these exceptions gracefully. Don't pass them on to the 
JVM. The user should never know what we think of them.

You should also catch and deal with ArithmeticException in case the 
user tries to divide by zero.

Make sure your calculator correctly deals with the order of operations. 
(Remember PEMDAS?). If you research how to turn the command line arguments 
into postfix notation, it'll help. You will probably run into another 
interesting problem, too. *maniacal laughter*

Sources : 
https://www.tutorialspoint.com/javaexamples/data_intopost.htm

http://www.java.achchuthan.org/2012/03/convert-infix-to-postfix-using-stack-in.html
 */
public class Calculator {
	public static void main(String[]args) {
		
		String infix = String.join(" ", args);
		System.out.println("The infix expression is : "+infix);
		String postfix = infixToPostfix(infix);
		double ans = postfixEvaluate(postfix);
		System.out.println("The postfix expression is : "+ postfix);
		System.out.println("The answer to the expression is : "+ ans);
		
	}

	public static String infixToPostfix(String infix) throws UserIsADumbassException, AlegbraFailException, QuitMashingOnYourKeyboardException{
		String postFix = " ";
		Stack<Character> stack = new Stack<Character>();
		char character;
	     
		if(infix.isEmpty())
			throw new UserIsADumbassException();
		
		if (infix.charAt(0) == '+' || infix.charAt(0) == '-' || infix.charAt(0) == 'X' || infix.charAt(0) == '/' ||infix.charAt(0) == '%')
			throw new AlegbraFailException();
	
		for(int i = 0; i < infix.length(); i++) {
			character = infix.charAt(i);
	         
			if(Character.isLetter(character) && character != 'X')
			throw new AlegbraFailException();

			if(character == 'X' || character == '-' || character == '/' || character == '+' || character == '%') {
				while(!stack.empty() && precedence(stack.peek(), character))
					postFix += stack.pop();
	             
					stack.push(character);
			}else if ((character >= '!' && character <= '$') || ((character == '&') || character == '`' || character == ','))
	        	 throw new QuitMashingOnYourKeyboardException();
			else if(character == '(') 
	             stack.push(character);
			else if(character == ')') {
			  while(!stack.peek().equals('(') && !stack.isEmpty())
				  postFix += stack.pop();
	
			  if(!stack.isEmpty() && stack.peek().equals('('))
				  stack.pop(); 
		  } else
			  postFix += character;
		}
	     while(!stack.empty()) 
	     {
	    	 if(stack.peek().equals('('))
	         {
	             postFix = "There is no matching right parenthesis.";
	             return postFix;
	         }
	         postFix += " " + stack.pop();
	     }
	         return postFix;
	}
	
	public static boolean precedence(char first, char second) {
	      int v1 = 0, v2 = 0;

	      if(first == '-' || first == '+')
	         v1 = 1;
	      	else if(first == 'X' || first == '/' || first == '%')
	      		v1 = 2;    

	      if(second == '-' || second == '+')
	         v2 = 1;	
	      	else if(second == 'X' || second == '/' || second == '%')
	      		v2 = 2;    

	     if(v1 < v2)
	        return false;

	     return true;
	}
	
	 public static double postfixEvaluate(String exp) {

		 Stack<Double> s = new Stack<Double> ();
		 Scanner tokens = new Scanner(exp);
			
			while (tokens.hasNext()) {
				if (tokens.hasNextInt() || tokens.hasNextDouble()) {
					s.push(tokens.nextDouble());
				} else {
					double num2 = s.pop();
					double num1 = s.pop();
					String op = tokens.next();
					
					if (op.equals("+")) {
						s.push(num1 + num2);
					} else if (op.equals("-")) {
						s.push(num1 - num2);
					} else if (op.equals("X")) {
						s.push(num1 * num2);
					} else if (op.equals("/")){
						if(num2 == 0 || num2 == 0.0)
							throw new ArithmeticException("Can't divide by zero");
						else
							s.push(num1 / num2);
					} else if(op.equals("%"))
						s.push(num1 % num2);
				}
			}
			return s.pop();
	    }
}