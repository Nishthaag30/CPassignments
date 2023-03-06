package _3_3539_String;

import java.util.Scanner;

public class KartikBhaiyaAndStrings {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		String s = sc.next();
		int swapa = maxPerfectness(s, k,'a');
		int swapb = maxPerfectness(s, k,'b');
		System.out.println(Math.max(swapa, swapb));

    }
	public static int maxPerfectness(String s, int k ,  char ch)
	{
		int ans= 0, start=0 , i=0, swap=0;
		while(i< s.length())
		{
			if(s.charAt(i) == ch)
				swap++;
			while(swap> k){
				if(s.charAt(start++)==ch)
					swap--;
			}
			ans= Math.max( ans, i - start +1);
			i++;
		}
		return ans;
	}
}
