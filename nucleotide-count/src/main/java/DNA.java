import java.util.HashMap;
import java.util.Map;
import java.lang.IllegalArgumentException;

public class DNA {
	String sequence;
	String nucleotides = "ACGT";
	
	public DNA(String sequence){
		this.sequence = sequence;
	}
	
	public int count(char character){
		int count = 0;
		if (nucleotides.indexOf(character) == -1) {
			throw new IllegalArgumentException("You must enter a valid nucleotide.");
		}
		
		for (char x : sequence.toCharArray()) {
			if ( x == character) {
				count += 1;
			}
		}
		return count;
	}
	
	public Map<Character, Integer> nucleotideCounts(){
		Map<Character, Integer> results = new HashMap<>();
		
		for (char y : nucleotides.toCharArray()){
			results.put(y, count(y));
		}		
		return results;
	}
	
}



