package _4_3553_recursion;

import java.util.Scanner;

public class NQueen {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean board[][]= new boolean[n][n];
		System.out.print(queen_sit(board, n, 0, 0));
    }
	public static int queen_sit(boolean board[][], int tq, int row, int count)
	{
		if(tq == 0)
		{
			return count+1;
		}
		for(int col = 0; col < board.length; col++)
		{
			if(ispossible(board, row, col))
			{
				board[row][col] = true;
				count = queen_sit(board, tq-1, row+1, count);
				board[row][col] = false;
			}
		}
		return count;
	}
	public static boolean ispossible(boolean board[][], int row, int col)
	{
		int r= row;
		while(r>=0)
		{
			if(board[r][col] == true)
				return false;
			r--;
		}
		int c= col;
		r=row;
		while(r>=0 && c>=0)
		{
			if(board[r][c] == true)
				return false;
			c--;
			r--;
		}
		r= row;
		c=col;
		while(r>=0 && c<board.length)
		{
			if(board[r][c]==true)
				return false;
			r--;
			c++;
		}
		return true;
	}
}
