package hierar;

public class ChildB extends Hierarchical {
	public void display1()
	{
		int a=3,b=5;
		int c=a+b;
		System.out.println("the sum of c is :"+c);
	}
	
	

	public static void main(String[] args) 
	{
		
		ChildB obj=new ChildB();
		obj.display1();
		obj.display();
		

	}

}
