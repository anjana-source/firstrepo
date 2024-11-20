package hierar;

public class ChlidC extends Hierarchical{
	public void multi()
	{
		int a=7,b=8;
		int c=a*b;
		System.out.println("the result is:"+c);
	}

	public static void main(String[] args) {
		ChlidC object1=new ChlidC();
		object1.multi();
		object1.display();
		
				

	}

}
