package _3_3539;

import java.util.Scanner;

public class FormBiggestNumber {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int t= sc.nextInt();
		while(t-- > 0)
		{
			int n = sc.nextInt();
			int arr[] = new int[n];
			for(int i=0; i<n ; i++)
				arr[i]= sc.nextInt();
			
			//sort
			for(int i=1; i<n; i++)
			{
				
				for(int j= 0; j<n-i; j++)
				{
					if(comparet(arr[j], arr[j+1]))
					{
						int temp = arr[j];
						arr[j]= arr[j+1];
						arr[j+1]= temp;
					}
				}
			}
			for(int i=0; i<n; i++)
				System.out.print(arr[i]);
			System.out.println();
		}
    }
	public static boolean comparet(int x1, int x2)
	{
		String ans1 ="" + x1 + x2;
		String ans2 ="" + x2 + x1;
		if(Long.parseLong(ans2) > Long.parseLong(ans1))
			return true;
		else
			return false;
	}
}
