package setcollection;

import java.util.HashSet;
import java.util.Iterator;

public class SetExample {

	public static void main(String[] args) {
		HashSet<String> ref=new HashSet<String>();
		ref.add("1");
		ref.add("2");
		ref.add("3");
		ref.add("1");
		System.out.println(ref);
		
		if(ref.contains("G"))
		{
System.out.println("The elements is present");
		}
else
{
	System.out.println("The elements is not present");
}

		if(ref.isEmpty())
		{
			System.out.println("HashSet is empty");
		}
		else 
		{
			System.out.println("HashSet is not empty");
			int x=0;
			x=ref.size();
			System.out.println("Size is : "+x);
			
			Iterator<String> var=ref.iterator();
			while(var.hasNext())
			{
				System.out.println(var.next());
			}
			HashSet<String> ref1=new HashSet<String>();
			ref1.add("P");
			ref1.add("Q");
			ref1.add("R");
			ref1.add("S");
			System.out.println(ref1);
			ref.addAll(ref1);
			System.out.println(ref);
			
			
			
			ref.remove("2");
			System.out.println(ref);
			
			ref.removeAll(ref);
			System.out.println(ref);
		}
	}

}
