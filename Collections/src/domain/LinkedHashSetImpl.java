package domain;

import java.util.LinkedHashSet;

public class LinkedHashSetImpl extends CollectionImplementation {

	@Override
	public void testCollection() {
		
		LinkedHashSet linkedHashSet = new LinkedHashSet();
		linkedHashSet.add("one");
		linkedHashSet.add("two");
		linkedHashSet.add("three");
		linkedHashSet.add("four");
	      displayAll(linkedHashSet);
	}

}
