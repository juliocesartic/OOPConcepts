package domain;

import java.util.Collection;
import java.util.Iterator;

public abstract class CollectionImplementation {
	
	static void displayAll(Collection col) {
		Iterator itr = col.iterator();
		while(itr.hasNext()) {
			String str = (String)itr.next();
			System.out.println(str + " ");
		}
		
		System.out.println();
	}	
	
	public abstract void testCollection();

}
