package absractions;

public class AbstractChildB extends AbstactClassA {

	public static void main(String[] args) {
	//AbstactClassA obj=new AbstractChildB(); //reference variable of parent class
		
		AbstractChildB obj=new AbstractChildB();
		obj.abstractMethod();
		obj.instanceMethod();
		obj.subMethod();
	

	}

	@Override
	public void abstractMethod() {
		int a=7,b=10;
		int c=a+b;
		System.out.println("the sum is:"+c);
		
	}
public void subMethod()
{
	int a=5,b=2;
	int c=a-b;
	System.out.println("answer of child class :"+c);
}
	
}
