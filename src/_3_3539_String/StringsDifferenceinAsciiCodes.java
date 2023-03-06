package _3_3539_String;

import java.util.Scanner;

public class StringsDifferenceinAsciiCodes {
	public static void main(String args[]) {
        // Your Code Here
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		StringBuilder str= new StringBuilder();
		str.append(s.charAt(0));
		for(int i=0; i<s.length()-1; i++)
		{
			int x = (int)s.charAt(i);
			int y = (int)s.charAt(i+1);
			str.append(y-x);
			str.append(s.charAt(i+1));
		}
		System.out.print(str.toString());
    }
public static void Ascii_Codes(String str) {//acb
		String ans="";
		char prev= str.charAt(0);
		for (int i =1; i < str.length(); i++) {
			char curr= str.charAt(i);
			ans = ans + prev +(curr-prev);//c-a=99-97=2
		     prev=curr;
		}
		ans = ans + prev;
		System.out.println(ans);
	}
}
