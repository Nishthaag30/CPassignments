package _2_3504;

import java.util.*;

public class PairOfRoses {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int T= sc.nextInt();
		while(T-- > 0)
		{
			int nor= sc.nextInt();
			long price[]= new long[nor];
			for(int i=0; i<nor ; i++)
				price[i]= sc.nextInt();
			long amount= sc.nextInt();
			Arrays.sort(price);
			if(nor ==2 )
				System.out.println("Deepak should buy roses whose prices are "+price[0]+" and "+price[1]+".");
			else
			{
				int lo =0;
				int hi =nor-1;
				int ans1=0, ans2=0;
				while(lo<hi)
				{
					long sum= price[lo]+ price[hi];
					if(sum==amount)
					{
						ans1= lo;
						ans2= hi;
						lo++;
						hi--;
					}
					else if(sum > amount)
						hi--;
					else
						lo++;
				}
				System.out.println("Deepak should buy roses whose prices are "+price[ans1]+" and "+price[ans2]+".");
			}
		}
    }
}
