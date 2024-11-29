package accessspecifier;

public class Access11 {

	public static void main(String[] args) {
		Access11 obj=new Access11();
		obj.privateMethod();
		obj.protectedMethod();
		obj.defaultMethod();
		obj.publicMethod();

	}

	public void publicMethod()
	{
		System.out.println("Access specifer is Public");
	}
protected void protectedMethod()
{
System.out.println("Access specifer is Protected ");
}
private void privateMethod()
{
System.out.println("Access specifer is Private");
}
void defaultMethod()
{
System.out.println("Access specifer is Default");
}
}
