package _4_3553_recursion;

import java.util.Scanner;

public class GenerateParenthesis {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		printparenthesis(n, "", 0,0);
    }
	public static void printparenthesis(int n, String ans, int noop, int nocl)
	{
		if(nocl==n && noop==n)
		{
			System.out.println(ans);
			return;
		}
		if(nocl<noop)
			printparenthesis(n, ans+')', noop, nocl+1);
		if(noop<n)
			printparenthesis(n, ans+'(', noop+1, nocl);
		


	}
}
