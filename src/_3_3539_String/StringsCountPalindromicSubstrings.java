package _3_3539_String;

import java.util.Scanner;

public class StringsCountPalindromicSubstrings {
	public static void main(String args[]) {
        // Your Code Here
		Scanner sc = new Scanner(System.in);
		String s  = sc.next();
		int cnt= 0;
		for(int i=0 ;i<s.length(); i++)
			for(int j=i+1; j<=s.length(); j++)
				if(ispalindrome(s.substring(i,j)))
					cnt++;
		System.out.print(cnt);
    }
	public static boolean ispalindrome(String s)
	{
		int i= 0;
		int j= s.length()-1;
		while(i<=j)
		{
			if(s.charAt(i) != s.charAt(j))
				return false;
			i++;
			j--;
		}
		return true;
	}
}
