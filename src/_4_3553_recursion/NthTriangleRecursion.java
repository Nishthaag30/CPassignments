package _4_3553_recursion;

import java.util.Scanner;

public class NthTriangleRecursion {
	public static void main(String args[]) {
        // Your Code Here
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(nthtriangle(n));
    }
	public static int nthtriangle(int n)
	{
		if(n==0)
			return 0;
		int x= nthtriangle(n-1);
		return x+n;
	}
}
