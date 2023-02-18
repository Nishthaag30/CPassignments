package _3_3539;

import java.util.Scanner;

public class StringsToggleCase {
	public static void main(String args[]) {
        // Your Code Here
		Scanner sc= new Scanner(System.in);
		String s = sc.nextLine();
		char carr[] = s.toCharArray();
		for(int i= 0; i< carr.length; i++)
		{
			if(Character.isUpperCase(carr[i]))
				carr[i] = Character.toLowerCase(carr[i]);
			else if(Character.isLowerCase(carr[i]))
				carr[i] = Character.toUpperCase(carr[i]);
		}
		String st = new String(carr);
		System.out.println(st);
    }
}
