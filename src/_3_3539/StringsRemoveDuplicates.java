package _3_3539;

import java.util.Scanner;

public class StringsRemoveDuplicates {
	public static void main(String args[]) {
        // Your Code Here
		Scanner sc  = new Scanner(System.in);
		String s = sc.next();
		System.out.println(deleteduplicates(s));
    }
	public static String deleteduplicates(String str)
	{
		int i=0;
		StringBuilder s = new StringBuilder();
		while(i < str.length())
		{
			s.append(str.charAt(i));
			while(i< str.length()-1 && str.charAt(i) == str.charAt(i+1))
				i++;
			i++;
		}
		return s.toString();
	}
}
