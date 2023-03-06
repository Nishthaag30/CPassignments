package _4_3553_recursion;

import java.util.Scanner;

public class AllIndicesProblem {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int t= sc.nextInt();
		while(t-- > 0)
		{
			String s = sc.next();
			System.out.println(replacepi(s,0));
		}
    }
	public static String replacepi(String s, int i)
	{
		while(i<s.length() -1 && (s.charAt(i)!= 'p' || s.charAt(i+1)!= 'i' ))
			i++;
		if(i >= s.length()-1)
			return s;
		return replacepi(s.substring(0, i)+"3.14"+s.substring(i+2), i+4);

	}
}
