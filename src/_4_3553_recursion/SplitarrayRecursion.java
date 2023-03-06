package _4_3553_recursion;

import java.util.Scanner;

public class SplitarrayRecursion {
	static int count=0;
    public static void main(String args[]) {
        // Your Code Here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		recurr(arr,0,0,0,"","");
		System.out.println(count);
		
    }
	public static void recurr(int arr[],int i,int sum,int sum2,String ans,String ans2)
	{
		if(i==arr.length){
			if(sum==sum2)
			{
				System.out.println(ans+"and "+ans2);
				count++;
			}
			return;
		}
		recurr(arr,i+1,sum+arr[i],sum2,ans+arr[i]+" ",ans2);
		recurr(arr,i+1,sum,sum2+arr[i],ans,ans2+arr[i]+" ");
	}
}
