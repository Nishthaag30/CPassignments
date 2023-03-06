package _4_3553_recursion;

import java.util.*;

public class Mazepath_D_CountPrint {
	public static void main(String args[]) {
        // Your Code Here
		Scanner sc =  new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		printpath(n-1, m-1, "");
		System.out.print("\n"+ countpath(n-1, m-1, 0));
    }
	public static void printpath(int n, int m, String ans)
	{
		if(n==0 && m==0)
		{
			System.out.print(ans+ " ");
			return; 
		}
		if(n>0)
			printpath(n-1, m, ans+ "V");
		if(m>0)
			printpath(n, m-1, ans+"H");
		if(n>0 && m>0)
			printpath(n-1, m-1, ans+ "D");
	}
	public static int countpath(int n, int m, int c)
	{
		if(n==0 && m==0)
		{
			return c+1; 
		}
		if(n>0)
			c = countpath(n-1, m, c);
		if(m>0)
			c = countpath(n, m-1, c);
		if(n>0 && m>0)
			c = countpath(n-1, m-1, c);
		return c;
	}
}
