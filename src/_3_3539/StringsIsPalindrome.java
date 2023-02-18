package _3_3539;

import java.util.Scanner;

public class StringsIsPalindrome {
	public static void main(String args[]) {
        // Your Code Here
		Scanner sc  = new Scanner(System.in);
		String s = sc.next();
		System.out.print(ispalindrome(s));
    }
	public static boolean ispalindrome(String s)
	{
		int i=0, j= s.length()-1;
		while(i<=j)
		{
			if(s.charAt(i)!= s.charAt(j))
				return false;
			i++;
			j--;
		}
		return true;
	}
}
