package _4_3553_recursion;

import java.util.Scanner;

public class RecursionConvertStringtoInteger {
	public static void main(String args[]) {
        // Your Code Here
		Scanner sc = new Scanner(System.in);
		String s= sc.next();
		stringtoint(s, 0);
    }
	public static void stringtoint(String s, long num)
	{
		if(s.length() == 0)
		{
			System.out.print(num);
			return;
		}
		int x= Character.getNumericValue(s.charAt(0));
		stringtoint(s.substring(1) ,num*10+x);
	}
}
