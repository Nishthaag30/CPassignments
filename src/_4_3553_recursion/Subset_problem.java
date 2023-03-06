package _4_3553_recursion;

import java.util.*;

public class Subset_problem {
	public static void main(String args[]) {
        // Your Code Here
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i =0; i<n; i++)
			arr[i] = sc.nextInt();
		int x= sc.nextInt();
		List<Integer> li = new ArrayList<>();
		int count = subset(arr, 0, x, li, 0);
		System.out.println();
		System.out.print(count);
    }
	public static int subset(int arr[], int i, int x, List<Integer> li, int c)
	{
		if(x==0)
		{
			for(int j : li)
				System.out.print(j+" ");
			System.out.print(" ");
			return c+1;
		}
		for(; i<arr.length; i++)
		{
			if(x>=arr[i])
			{
				li.add(arr[i]);
				c= subset(arr, i+1, x-arr[i], li, c);
				li.remove(li.size()-1);
			}
		}
		return c;
	}
}


//
//public static void main(String[] args) {
//	// TODO Auto-generated method stub
//	Scanner sc = new Scanner(System.in);
//	int n = sc.nextInt();
//	int[] arr = new int[n];
//	for (int i = 0; i < arr.length; i++) {
//		arr[i] = sc.nextInt();
//	}
//	int taerget = sc.nextInt();
//	System.out.println("\n"+printSubSet(arr, 0, "", 0, taerget));
//
//}
//
//public static int printSubSet(int[] arr, int i, String ans, int sum, int target) {
//	if (i == arr.length) {
//		if (sum == target) {
//			System.out.print(ans);
//			return 1;
//			
//		}
//		return 0;
//	}
//
//int fs=	printSubSet(arr, i + 1, ans + arr[i] + " ", sum + arr[i], target);// element add
//
//int ss=	printSubSet(arr, i + 1, ans, sum, target);// no element added
//	return fs+ss;
//}
