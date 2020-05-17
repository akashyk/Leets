package medium;

public class EliminateUniqueDigits {

	public void demo() {

		int num = 3;
		System.out.println("\n========= EliminateUniqueDigits =========");
		System.out.println(getNumbersWithUniqueDigits(num));
	}

	public int getNumbersWithUniqueDigits(int n) {

		if (n == 0) {
			return 1;
		}
		int ans = 10, base = 9;

		for (int i = 2; i <= n && i <= 10; i++) {
			base = base * (9 - i + 2);
			ans += base;
		}
		return ans;

	}
}
