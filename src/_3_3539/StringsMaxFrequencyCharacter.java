package _3_3539;

import java.util.Scanner;

public class StringsMaxFrequencyCharacter {
	public static void main(String args[]) {
        // Your Code Here
		Scanner sc = new Scanner (System.in);
		String s = sc.next();
		System.out.print(maxcount(s));
    }
	public static char maxcount(String s)
	{
		int ans= 0;
		int i=0;
		char c= s.charAt(i);
		while(i< s.length())
		{
			int cnt=1;
			char ch = s.charAt(i);
			for(int j=i+1; j<s.length(); j++)
				if(ch== s.charAt(j))
					cnt++;
			if(cnt > ans)
			{
				ans = cnt;
				c= ch;
			}
			i++;
		}
		return c;
	}
	public static void Frequency_Character(String str) {
		int [] frq = new int [26];
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);//e
			frq[ch-97]= frq[ch-97]+1;
		}
		
		int max_i=0;
		for (int i = 1; i < frq.length; i++) {
			if(frq[i]>frq[max_i]) {
				max_i=i;
			}
		}
		char ch = (char) (97+max_i);
		System.out.println(ch);
		
	}
}
