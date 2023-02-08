package _2_3504;

import java.util.Scanner;

public class KartikBhaiyaAndStrings {

	public static void main(String args[]) {
		Scanner sc=  new Scanner(System.in);
		int k= sc.nextInt();
		String s = sc.next();
		int flipa= perfectnessofstring(s, 'a', k);
		int flipb = perfectnessofstring(s, 'b', k);
		System.out.println(Math.max(flipa, flipb));

    }

	public static int perfectnessofstring(String str, char ch, int k)
	{
		int si= 0; 
		int ei=0;
		int ans= 0;
		int flip = 0;
		while(ei< str.length())
		{
			if(str.charAt(ei)==ch)
				flip++;
			while(flip > k)
			{
				if(str.charAt(si)==ch)
					flip--;
				si++;
			}
			ans = Math.max(ans, ei-si + 1);
			ei++;
		}
		return ans;
	}

}
