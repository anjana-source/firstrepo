package multilevel;

public class DrivedC extends ChildB {
	public void drive()
	{
		System.out.println(" this is child class of Child B class");
	}

	public static void main(String[] args) {
		DrivedC obj=new DrivedC();
		obj.display();
		obj.drive();
		obj.add();
		

	}

}
