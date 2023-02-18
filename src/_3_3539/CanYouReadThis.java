package _3_3539;

import java.util.Scanner;

public class CanYouReadThis {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int prev=-1, curr= -1;
		StringBuilder str = new StringBuilder();
		for(int i=0; i< s.length();i++)
		{
			char ch= s.charAt(i);
			// if(prev!=curr)
			// 	str.append(' ');
			if(Character.isLowerCase(ch))
			{
				prev= curr;
				curr= 0;
			}
			if(Character.isUpperCase(ch))
			{
				prev= curr;
				curr= 1;
			}
			if(curr==1)
				str.append(' ');
			str.append(ch);
		}
		s= str.toString();
		s= s.trim();
		for(int i=0; i<s.length(); i++){
			if(s.charAt(i) ==' '){
				System.out.println();
				continue;
			}
			System.out.print(s.charAt(i));
		}
    }
	
//	Alternate method
	public static void printString(String str) {
		String ans = "";
		ans = ans + str.charAt(0);
		for(int i=1; i<str.length();i++) {
			char ch = str.charAt(i);
			if(ch>='A' && ch<='Z') {
				System.out.println(ans);
				ans = "";
				ans = ans + ch;
			}
			else
				ans = ans + ch;
		}
	}
}
