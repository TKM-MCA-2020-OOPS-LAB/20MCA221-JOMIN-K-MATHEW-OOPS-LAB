package packoops;

import java.util.Scanner;

public class stringhandling {


	    public static void main(String[] args) 
	    {
	    	Scanner s=new Scanner(System.in);
			System.out.println("Enter the first strings: ");
			String s1=s.nextLine();
			System.out.println("Enter the Second strings: ");
			String s2=s.nextLine();
			System.out.println("Enter the Third strings: ");
			String s3=s.nextLine();
			System.out.println("Enter the Fourth strings: ");
			String s4=s.nextLine();                ;
	        System.out.println("String 1:"+s1);
	        System.out.println("String 2:"+s2);
	        System.out.println("String concatenation:"+s1.concat(s2));
	        System.out.println("String length of first string:"+s1.length());
	        System.out.println("String comparison of two strings:"+s1.compareTo(s2));
	        System.out.println("String 2 empty or not:"+s2.isEmpty());
	        System.out.println("String 3 empty or not:"+s3.isEmpty());
	        System.out.println("Before trimming:"+s4);
	        System.out.println("After String trim:"+s4.trim());
	        System.out.println("String toLowerCase():"+s1.toLowerCase());
	        System.out.println("String toUpperCase():"+s2.toUpperCase());
	        System.out.println("String replace():"+(s1.replace("H", "B")));
	        System.out.println("Character Position value:"+s2.charAt(0));
	        System.out.println("String equals():"+s1.equals(s2));
	        
	    }
}
