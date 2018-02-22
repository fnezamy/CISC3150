
public class MyStringDriver {

	public static void main(String[] args) {
		char[] first = {'h','e','l','l','o'};
		char[] second = {'W','O','R','L','D'};
		
		MyString hello = new MyString(first);
		MyString world = new MyString(second);
		
		System.out.println("hello.charAt(4): " + hello.charAt(4));
        System.out.println("world.length(): " + world.length());
        System.out.println("hello.substring(1,4): " + hello.substring(1, 4));
        System.out.println("world.toLowerCase(): " + world.toLowerCase());
        System.out.println("hello.toUpperCase(): " + hello.toUpperCase());
        System.out.println("world.equals(PIZZA)? : " + world.equals(hello));
        System.out.println("hello.getMyString(): " + hello.getMyString());
        System.out.println("world.toString(): " + world.toString());
        System.out.println("MyString.valueOf(747): " + MyString.valueOf(747));
	}

	}


