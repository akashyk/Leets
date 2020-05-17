package medium;

public class AtoI {
	
	public void demo() {
		
		String n = "42";
		//System.out.println(atoi(n));

		n = "    -42";
		//System.out.println(atoi(n));

		n = "42 with words";
		//System.out.println(atoi(n));
		
		n = "words 42 with words";
		//System.out.println(atoi(n));
		

		n = "2147483646";
		System.out.println(atoi(n));
	}
	
	public int atoi(String s) {
		
		if(s.isEmpty()) {
			return 0;
		}
		int startIndex = 0;
		int endIndex = 0;
		for(int i = 0 ; i < s.length(); i++) {
			if(s.charAt(i) != ' ') {
				startIndex = i;
				break;
			}
		}
		int sign = 1;
		if(s.charAt(startIndex) == '-' || s.charAt(startIndex) == '+'){
			
			if(s.charAt(startIndex) == '-')  sign = -1;
			
			startIndex++;
		}
		
		
		for(int i = startIndex ; i < s.length(); i++) {
			int asciiVal = (int)s.charAt(i);
			
			if(asciiVal < 47 || asciiVal > 58) {
				break;
			}
			
			endIndex = i;
		}
		
		int result = 0;
		for(int i = startIndex; i <= endIndex; i++) {
			int numericValue = (int)s.charAt(i);
			
			if(numericValue < 47 || numericValue > 58) {
				break;
			}
			
			
			if(result > Integer.MAX_VALUE / 10 ||
					(result == Integer.MAX_VALUE/10 && numericValue - 48 > 7))
				 
				return sign == -1? Integer.MIN_VALUE : Integer.MAX_VALUE;
						
			result = (result * 10) + numericValue - 48; 
		}
		
		
		return result * sign;
	}

}
