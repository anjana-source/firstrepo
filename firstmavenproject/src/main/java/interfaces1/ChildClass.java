package interfaces1;

public class ChildClass implements InterfaceClass {

	public static void main(String[] args) {
		//InterfaceClass ref=new ChildClass();
		ChildClass ref=new ChildClass();
		ref.abstractMethod1();
		ref.abstractMethod2();
		ref.childMethod();

	}

	@Override
	public void abstractMethod1() {
		System.out.println("First method of interface class ");
		
	}

	@Override
	public void abstractMethod2() {
		System.out.println("second method of interface class ");
		
	}
	public void childMethod()
	{
		System.out.println(" method of child class ");
	}

}
