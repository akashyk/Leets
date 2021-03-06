package hard;

public class MakeLargestIsland {
	
	public void demo() {

		System.out.println("\n========= MakeLargestIsland =========");

		int[][] grid = { 
				{ 1, 1, 1, 1, 0 }, 
				{ 1, 1, 0, 1, 0 }, 
				{ 1, 1, 0, 0, 0 },
				{ 0, 0, 0, 0, 0 } };
		
		int[][] grid2 = { 
				{ 1, 1, 0, 1, 0 }, 
				{ 1, 0, 0, 1, 1 }, 
				{ 1, 1, 0, 1, 1 },
				{ 0, 0, 0, 1, 0 } 
				};

		System.out.println(makeLargestIsland(grid));
		System.out.println(makeLargestIsland(grid2));

	}

	private int makeLargestIsland(int[][] grid) {
		 int max = 0, m = grid.length, n = grid[0].length;
	        boolean hasZero = false; //To check if there is any zero in the grid
	        for(int i = 0; i < grid.length; i++){
	            for(int j = 0;j<grid[0].length;j++){
	                if(grid[i][j] == 0){
	                    grid[i][j] = 1;
	                    max = Math.max(max,dfs(i,j,grid,new boolean[m][n]));   
	                    if(max == m*n) return max;
	                    grid[i][j] = 0;
	                    hasZero = true;
	                }
	            }
	        }
	        return hasZero?max:m*n;
	    }
	    private int dfs(int i, int j, int[][] grid,boolean[][] visited){
	        if(i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] == 0||visited[i][j]) return 0;
	        visited[i][j] = true;
	        int result = 1+dfs(i-1,j,grid,visited)+dfs(i+1,j,grid,visited)+dfs(i,j+1,grid,visited)+dfs(i,j-1,grid,visited);
	        return result;
	    }
}
