import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Etl {
   public Map<String, Integer> transform(Map<Integer, List<String>> old) {
	   Map<String, Integer> result = new HashMap<String, Integer>();
	   for (Map.Entry<Integer, List<String>> entry: old.entrySet()) {
		   Integer key = entry.getKey();
		   for (String e: entry.getValue()){
			   result.put(e.toLowerCase(), key);
		   }
	   }
	return result;
   }
}
