package inheritance;

public class B extends A{
	public void disp1()
	{
		System.out.println("Method of class b");
	}

	public static void main(String[] args) {
		B obj=new B();
		obj.disp1();
		obj.disp();
		
		System.out.println(obj.a);

	}

}
