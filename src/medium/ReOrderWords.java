package medium;

import java.util.Arrays;
import java.util.Collections;

public class ReOrderWords {
	
	public void demo() {

		System.out.println("\n========= ReOrderWords =========");
		//System.out.println(reverseWords("The sky is blue"));
		System.out.println(reverseWords(" a good   example  "));
	}
	
	private String reverseWords(String s) {
		
		String words [] = s.trim().split(" +");
	
		Collections.reverse(Arrays.asList(words));
		
		return String.join(" ", words);
	}

}
