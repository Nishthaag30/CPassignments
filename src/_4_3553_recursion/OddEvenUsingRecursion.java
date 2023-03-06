package _4_3553_recursion;

import java.util.Scanner;

public class OddEvenUsingRecursion {
	public static void main(String args[]) {
        // Your Code Here
		Scanner sc  = new Scanner(System.in);
		int n = sc.nextInt();
		if(n%2 == 0)
		{
			printodd(n-1);
			printeven(n);
		}
		else{
			printodd(n);
			printeven(n-1);
		}
    }
	public static void printodd(int n)
	{
		if(n<=0)
			return;
		System.out.println(n);
		printodd(n-2);
	}
	public static void printeven(int n)
	{
		if(n<=0)
			return;
		printeven(n-2);
		System.out.println(n);
	}
}
