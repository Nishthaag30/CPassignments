package _2_3504;

import java.util.Scanner;

public class BookAllocation {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int t= sc.nextInt();
		while(t-- > 0)
		{
			int b= sc.nextInt();
			int nos= sc.nextInt();
			int pages[] = new int[b];
			for(int i=0; i<b; i++)
				pages[i] = sc.nextInt();
			System.out.println(maxofmin(pages, nos));
		}
    }
	static int maxofmin(int[] pages, int nos)
	{
		int lo= 0, ans=0;
		int hi=0;
		for(int i=0; i<pages.length; i++)
			hi+= pages[i];
		while(lo<=hi)
		{
			int mid= lo+ (hi-lo)/2;
			if(isitpossible(pages, mid, nos))
			{
				ans= mid;
				hi= mid-1;
			}
			else
				lo=mid+1;
		}
		return ans;
	}
	static boolean isitpossible(int[] pages, int mid, int nos)
	{
		int s= 1, i=0, rp=0;
		while(i<pages.length)
		{
			if(rp+ pages[i] <=mid)
			{
				rp= rp+pages[i];
				i++;
			}
			else
			{
				s++;
				rp=0;
			}
			if(s>nos)
				return false;
		}
		return true;
	}
}
