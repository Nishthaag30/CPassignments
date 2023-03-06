package _4_3553_recursion;

import java.util.Scanner;

public class Replaceallπ {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int t= sc.nextInt();
		while(t-- > 0)
		{
			String s = sc.next();
			System.out.println(replacepi(s,0));
		}
    }
	public static String replacepi(String s, int i)
	{
		while(i<s.length() -1 && (s.charAt(i)!= 'p' || s.charAt(i+1)!= 'i' ))
			i++;
		if(i >= s.length()-1)
			return s;
		return replacepi(s.substring(0, i)+"3.14"+s.substring(i+2), i+4);

	}
}



//public static void main(String[] args) {
//	// TODO Auto-generated method stub
//	Scanner sc = new Scanner(System.in);
//	int t = sc.nextInt();
//	while (t-- > 0) {
//
//		String str = sc.next();
//		String ans = "";
//		ans = ans + str.charAt(0);
//		Replace_allPi(str.substring(1), ans);
//	}
//
//}
//
//public static void Replace_allPi(String ques, String ans) {
//	if (ques.length() == 0) {
//		System.out.println(ans);
//		return;
//	}
//
//	if (ans.charAt(ans.length() - 1) == ques.charAt(0)) {
//
//		Replace_allPi(ques.substring(1), ans.substring(0, ans.length()) + "3.14");
//
//	} else {
//		Replace_allPi(ques.substring(1), ans + ques.charAt(0));
//	}
//
//}