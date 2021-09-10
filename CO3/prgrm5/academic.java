package packoops;

import java.util.Scanner;

class student {
	String name;
	int maths,english,science;
	Scanner sc=new Scanner(System.in);
	public student() {
		System.out.println("Enter the name of the student");
		name=sc.next();
		System.out.println("Enter the mark of Maths");
		maths=sc.nextInt();
		System.out.println("Enter the mark of English");
		english=sc.nextInt();
		System.out.println("Enter the mark of Science");
		science=sc.nextInt();
	}
	int total=maths+english+science;	
}

class sports extends student{
	String athletics,football,basketball;
	public sports() {
		System.out.println("Enter the Grade of athletics");
		athletics=sc.next();
		System.out.println("Enter the Grade of football");
		football=sc.next();
		System.out.println("Enter the Grade of basketball");
		basketball=sc.next();
	}
}

class result extends sports{
	public result() {
		
	}
	void display(){
		System.out.println("------Marklist of "+name+"------");
		System.out.println("Subject ");
		System.out.println("Maths : "+maths);
		System.out.println("English : "+english);
		System.out.println("Science : "+science);
		System.out.println("Total : "+total);
		System.out.println("--Sports-- ");
		System.out.println("Athletics : "+athletics);
		System.out.println("Football : "+football);
		System.out.println("Basketball : "+basketball);
	}
}

public class acadamic {
	public static void main(String[] args) {
		int b;
		Scanner obj1=new Scanner(System.in); 
		System.out.println("Enter the number of Person to be added :");
		b=obj1.nextInt();
		result[] obj=new result[b];
		for(int i=0;i<b;i++)
		{	
			
			obj[i]=new result();
		}
		for(int j=0;j<b;j++)
		{	
			
			obj[j].display();
		}
	    
	}
}