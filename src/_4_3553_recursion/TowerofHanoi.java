package _4_3553_recursion;

import java.util.Scanner;

public class TowerofHanoi {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		towerOfHanoi(n, "A", "B" , "C");
    }
	public static void towerOfHanoi(int n, String src, String des,  String hlp)
	{
		if(n==0)
			return;
		towerOfHanoi(n-1, src, hlp, des);
		System.out.println("Moving ring "+n +" from "+src+ " to "+ des);
		towerOfHanoi(n-1, hlp, des, src);
	}
}
