package iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class V02Iterator {

	public static void main(String[] args) {
		
	LinkedList<String> animals= new LinkedList<>();
		//We can use Linked List as well as ArrayList as a collection
//	ArrayList<String> animals = new ArrayList<>();
	animals.add("Lion");
	animals.add("Tiger");
	animals.add("Elephant");
	animals.add("Wolf");
	
	Iterator<String> i= animals.iterator();
	System.out.println("Original list is :");
	while(i.hasNext())
	{
		String name=i.next();
		System.out.println(name);
		
		if(name.equals("Tiger"))
			i.remove();
				
	}
	System.out.println("New list is :");
	
	for(String animal: animals)
	{
		System.out.println(animal);
	}
	
	
	
	
}

}
