package packoops;

public class products {
	int pcode;
	String pname;
	double price;
	double lowest;
	void data(int c, String n, double p){
	pcode=c;
	pname=n;
	price=p;
	}
	void display(){
	System.out.println(pcode+"\t\t"+pname+"\t\t"+price);
	}
	static void lowest(double price1,double price2, double price3){
	if(price1<=price2 && price1<=price3){
	System.out.println("\nProduct1 is the lowest price!");
	}
	else if(price2<=price1 && price2<=price3){
	System.out.println("\nProduct2 is the lowest price!");
	}
	else{
	System.out.println("\nProduct3 is the lowest price!");
	}
	}

	public static void main(String[] args){
	products obj1 = new products();
	products obj2 = new products();
	products obj3 = new products();
	obj1.data(1,"Product1",112);
	obj2.data(2,"Product2",1200);
	obj3.data(3,"Product3",324.4);
	System.out.println("Product Detail:\nProduct Code\tProduct Name\tProduct Price");
	obj1.display();
	obj2.display();
	obj3.display();
	lowest(obj1.price,obj2.price,obj3.price);
	}
	}


