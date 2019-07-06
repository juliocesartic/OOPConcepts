package domain;

import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetImpl extends CollectionImplementation {

	@Override
	public void testCollection() {
		SortedSet treeSet = new TreeSet();
	      treeSet.add("1");
	      
	      treeSet.add("3");
	      treeSet.add("4");
	      treeSet.add("2");
	      displayAll(treeSet);
		
	}

}
