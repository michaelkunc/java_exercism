import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Etl {
   public Map<String, Integer> transform(Map<Integer, List<String>> old) {
	   Map<String, Integer> result = new HashMap<>();
	   old.entrySet().stream()
	   	.forEach(e -> e.getValue().stream()
	   			.forEach(v -> result.put(v.toLowerCase(), e.getKey())));
      return result;
   }
}

