package aggegation;

public class ChildA {
	int ID;
	String name;
	ParentA Address; // parent class name used as a reference variable in this class

	public static void main(String[] args) {
		ParentA objA=new ParentA("Happy villa","kozhikode","kerala",673004);
		ChildA obj=new ChildA(123,"Ammu",objA);
		obj.display();
		

	}
	ChildA(int ID,String name,ParentA address)
	{
		this.ID=ID;
		this.name=name;
		this.Address=address; // this is an object
		
	}
	public void display()
	{
		System.out.println("Id "+ID);
		System.out.println("Name "+name);
		System.out.println("Adress "+Address.Hname+" "+Address.state+" "+Address.city+" "+Address.pincode);
	}

}
