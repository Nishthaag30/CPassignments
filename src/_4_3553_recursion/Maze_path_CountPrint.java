package _4_3553_recursion;

import java.util.Scanner;

public class Maze_path_CountPrint {
	public static void main(String args[]) {
        // Your Code Here
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int count = possiblepaths(n-1 ,m-1 , 0, "");
		System.out.println();
		System.out.print(count);
    }
	public static int possiblepaths(int n, int m , int c , String ans)
	{
		if(n==0 && m==0)
		{
			System.out.print(ans+" ");
			return c+1;
		}
		if(n>0)
		c= possiblepaths(n-1, m,c, ans+"V");
		if(m>0)
		c= possiblepaths(n, m-1,c, ans+"H");
		return c;
	}
}
