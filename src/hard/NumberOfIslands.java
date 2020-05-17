package hard;

public class NumberOfIslands {

	public void demo() {

		System.out.println("\n========= NumberOfIslands =========");

		char[][] grid = { { '1', '1', '1', '1', '0' }, { '1', '1', '0', '1', '0' }, { '1', '1', '0', '0', '0' },
				{ '0', '0', '0', '0', '0' } };

		System.out.println(numIslands(grid));
	}

	private int numIslands(char[][] grid) {
		int cnt = 0;

		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[0].length; j++) {

				if (grid[i][j] == '1') {
					cnt++;
					bfs(grid, i, j);
				}

			}
		}

		return cnt;
	}

	private void bfs(char[][] grid, int i, int j) {

		// cover the boundary conditions
		if (i < 0 || i >= grid[i].length || j < 0 || j >= grid.length || grid[i][j] != '1') {
			return;
		}
		grid[i][j] = 0;

		bfs(grid, i - 1, j);
		bfs(grid, i, j - 1);
		bfs(grid, i, j + 1);
		bfs(grid, i + 1, j);
	}
	

}
