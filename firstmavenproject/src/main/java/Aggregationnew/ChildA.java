package Aggregationnew;


public class ChildA {
	int qty;
	Parent1 product;

	public static void main(String[] args) {
		
  Parent1 objA=new Parent1(115,"Computer", "intel i5");
  ChildA obj=new ChildA(10, objA);
  obj.display();
	}

public ChildA(int qty,Parent1 product)
{
	super();
	this.qty=qty;
	this.product=product;
}
public void display()
{
	System.out.println("product:"+product.product+"\nID :"+product.ID+"\nDescription: "+product.description);
	System.out.println("quantity :"+qty);
}



}

