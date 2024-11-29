package polymorphism;

public class ChildB extends ParentA{

	public static void main(String[] args) {
		ChildB obj=new ChildB();
		obj.display(3,7);
	

	}
	public void display(int a, int b)
	{
		super.display(5,10);
		System.out.println("Method of child class B");
		int s=a+b;
		System.out.println("Sum is :"+s);
	}

}
