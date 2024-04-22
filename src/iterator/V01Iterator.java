package iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class V01Iterator {

	public static void main(String[] args) {
		
		ArrayList<Integer> numbers= new ArrayList<> ();
		
		numbers.add(72);
		numbers.add(35);
		numbers.add(28);
		numbers.add(92);
		
		Iterator<Integer> i= numbers.iterator();
		
		while(i.hasNext())
		{
			int num=i.next();
			System.out.println(num);
		}
		
		
		
		
		
		
	}

}
