
class RnaTranscription {

    String transcribe(String dnaStrand) {
        String rna = "";

        for (Character c: dnaStrand.toCharArray()){
            rna += dnaToRna(c);
        }
        
        return rna;
    }

    private static String dnaToRna(Character nucleotide) {
        switch(nucleotide){
            case 'C': return "G";
            case 'G': return "C";
            case 'T': return "A";
            case 'A': return "U";

            default: return "";
        }
    } 
}
