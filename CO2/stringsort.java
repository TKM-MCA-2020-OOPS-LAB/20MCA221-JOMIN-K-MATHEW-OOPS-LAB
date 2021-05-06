package packoops;
import java.util.Scanner;

public class stringsort {

	public static void main(String[] args) {
		int count;
		String string;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of strings: ");
		count=s.nextInt();
		
		String str_arr[]=new String[count];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the strings: ");
		for(int i=0;i<count;i++)
		{
			str_arr[i]=sc.nextLine();
		}
		s.close();
		sc.close();
	
		for(int i=0;i<count;i++)
		{
			for(int j=i+1;j<count;j++)
			{
				if(str_arr[i].compareTo(str_arr[j])>0)
				{
					string=str_arr[i];
					str_arr[i]=str_arr[j];
					str_arr[j]=string;
				}
			}
		}
		
		System.out.println("String after sorting: ");
		for(int i=0;i<count;i++)
		{
			System.out.print(str_arr[i]+",");
		}
		
		
	}

}