package medium;

public class MinimumSwapsBG {

	public void demo() {

		System.out.println("\n=========== MinimumSwapsBG ============");
		String bg = "BGGGBBBBBGGGBB";

		 bg = "GGBBGGBB";
		 bg = "GGGBBB";
		 bg = "GBGBGB";
		 bg = "GGBGG";
		 bg = "GGBGGB";
		 bg = "GGGGBBBG";
		 bg = "GGGGBBBGB";
		 bg = "GGGGBGBGBGBGBGG";
		 bg = "GBGBGBGBGBGBGBGB";
		 
		System.out.println(reArrange(bg));
	}

	private static int reArrange(String s) {

		int res = 0;
		int len = s.length();
		
		if(len == 0) return 0;
		
		char startChar = 'B';
		char otherChar = 'G';
		
		if(s.startsWith("G")) {
			startChar = 'G';
			otherChar = 'B';
		}
		
		
		for (int i = 0; i < len;) {
			int count1 = 0;
			int count2 = 0;

			if (i != len && s.charAt(i) == startChar) {
				count1++;
				i++;
				while (i < len && s.charAt(i) == startChar) {
					count1++;
					i++;
				}
			}

			if (i != len && s.charAt(i) == otherChar) {
				count2++;
				i++;
				while (i < len && s.charAt(i) == otherChar) {
					count2++;
					i++;
				}
			}

			if (i == len)
				break;

			int count3 = 0;
			if (i != len && s.charAt(i) == startChar) {
				count3++;
				i++;
				while (i < len && s.charAt(i) == startChar) {
					count3++;
					i++;
				}
			}

			int min = count2 == 0 ? 0 : getCount(count1, count3);

			res = res + (min * count2);
		}

		return res;
	}

	private static int getCount(int b1, int b2) {
		if (b1 == 0) {
			return b2;
		} else if (b2 == 0) {
			return b1;
		} else {
			return Math.min(b1, b2);
		}
	}
}

/*
 * Your previous Plain Text content is preserved below:
 * 
 * Given a string S with N number of characters - which could be either B (Blue)
 * or G (Green). Write a method to determine minimum number of swaps needed to
 * bring all the B together
 * 
 * Example inputs: - BGGGBB - BGGGBBBBBGGGBB
 * 
 * - A swap is to switch positions of adjacent characters - To solve the first
 * example, BGGGBB, at each swap the string looks as follows BGGGBB -> GBGGBB ->
 * GGBGBB -> GGGBBB So to get the final string, we need 3 swaps
 * 
 * 
 */
