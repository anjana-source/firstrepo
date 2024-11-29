package superkey;

public class SuperChild extends SuperParent {

	public static void main(String[] args) {
		SuperChild obj=new SuperChild();
		obj.method1();
	
	}
public void method1()
{
	System.out.println(" method of child class");
	super.display();
	System.out.println("instance varible of parent class : "+super.a);


}
public SuperChild()
{
	super(20,30);
System.out.println("Constructor of child class");	
  
}


}
