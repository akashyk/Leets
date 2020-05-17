package medium;

public class IsPalindrome {
	
	public void demo() {

		System.out.println("\n========= Reverse Words in a String     =========");
		System.out.println(isPalindrome("Marge, let's \"went.\" I await news telegram."));
	}

	
	private boolean isPalindrome(String s) {
		
		s= s.replaceAll("[^a-zA-z0-9]", "");
		
		for(int i=0, j = s.length() - 1; i < s.length(); i++, j--) {
			if(Character.toLowerCase(s.charAt(i)) !=  Character.toLowerCase(s.charAt(j))) {
				return false;
			}
		}
		
		return true;
	}
}
