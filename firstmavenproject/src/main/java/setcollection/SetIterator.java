package setcollection;

import java.util.HashSet;
import java.util.Iterator;

public class SetIterator {

	public static void main(String[] args) {
		HashSet<String> ref=new HashSet<String>();
		ref.add("A");
		ref.add("B");
		ref.add("C");
		ref.add("A");
		System.out.println(ref);
		
		if(ref.contains("G"))
		{
System.out.println("The elements is present");
		}
else
{
	System.out.println("The elements is not present");
}

			
			Iterator<String> var=ref.iterator();
			while(var.hasNext())
			{
				System.out.println(var.next());
			}
			HashSet<String> ref1=new HashSet<String>();
			ref1.add("P");
			ref1.add("R");
			ref1.add("S");
			ref1.add("T");
			System.out.println(ref1);
			
			ref.addAll(ref1);
			System.out.println(ref);
			
			
			
			ref.remove("C");
			System.out.println(ref);
			
			ref.removeAll(ref);
			System.out.println(ref);
		}

}
