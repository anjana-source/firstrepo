package superkey;

public class SuperParent {
	int a=39;
	public void display()
	{
		System.out.println(" Method of parent class ");
		
	}
	public SuperParent()
	{
		System.out.println(" constructor of parent class ");
		
	}
	public SuperParent(int a, int b)
	{
		this();
	System.out.println("parameterised Constructor of parent class");	
	}
	
}
