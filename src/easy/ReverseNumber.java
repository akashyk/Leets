package easy;

public class ReverseNumber {

	public void demo() {
		int n = 1534236469;
		
		System.out.println("\n ====== ReverseNumber ======= \n");
		
		System.out.println(reverseNumber(n));
	}

	private int reverseNumber(int n) {
		
		int reverseN = 0;
		
		while (n != 0) {
			
			int digit = n %10;
			
			if(reverseN > Integer.MAX_VALUE/10 
					|| (reverseN == Integer.MIN_VALUE / 10 && digit > 7)) {
				return 0;
			} 
			
			if(reverseN < Integer.MIN_VALUE/10 || (reverseN == Integer.MIN_VALUE /10 
					&& digit < -8)) {
				return 0;
			}
			
			reverseN = reverseN * 10 + (n % 10);
		
			n = n / 10;
		}

		
		return reverseN;
	}

}
