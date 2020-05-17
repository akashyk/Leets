package easy;

public class PrintDiamond {

	public void demo() {
		int n = 50;
		printDiamond(n);
	}

	private void printDiamond(int n) {

		if (n <= 0)
			return;

		printDia(n);

	}

	private void printDia(int n) {
		int cnt = 1;
		while (cnt <= n) {
			printStar(n - cnt, cnt);
			cnt++;
		}

		cnt = n - 1;

		while (cnt > 0) {
			printStar(n - cnt, cnt);
			cnt--;
		}
	}

	private void printStar(int from, int count) {
		StringBuilder sb = new StringBuilder();

		int i = 0;
		while (i < from) {
			sb.append(" ");
			i++;
		}
		i = 0;
		while (i < count) {
			sb.append("* ");
			i++;
		}

		System.out.println(sb.toString());

	}

}
