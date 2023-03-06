package _4_3553_recursion;

import java.util.Scanner;

public class N_KnightProblem {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean[][] board = new boolean[n][n];
		knight(board, 0, 0, "", n);
		System.out.println("\n" +count);
	}
	static int count= 0;
	public static void knight(boolean[][] board, int row, int col, String ans, int tn) {
		if (tn == 0) 
		{
			System.out.print(ans + " ");
			count++;
			return;
		}
		if (col == board.length) {
			row++;
			col = 0;
		}
		if (row == board.length) {
			return;
		}
		if (isitpossible(board, row, col)) 
		{
			board[row][col] = true;
			knight(board, row, col + 1, ans + "{" + row + "-" + col + "} ", tn - 1);
			board[row][col] = false;
		}
		knight(board, row, col + 1, ans, tn);
	}
	public static boolean isitpossible(boolean[][] board, int row, int col) 
	{
		int r[] = { -1, -1, -2, -2 };
		int c[] = { 2, -2, 1, -1 };
		for (int i = 0; i < c.length; i++) 
		{
			int n1 = row + r[i];
			int n2 = col + c[i];
			if (n1 >= 0 && n2 >= 0 && n2 < board.length && board[n1][n2] == true) {
				return false;
			}
		}
		return true;
	}
}
