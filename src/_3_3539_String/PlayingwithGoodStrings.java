package _3_3539_String;

import java.util.Scanner;

public class PlayingwithGoodStrings {
	public static void main(String args[]) {
        // Your Code Here
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int i=0;
		int start=0;
		int cnt=0, ans= 0;
		while(i<s.length())
		{
			char ch = s.charAt(i);
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
				cnt++;
			else{
				start = i;
				cnt=0;
			}
			ans = Math.max(ans, i-start );	
			i++;
		}
		System.out.print(ans);
    }
}
