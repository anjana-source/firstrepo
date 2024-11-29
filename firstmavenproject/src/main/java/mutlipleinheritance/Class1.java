package mutlipleinheritance;

public class Class1 implements Interface1,Interface2
{

	public static void main(String[] args) {
		// Class1 obj=new Class1();
		Interface1 obj=new Class1();
		Interface2 obj1=new Class1();
		obj.method1();
		obj1.method2();


	}

	@Override
	public void method2() {
		System.out.println("Method of interface class 1");
		
	}

	@Override
	public void method1() {
		System.out.println("Method of interface class 2");
		
	}

}
