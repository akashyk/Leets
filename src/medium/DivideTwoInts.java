package medium;

public class DivideTwoInts {
	public void demo() {

		int num = -500;
		int den = 3;
		System.out.println(devide(num, den));
	}

	int devide(int num, int den) {

		if (den == 1)
			return num;

		// 1. compute the sign
		boolean sign = (num < 0) == (den < 0);

		// 2. flip positives to negatives
		num = num > 0 ? -num : num;
		den = den > 0 ? -den : den;
		int result = helper(num, den);

		return sign ? result : -result;

	}

	int helper(int num, int den) {

		if (num > den)
			return 0;

		int quotient = 1;
		int sum = den;

		while (Integer.MIN_VALUE - sum < sum && (sum + sum) > num) {
			sum = sum + sum;
			quotient = quotient + quotient;
		}

		return quotient + helper(num - sum, den);
	}
}
