package _2_3504;

import java.util.Scanner;

public class PaintersPartitionProblem {
	public static void main(String args[]) {
		Scanner sc  =new Scanner(System.in);
		int nop= sc.nextInt();
		int nob = sc.nextInt();
		int[] len= new int[nob];
		for(int i=0; i<nob; i++)
			len[i] = sc.nextInt();
		System.out.println(timetopaint(len, nop));
    }
	static int timetopaint(int[] len, int nop)
	{
		int lo=0, ans=0; int hi= 0;
		for(int i=0; i<len.length; i++)
			hi+= len[i];
		while(lo<=hi)
		{
			int mid= lo+ (hi-lo)/2;
			if(canpaint(len, mid, nop))
			{
				ans=mid;
				hi= mid-1;
			}
			else
				lo= mid+1;
		}
		return ans;
	}
	static boolean canpaint(int[] len, int mid, int nop)
	{
		int p=1;
		int i=0;
		int paint= 0;
		while(i<len.length)
		{
			if(paint+ len[i] <=mid)
			{
				paint+= len[i];
				i++;
			}
			else{
				p++;
				paint=0;
			}
			if(p>nop)
				return false;
		}
		return true;
	}
}
