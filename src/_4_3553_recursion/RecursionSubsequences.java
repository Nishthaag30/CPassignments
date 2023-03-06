package _4_3553_recursion;

import java.util.Scanner;

public class RecursionSubsequences {
	public static void main(String args[]) {
        // Your Code Here
		Scanner sc = new Scanner(System.in);
		String s= sc.next();
		
		System.out.print("\n"+printsubsequence(s, "", 0));
    }
	public static int printsubsequence(String ques, String ans, int cnt)
	{
		if(ques.length() == 0)
		{
			cnt++;
			System.out.print(ans+" ");
			return cnt;
		}
		char ch = ques.charAt(0);
		cnt =printsubsequence(ques.substring(1), ans, cnt);
		cnt = printsubsequence(ques.substring(1), ans+ch, cnt);
		return cnt;
	}
}
