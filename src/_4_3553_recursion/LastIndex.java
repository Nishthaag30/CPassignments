package _4_3553_recursion;

import java.util.Scanner;

public class LastIndex {
	public static void main(String args[]) {
        // Your Code Here
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int arr[]= new int[n];
		for(int i =0 ;i<n; i++)
			arr[i] = sc.nextInt();
		int item= sc.nextInt();
		System.out.print(lastIndex(arr, item, n-1));
    }
	public static int lastIndex(int arr[],  int item, int i)
	{
		if(i<0)
			return -1;
		if(arr[i] == item)
			return i;
		return lastIndex(arr, item, i-1);
	}
}
