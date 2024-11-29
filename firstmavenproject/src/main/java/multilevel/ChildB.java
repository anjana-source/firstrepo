package multilevel;

public class ChildB extends MultiLevelA {
	public void display()
	{
		System.out.println(" child B is drived from parent class");
	}

	public static void main(String[] args) {
		ChildB obj=new ChildB();
		obj.display();
		obj.add();
		

	}

}
