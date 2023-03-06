package _4_3553_recursion;

import java.util.Scanner;

public class Sudoku_Solver {
	public static void main(String args[]) {
        // Your Code Here
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] sudoku = new int[n][n];
		for(int i = 0; i < n; i++)
			for(int j = 0; j < n; j++)
				sudoku[i][j] = sc.nextInt();
		Solve(sudoku);
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++)
				System.out.print(sudoku[i][j] + " ");
			System.out.println();
		}
    }
	public static boolean Solve(int[][] sudoku){
		for(int i = 0; i < sudoku.length; i++)
			for(int j = 0; j < sudoku[0].length; j++)
				if(sudoku[i][j] == 0){
					for(int ch = 1; ch <= 9; ch++){
						if(isSafe(sudoku,i,j,ch)){
							sudoku[i][j] = ch;
						if(Solve(sudoku))
							return true;
						else
							sudoku[i][j] = 0;
						}
					}
					return false;
				}
		return true;
	}
	public static boolean isSafe(int[][] sudoku,int row,int col,int c){
		for(int i=0;i<9;i++){
			if(sudoku[i][col] == c)
				return false;
			if(sudoku[row][i] == c) 
				return false;
			if(sudoku[3 * (row / 3) + i / 3][3 * (col / 3) + i % 3] == c)
				return false;
		}
		return true;
	}
}



//public static void main(String[] args) {
//	// TODO Auto-generated method stub
//
//	int[][] grid = { { 3, 0, 6, 5, 0, 8, 4, 0, 0 }, { 5, 2, 0, 0, 0, 0, 0, 0, 0 }, { 0, 8, 7, 0, 0, 0, 0, 3, 1 },
//			{ 0, 0, 3, 0, 1, 0, 0, 8, 0 }, { 9, 0, 0, 8, 6, 3, 0, 0, 5 }, { 0, 5, 0, 0, 9, 0, 6, 0, 0 },
//			{ 1, 3, 0, 0, 0, 0, 2, 5, 0 }, { 0, 0, 0, 0, 0, 0, 0, 7, 4 }, { 0, 0, 5, 2, 0, 6, 3, 0, 0 } };
//
//	SudokuSolver(grid, 0, 0);
//
//}
//
//public static void SudokuSolver(int[][] grid, int row, int col) {
//	// TODO Auto-generated method stub
//	if (col == 9) {
//		row++;
//		col = 0;
//	}
//	if (row == 9) {
//		Display(grid);
//		return;
//	}
//
//	if (grid[row][col] != 0) {
//		SudokuSolver(grid, row, col + 1);
//	}
//
//	else {
//
//		for (int val = 1; val <= 9; val++) {
//			if (isitpossible(grid, row, col, val) == true) {
//
//				grid[row][col] = val;
//				SudokuSolver(grid, row, col + 1);
//				grid[row][col] = 0;// undo
//
//			}
//
//		}
//
//	}
//
//}
//
//public static boolean isitpossible(int[][] grid, int row, int col, int val) {
//	// TODO Auto-generated method stub
//	// row
//	int c = 0;
//	while (c < 9) {
//		if (grid[row][c] == val) {
//			return false;
//		}
//		c++;
//	}
//
//	// col
//	int r = 0;
//	while (r < 9) {
//		if (grid[r][col] == val) {
//			return false;
//		}
//		r++;
//	}
//
//	// 3*3 Matrix
//	r = row - row % 3;
//	c = col - col % 3;
//	for (int i = r; i < r + 3; i++) {
//		for (int j = c; j < c + 3; j++) {
//			if (grid[i][j] == val) {
//				return false;
//			}
//
//		}
//
//	}
//
//	return true;
//}
//
//public static void Display(int[][] grid) {
//	for (int i = 0; i < grid.length; i++) {
//		for (int j = 0; j < grid.length; j++) {
//			System.out.print(grid[i][j]+" ");
//		}
//		System.out.println();
//
//	}
//
//}
//
//}