package _4_3553_recursion;

import java.util.Scanner;

public class GenerateBinaryStrings {
	public static void main (String args[]) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-- >0){
			String s=sc.next();
			ToBinaryString(s,"");
			System.out.println();
		}
    }
	public static void ToBinaryString(String s1,String ans){
		if(s1.length()==0)
		{
			System.out.print(ans+" ");
			return;
		}
		char ch=s1.charAt(0);
		if(ch == '?'){
			ToBinaryString(s1.substring(1),ans+"0");
			ToBinaryString(s1.substring(1),ans+"1");
		}
		else
			ToBinaryString(s1.substring(1),ans+ch);
	}
}
