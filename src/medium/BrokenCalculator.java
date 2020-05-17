package medium;

public class BrokenCalculator {
	public void demo() {

		System.out.println("\n========= BrokenCalculator =========");
		System.out.println(brokenCalc(25, 101));
	}

	public int brokenCalc(int given, int target) {

		int steps = 0;

		while (target > given) {
			target = target % 2 > 0 ? target + 1 : target / 2;
			steps++;
			System.out.println(target + " : " + steps);
		}

		return steps + given - target;
	}
}
