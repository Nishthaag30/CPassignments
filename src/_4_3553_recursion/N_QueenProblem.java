package _4_3553_recursion;

import java.util.Scanner;

public class N_QueenProblem {
	public static void main(String args[]) {
        // Your Code Here
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean board[][]= new boolean[n][n];
		System.out.print("\n"+place_queen(board, n , 0, 0));
    }
	public static int place_queen(boolean[][] board, int tq, int row, int count)
	{
		if(tq==0)
		{
			Display(board);
			return count+1;
		}
		for(int col= 0; col<board.length; col++)
		{
			if(isSafe(board, row, col)==true)
			{
				board[row][col] = true;
				count = place_queen(board, tq-1, row+1, count);
				board[row][col] = false;
			}
		}
		return count;
	}
	public static void Display(boolean[][] board)
	{
		for(int i=0; i<board.length; i++)
		{
			for(int j=0; j<board[0].length; j++)
				if(board[i][j] == true)
					System.out.print("{"+(i+1)+"-"+(j+1)+"}"+" ");
		}	
		System.out.print(" ");		
	}
	public static boolean isSafe(boolean[][] board, int row, int col)
	{
		int r= row;
		while(r>=0)
		{
			if(board[r][col]==true)
				return false;
			r--;
		}
		int c=col;
		r= row;
		while(r>=0 && c<board.length)
		{
			if(board[r][c]==true)
				return false;
			c++;
			r--;
		}
		r= row;
		c=col;
		while(r>=0 && c>=0)
		{
			if(board[r][c]==true)
				return false;
			c--;
			r--;
		}
		return true;
	}
}
