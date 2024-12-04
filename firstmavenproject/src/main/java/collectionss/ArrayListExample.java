package collectionss;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {

	public static void main(String[] args) {
		ArrayList<String> ref=new ArrayList<String>();
		ref.add("A");
		ref.add("B");
		ref.add("C");
		ref.add("D");
System.out.println(ref);     //add method

ref.add(3,"E");               // add index value 
System.out.println(ref);

System.out.println(ref.get(2));  // get method
//System.out.println(ref.set(3,"G"));

ref.set(3, "G");              //set method
System.out.println(ref);

ref.remove(0);              // remove method
System.out.println(ref);

int s=0;
if(ref.isEmpty())
	System.out.println("list is empty");
else 
	s=ref.size();
System.out.println("Size: "+s);

if(ref.contains("H"))
	System.out.println("the Element is present");
else
	System.out.println("The element is not present");

    Iterator<String> var=ref.iterator();  // interface declared
    while(var.hasNext())
    {
    	System.out.println(var.next());
    	var.remove();
    	
    	
    }
    System.out.println(ref);
    
	}

}
