package _3_3539;

import java.util.Scanner;

public class StringsStringCompression {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String s= sc.nextLine();
		StringBuilder str = new StringBuilder();
		for(int i=0;i<s.length();)
		{
			char ch= s.charAt(i);
			int j, cnt=0;
			for(j=i; j<s.length();j++)
				if(ch== s.charAt(j))
					cnt++;
				else break;
			if(cnt==1)
				str.append(ch);
			else{
				str.append(ch);
				str.append(cnt);
			}
			i=j;
		}
		System.out.print(str.toString());
    }
}
