package medium;

public class TeamsCount {

	public void demo() {
		int[] ratings = { 2, 5, 3, 4, 1 };

		System.out.println("Number of teams: " + numTeams(ratings));

	}
	
	private int numTeams(int[] ratings) {
		int count = 0;

		int n = ratings.length;

		for (int i = 0; i < n; i++) {
			int j = i;

			while (j < n) {

				if (ratings[j] > ratings[i]) {
					int k = j;
					while (k < n) {
						if (ratings[k] > ratings[j]) {
							count++;
						}
						k++;
					}
				} else if (ratings[j] < ratings[i]) {
					int k = j;
					while (k < n) {
						if (ratings[k] < ratings[j]) {
							count++;
						}
						k++;
					}
				}
				
				j++;
			}

		}
		return count;
	}
}
