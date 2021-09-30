package assignment1;

public class BA1A {
	
	/*
	 * This function takes a nucleotide text and checks it for patterns
	 */
	public static int PatternCount(String text, String pattern) {
		int count = 0;
		
		for (int i = 0; i < (text.length() - pattern.length() + 1) ; i++) {
			if (text.substring(i, pattern.length() + i).equalsIgnoreCase(pattern)) {
				count++;
			}
		}
		return count;
	}	
	
	public static void main(String[] args) {
		System.out.println(PatternCount("CCAGACGCCAGACGCCAGACGTGCCAGACGAGTCCCAGACGCCATGGTACCAGACGACCAGACGCCAGACGCCCAGACGTCAGAAACCCAGACGCCCAGACGCCAGACGCGCCAGACGAATCCCCAGACGCCAGACGGAACTCCAGACGAAACGCCAGACGCCCAGACGAGACCAGACGCCAGACGCCAACCAGACGACCAGACGTCAAGCGTCCAGACGCCAGACGCCAGACGCCAGACGCCAGACGGACCAGACGTCCAGACGCCAGACGTTGGTAGCCAGACGGCCGGCCAGACGCAGTTAGCCAGACGGCCAGACGCCAGACGCCAGACGAGACCAGACGCTTAACTCCCAGACGCCCAGACGCCAGACGCGCCAGACGCGCCCAGACGCATCCCCAGACGACTCCAAACCAGACGAATCCAGACGGCCAGACGGGCCAGACGGGCCACCAGACGTGAGACCAGACGGCGTACCAGACGATCGCTATGCCAGACGGGTCCAGACGAGTCCAGACGGTCCAGACGCCAGACGCTCCCAGACGACGCCAGACGGACCCCAGACGGCTACCAGACGCCAGACGACCAGACGGGCCAGACGCGCCAGACGAGCCCAGACGATCCCAGACGGCGTCCAGACGGCCAGACGATTCCAGACGATTATGCCAGACGGGCTCCAGACGCCAGACGTCTGGTAACCCAGACGTGGACCCAGACGCTCCAGACGCCCAGACGGCCAGACGGTGCAGTCCAGACGCCCCAGACGGCCAGACGCTACCAGACGCCAGACGAGTGCCCAGACGCGCCAGACGCCAGACGGTCGACTTTCCAGACGGGCATACGGGGCCAGACGGACCAGACGCCAGACGAACCAGACGAGACCAGACGAGGGCTAGGCCAGACGAACACACCAGACGCCAGACGGAGTTACCAGACGCTTACGCCAGACGAGCCAGACGTACGAACTCT", "CCAGACGCC"));
	}

}