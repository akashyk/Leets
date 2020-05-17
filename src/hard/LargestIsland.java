package hard;

public class LargestIsland {

	public void demo() {

		System.out.println("\n========= LargestIsland =========");

		char[][] grid = { 
				{ '1', '1', '1', '1', '0' }, 
				{ '1', '1', '0', '1', '0' }, 
				{ '1', '1', '0', '0', '0' },
				{ '0', '0', '0', '0', '0' } };
		
		char[][] grid2 = { 
				{ '1', '1', '0', '1', '0' }, 
				{ '1', '0', '0', '1', '1' }, 
				{ '1', '1', '0', '1', '1' },
				{ '0', '0', '0', '1', '0' } 
				};

		System.out.println(largestIsland(grid));
		System.out.println(largestIsland(grid2));

	}

	private int largestIsland(char[][] m) {

		int count = 0;

		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[0].length; j++) {

				if (m[i][j] == '1') {
					count += Math.max(count, bfs(m, i, j));
				}
			}
		}

		return count;
	}

	private int bfs(char[][] m, int i, int j) {

		if (i < 0 || i >= m.length || j < 0 || j >= m[i].length || m[i][j] != '1') {
			return 0;
		}

		m[i][j] = 0;

		return (bfs(m, i - 1, j) + bfs(m, i, j - 1) + bfs(m, i, j + 1) + bfs(m, i + 1, j)) + 1;
	}
}
