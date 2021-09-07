package packoops;
import java.util.Scanner;
public class searchelement
{
    public static void main(String[] args) 
    {
        int n, x, flag = 0, i = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number of elements:");
        n = s.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the elements:");
        for(i = 0; i < n; i++)
        {
            a[i] = s.nextInt();
        }
        System.out.print("Enter the element to be searched:");
        x = s.nextInt();
        for(i = 0; i < n; i++)
        {
            if(a[i] == x)
            {
                flag = 1;
                break;
            }
            else
            {
                flag = 0;
            }
        }
        if(flag == 1)
        {
            System.out.println("Element found");
        }
        else
        {
            System.out.println("Element not found");
        }
    }
}