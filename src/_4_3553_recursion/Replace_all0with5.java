package _4_3553_recursion;

import java.util.Scanner;

public class Replace_all0with5 {
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n==0){
			System.out.println("5");
			return;
		}
		System.out.println(replaces(n, 0));
    }
	public static int replaces(int n , int sum)
	{
		if(n<=0)
			return sum;
		sum = replaces(n/10 , sum);
		if(n%10 == 0)
			sum = sum*10 + 5;
		else
			sum = sum * 10 + n%10;
		return sum;
	}
}
