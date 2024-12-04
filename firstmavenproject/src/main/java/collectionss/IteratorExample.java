package collectionss;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {

	public static void main(String[] args) {
		ArrayList<String> ref=new ArrayList<String>();
		ref.add("A");
		ref.add("B");
		ref.add("C");
		ref.add("D");
System.out.println(ref); 

Iterator<String> var=ref.iterator();  // interface declared
while(var.hasNext())
{
	System.out.println(var.next());
	var.remove();
	
	
}
System.out.println(ref);
	}

}
