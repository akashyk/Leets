package medium;

public class ReverseWordsInSentence {

	public void demo() {

		System.out.println("\n========= ReverseWordsInSentence =========");
		String sentence = "This could have been a better sentence";
		System.out.println(reverseWords(sentence));
	}

	private String reverseWords(String s) {

		char[] words = s.toCharArray();

		int start = 0;

		for (int i = 0; i < s.length(); i++) {

			if (words[i] == ' ') {
				reverse(start, i - 1, words);
				start = i + 1;
			}

		}

		reverse(start, s.length() -1, words);
		
		return new String(words);

	}

	private void reverse(int start, int end, char[] words) {
		for (int i = start, j = end; i < j; i++, j--) {
			char temp = words[i];
			words[i] = words[j];
			words[j] = temp;
		}
	}
}
