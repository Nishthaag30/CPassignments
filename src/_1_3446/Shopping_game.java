package _1_3446;

import java.util.Scanner;

public class Shopping_game {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int T= sc.nextInt();
		while(T-- > 0)
		{
			int m= sc.nextInt();
			int n = sc.nextInt();
			int a=0, h=0, i=1;
			while(true)
			{
				a=a+ i++;
				if(a>m)
				{
					System.out.println("Harshit");
					break;
				}
				h=h+ i++;
				if(h>n)
				{
					System.out.println("Aayush");
					break;
				}
			}
		}
    }
}
