package _1_3446;

import java.util.Scanner;

public class Alex_Goes_Shopping {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int price[] = new int[n];
		for(int i=0 ;i<n; i++)
			price[i]= sc.nextInt();
		int q= sc.nextInt();
		while(q-->0)
		{
			int amount= sc.nextInt();
			int k= sc.nextInt();
			int c=0;
			for(int i=0; i<n;i++)
			{
				if(amount % price[i] == 0)
					c++;
			}
			if(c>=k)
				System.out.println("Yes");
			else
				System.out.println("No");
		}
    }
}
