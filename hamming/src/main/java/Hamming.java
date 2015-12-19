
public class Hamming {
    public static Integer compute(String strandA, String strandB) {
        Integer distance = 0;
        
        if (strandA.length() != strandB.length())
        	throw new IllegalArgumentException();
        
        for (int i = 0; i < strandA.length(); i++){
        	if (strandA.charAt(i) != strandB.charAt(i))
        		distance++;
        }
        return distance;
    } 
}