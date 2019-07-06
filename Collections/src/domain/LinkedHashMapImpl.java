package domain;

import java.util.LinkedHashMap;

public class LinkedHashMapImpl extends CollectionImplementation {

	@Override
	public void testCollection() {
		
		LinkedHashMap map3 = new LinkedHashMap();
		map3.put("key1", "JJJ");
		map3.put("key3", "LLL");
		map3.put("key2", "KKK");
		map3.put("key4", "MMM");
		displayAll(map3.keySet());
		displayAll(map3.values());
		
		map3.forEach((k,v) -> System.out.println("key:" + k + "Value:" + v ));
	}

}
