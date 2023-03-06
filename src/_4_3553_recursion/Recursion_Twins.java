package _4_3553_recursion;

import java.util.Scanner;

public class Recursion_Twins {
	public static void main(String args[]) {
        // Your Code Here
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		System.out.print(recursion_twins(s));
    }
	public static int recursion_twins(String str)
	{
		if(str.length() < 3)
			return 0;
		int count= 0;
		if(str.charAt(0)== str.charAt(2))
			count++;
		count += recursion_twins(str.substring(1));
		return count;
	}
}
