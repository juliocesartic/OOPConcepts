package domain;

import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapImpl extends CollectionImplementation {

	@Override
	public void testCollection() {
		SortedMap map2 = new TreeMap();
		map2.put("key1", "BB");
		map2.put("key3", "LL");
		map2.put("key4", "KK");
		map2.put("key2", "AA");
		displayAll(map2.keySet());
		
		map2.forEach((key, value)-> System.out.println("key;" + key+ ", value:" + value));
	}
	
	

}
