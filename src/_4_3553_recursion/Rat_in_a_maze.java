package _4_3553_recursion;

import java.util.Scanner;

public class Rat_in_a_maze {
	public static void main(String args[]) {
        // Your Code Here
		Scanner sc  = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		char arr[][] = new char[n][m];
		for(int i=0; i<n; i++)
		{
			String str= sc.next();
			for(int j =0;j<m; j++)
				arr[i][j]= str.charAt(j);
		}
		rightmost(arr, 0, 0, new int[n][m]);
		if(f== 0)
			System.out.print("-1");
    }
	static int f=0;
	public static void rightmost(char arr[][], int cr, int cc, int ans[][])
	{
		if(cr== arr.length-1 && cc== arr[0].length-1)
		{
			ans[cr][cc]=1;
			f=1;
			Display(ans);
			return;
		}
		if(cr==arr.length || cc == arr[0].length || arr[cr][cc]== 'X')
			return;
		if(f==0)
		{
			arr[cr][cc] = 'X';
			ans[cr][cc] = 1;
			rightmost(arr, cr, cc+1, ans);
			rightmost(arr, cr+1, cc, ans);
			ans[cr][cc] = 0;
			arr[cr][cc] = 'O';
		}
		else return;
	}
	public static void Display(int ans[][])
	{
		for(int i=0;i <ans.length; i++)
		{
			for(int j = 0; j<ans[0].length; j++)
				System.out.print(ans[i][j]+" ");
			System.out.println();
		}
	}
}
