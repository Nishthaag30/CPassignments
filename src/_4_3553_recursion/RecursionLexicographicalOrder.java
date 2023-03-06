package _4_3553_recursion;

import java.util.*;

public class RecursionLexicographicalOrder {
	public static void main(String args[]) {
        // Your Code Here
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Integer> li = new ArrayList<>();
		lexiconumbers(n, li, 0);
		for(Integer i : li)
			System.out.print(i+" ");
    }
	public static void lexiconumbers(int n, List<Integer> li, int curr)
	{
		if(curr > n)
			return;
		li.add(curr);
		int i=0;
		if(curr == 0)
			i=1;
		for( ; i<=9; i++)
		{
			int y= curr*10 + i;
			if(y<=n)
				lexiconumbers(n, li, y);
			else break;
		}
	}
}
