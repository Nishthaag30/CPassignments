package _4_3553_recursion;

import java.util.Scanner;

public class ChessboardProblem_CountPrint {
	public static void main(String args[]) {
        // Your Code Here
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.print("\n"+chessboard(0,0, n, "", 0));
    }
	public static int chessboard(int row, int col, int n , String ans,int count)
	{
		if(row== n-1 && col == n-1)
		{
			
			System.out.print(ans+"{"+(n-1)+"-"+(n-1)+"}"+" ");
			return count+1;
		}
		if(row+2 < n && col+1 < n)
			count = chessboard(row+2, col+1, n, ans+"{"+row+"-"+col+"}"+"K", count);
		if(row+1 < n && col+2 < n)
			count = chessboard(row+1, col+2, n, ans+"{"+row+"-"+col+"}"+"K", count);

		if(row==0 || row==n-1 || col==0 || col== n-1){
			for(int i= 1; i+col < n ; i++)
				count = chessboard(row, col+i, n, ans+"{"+row+"-"+col+"}"+"R", count);
			for(int i= 1; i+row < n ; i++)
				count = chessboard(row+i, col, n, ans+"{"+row+"-"+col+"}"+"R", count);
		}

		if((row == 0 && col == 0) || (col>0 && row > 0))
			for(int i = 1;row+i < n && col+i<n; i++)
				count = chessboard(row+i, col+i, n, ans+"{"+row+"-"+col+"}"+"B", count);
		
		return count;
	}
}
