package packoops;
public class complexadd {
	double real, img;
	   complexadd(double r, double i){
		this.real = r;
		this.img = i;
	   }
		
	   public static complexadd sum(complexadd c1, complexadd c2)
	   {
		//creating a temporary complex number to hold the sum of two numbers
		   complexadd temp = new complexadd(0, 0);

	        temp.real = c1.real + c2.real;
	        temp.img = c1.img + c2.img;
	        
	        //returning the output complex number
	        return temp;
	    }
	    public static void main(String args[]) {
	    	complexadd c1 = new complexadd(7.5, 2);
		complexadd c2 = new complexadd(1.2, 3.5);
		complexadd temp = sum(c1, c2);
	        System.out.printf("Sum is: "+ temp.real+" + "+ temp.img +"i");
	    }
}
