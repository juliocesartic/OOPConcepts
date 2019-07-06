package domain;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapImpl extends CollectionImplementation {

	@Override
	public void testCollection() {
		Map<String, String> map1 =  new HashMap<>();
		map1.put("key1", "J");
		map1.put("key4", "M");
		map1.put("key2", "K");
		map1.put("key3", "L");
		
		
		String key2 = map1.get("key2");
		System.out.println("key2 =" + key2 );
		
		Set<String> keys = map1.keySet();
		
		/*for(String key : keys) {
			System.out.println(key);
		}*/
		
		keys.forEach(key -> System.out.println(key));
		
		Collection<String> values = map1.values();
		values.forEach(value -> System.out.println(value));
		//displayAll(map1.keySet());
		//displayAll(map1.values());
		Set<Map.Entry<String, String>> entries = map1.entrySet();
		
		for(Map.Entry<String, String> entry: entries) {
			System.out.println("Key: " + entry.getKey() + ", Value:" + entry.getValue());
		}
	}

	


}
