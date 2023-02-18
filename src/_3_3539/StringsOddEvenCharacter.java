package _3_3539;

import java.util.Scanner;

public class StringsOddEvenCharacter {
	public static void main(String args[]) {
        // Your Code Here
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		char carr[] = s.toCharArray();
		for(int i= 0; i<carr.length; i++)
		{
			int ch= (int)carr[i];
			if(i%2 == 0)
				carr[i] = (char)(ch+1);
			else
				carr[i] = (char) (ch - 1);
		}
		String str= new String(carr);
		System.out.println(str);
    }
}
