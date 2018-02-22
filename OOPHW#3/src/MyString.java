/*
 * Create your own version of the String class. Call it MyString. This class 
should be immutable. Make sure to encapsulate your data properly. Provide 
an implementation for the following methods. Write your own code. 
Don't turn this into a wrapper class for thr String class.:

public MyString(char[] chars);
public char charAt(int index);
public int length();
public MyString substring(int begin, int end);
public MyString toLowerCase();
public MyString toUpperCase();
public int compareTo(MyString s);
public MyString getMyString();
public String toString();	
public static MyString valueOf(int i);


Do not use any function from the String class. The only time you're 
allowed to use the String class is in the toString() method. Even then, 
you may only use the String's constructor, but not the methods.

Make sure to provide a driver class, too, and show the output.
 */
public class MyString {
	private final char[] s;
	public MyString(char[] chars){
		this.s = chars;
	}
	public char charAt(int index){
		return s[index];
	}
	public int length(){
		return this.s.length;
	}
	public MyString substring(int begin, int end){
		char [] temp = new char[end - begin];
		for(int i = begin;i<end;i++){
			temp[i-begin]= this.s[i];
		}
		return new MyString(temp);
	}
	public MyString toLowerCase(){
		for(int i = 0;i<this.length();i++){
			if(this.s[i]>=65&&this.s[i]<=90)
				this.s[i] = (char) (this.s[i]+32); 
		}
		return new MyString(this.s);
	}
	public MyString toUpperCase(){
		for(int i = 0;i<this.length();i++){
			if(this.s[i]>=97 && this.s[i] <=122)
				this.s[i] = (char) (this.s[i]-32);
		}
		return new MyString(this.s);
	}
	public int compareTo(String s){
		if(this.length()!=s.length())
			return 0;
		for(int i = 0;i<this.length();i++)
			if(this.s[i]!=s.charAt(i))
				return 0;
		return 1;
	}
	public MyString getMyString(){
		char[] temp;
		temp = this.s;
		return new MyString(temp);
	}
	public String toString(){
		return new String(this.s);
	}
	public static MyString valueOf(int i){
		char[] temp = new char[(int)(Math.log10(i) + 1)];

		for (int j = temp.length - 1; j >= 0; j--) {
		    temp[j] = (char) ('0' + (i % 10));
		    i /= 10;
		}
		return new MyString(temp);
	}
}
