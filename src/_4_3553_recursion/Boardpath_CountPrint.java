package _4_3553_recursion;

import java.util.*;

public class Boardpath_CountPrint {
	public static void main(String args[]) {
        // Your Code Here
		Scanner sc  = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		List<Integer> li = new ArrayList<>();
		possiblepath(n,m,li);
		System.out.print("\n"+ countpath(n,m,0));
    }
	public static void possiblepath(int n , int m , List<Integer> li)
	{
		if(n==0)
		{
			for(Integer j : li)
				System.out.print(j);
			System.out.print(" ");
			return;
		}
		for(int i=1 ; i<=m; i++)
		{
			if(n>=i)
			{
				li.add(i);
				possiblepath(n-i, m, li);
				li.remove(li.size() - 1);
			}
		}
	}
	public static int countpath(int n , int m , int c)
	{
		if(n==0)
		{
			return c+1;
		}
		for(int i=1 ; i<=m; i++)
		{
			if(n>=i)
			{
				c= countpath(n-i, m, c);
			}
		}
		return c;
	}
}
