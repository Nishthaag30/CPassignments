package _4_3553_recursion;

import java.util.Scanner;

public class RatChasesitscheese {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc  = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		char[][] maze=  new char[n][m];
		for(int i =0; i<n; i++)
		{
			String str= sc.next();
			for(int j =0; j<m; j++)
			{
				maze[i][j] = str.charAt(j);
			}
		}
		int ans[][] = new int[n][m];
		HasPath(maze, 0,0,ans);
		if(f== false)
			System.out.print("NO PATH FOUND");
	}
	static boolean f= false;
	public static void HasPath(char [][] maze, int cc, int cr, int[][] ans)
	{
		if(cr==maze.length-1 && cc==maze[0].length-1)
		{
			ans[cr][cc] =1;
			f= true;
			Display(ans);
			return;
		}
		if(cr<0 || cc<0 || cr>=maze.length || cc >=maze[0].length || maze[cr][cc] == 'X')
			return;
		maze[cr][cc]= 'X';
		ans[cr][cc] = 1;
		HasPath(maze, cc, cr-1, ans);
		HasPath(maze, cc, cr+1, ans);
		HasPath(maze, cc-1, cr, ans);
		HasPath(maze, cc+1, cr, ans);
		ans[cr][cc]=0;
		maze[cr][cc] = 'O';
	}
	public static void Display(int[][] ans)
	{
		for(int i =0; i<ans.length; i++)
		{
			for(int j =0; j<ans[0].length; j++)
				System.out.print(ans[i][j]+" ");
			System.out.println();
		}
	}
}
