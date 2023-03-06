package _4_3553_recursion;

import java.util.Scanner;

public class RecursionKeypadCodes {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String str= sc.next();
		String arr[] = {"abc", "def", "ghi","jkl", "mno", "pqrs", "tuv", "wx", "yz"};
		keypad(str, "", arr);
		System.out.println();
		System.out.print(countkeypad(str, 0, arr));
    }
	public static void keypad(String str, String ans, String arr[])
	{
		if(str.length()==0)
		{
			System.out.print(ans+" ");
			return;
		} 
		int idx  = (str.charAt(0) - '1');  
		String s = arr[idx];
		for(int i=0 ; i<s.length() ;i++)
		{
			char ch= s.charAt(i);
			keypad(str.substring(1), ans+ch, arr);
		}
	}
	public static int countkeypad(String str,int count, String arr[])
	{
		if(str.length()==0)
		{
			return count+1;
		} 
		int idx  = (str.charAt(0) - '1');  
		String s = arr[idx];
		for(int i=0 ; i<s.length() ;i++)
		{
			count = countkeypad(str.substring(1), count, arr);
		}
		return count;
	}
}
