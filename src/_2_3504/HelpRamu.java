package _2_3504;

import java.util.Scanner;

public class HelpRamu {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int T= sc.nextInt();
		while(T-- > 0)
		{
			int cost[]= new int[4];
			for(int i=0;i<4;i++)
				cost[i]= sc.nextInt();
			int n = sc.nextInt();
			int m = sc.nextInt();
			int rickshaws[] = new int[n];
			int cabs[] = new int[m];
			for(int i=0 ;i<n;i++)
				rickshaws[i]= sc.nextInt();
			for(int i=0 ;i<m;i++)
				cabs[i]= sc.nextInt();
			int sum=0;
			for(int i=0;i<n;i++)
				sum+= Math.min( rickshaws[i]*cost[0] , cost[1] );
			int min_rick= Math.min(sum, cost[2]);
			sum=0;
			for(int i=0;i<m;i++)
				sum+= Math.min( cabs[i]*cost[0] , cost[1] );
			int min_cab = Math.min(sum, cost[2]);
			int total = Math.min( min_rick + min_cab , cost[3] );
			System.out.println(total);
		}
    }
}
