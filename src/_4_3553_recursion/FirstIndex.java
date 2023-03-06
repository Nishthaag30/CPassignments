package _4_3553_recursion;

import java.util.Scanner;

public class FirstIndex {
	public static void main(String args[]) {
        // Your Code Here
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[]= new int[n];
		for(int i =0; i<n; i++)
			arr[i] = sc.nextInt();
		int item= sc.nextInt();
		System.out.print(firstIndex(arr, 0 , item));
    }
	public static int firstIndex(int arr[], int i, int item)
	{
		if(i==arr.length)
			return -1;
		if(arr[i] == item)
			return i;
		return firstIndex(arr, i+1, item);
	}
}
