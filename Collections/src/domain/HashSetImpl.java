package domain;

import java.util.HashSet;
import java.util.Set;

public class HashSetImpl extends CollectionImplementation {

	@Override
	public void testCollection() {
		Set hashSet = new HashSet();
	      hashSet.add("set1");
	      hashSet.add("set2");
	      hashSet.add("set3");
	      hashSet.add("set4");
	      displayAll(hashSet);
		
	}

}
