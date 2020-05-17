package medium;

public class MatrixRowColZero {
	
	
	public void demo() {

		System.out.println("\n========= MatrixRowColZero =========");

		int matrix[][] = new int[][] 
				{
					{ 0, 1, 2, 0 }, 
					{ 3, 4, 5, 2 }, 
					{ 1, 3, 1, 5 } 
				};

				matrix = new int [][]{
						{0,1,2,0},
						{3,4,5,2},
						{1,3,1,5}
				};
				
				printMatrix(matrix);
				setZeroes(matrix);
				printMatrix(matrix);
	}

	public void setZeroes(int[][] matrix) {
		int m = matrix.length;
		int n = matrix[0].length;

		outerloop:
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if(matrix[i][j] == 0) {
					for(int l = 0; l < m; l++) {
						matrix[l][j] = 0 ;
					}
					
					for(int k = 0; k < n; k++) {
						matrix[i][k] = 0;
					}
					
					break outerloop;
				}
			}
		}

	}

	private void printMatrix(int[][] matrix) {

		int m = matrix.length;
		int n = matrix[0].length;
		System.out.println(" ============ MATRIX ===========");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println();
	}
	
}
