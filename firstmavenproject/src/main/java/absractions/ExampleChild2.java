package absractions;

public class ExampleChild2 extends Exampleabstract1{

	public static void main(String[] args) {
		Exampleabstract1 obj=new ExampleChild2();
		obj.methodAbstract();
			

	}

	@Override
	public void methodAbstract() {
		System.out.println("this is example of abstract method");
		
	}

}
