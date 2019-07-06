package domain;

import java.util.ArrayList;
import java.util.List;

public class ArrayListImpl extends CollectionImplementation {

	@Override
	public void testCollection() {
		
		List arrayList = new ArrayList();
		arrayList.add("x");
		arrayList.add("y");
		arrayList.add("z");
		arrayList.add("w");
		displayAll(arrayList);
	}
	
}
