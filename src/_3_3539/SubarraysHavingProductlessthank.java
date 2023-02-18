package _3_3539;

import java.util.Scanner;

public class SubarraysHavingProductlessthank {
	public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k= sc.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++)
            arr[i]= sc.nextInt();
        
        int i =0;
        int p=1;
        int cnt =0;
        int start=0;
        while(i<n)
        {
            p= p*arr[i];
            while(p>=k && start<=i)
            {
                p= p/arr[start++];
            }
            cnt += i - start +1;
            i++;
        }
        System.out.print(cnt);
    }
}
