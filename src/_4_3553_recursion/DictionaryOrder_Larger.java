package _4_3553_recursion;

import java.util.*;

public class DictionaryOrder_Larger {
	public static void main(String args[]) {
        // Your Code Here
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int freq[] = new int[26];
		for(int i=0; i< s.length() ;i++)
			freq[s.charAt(i)- 'a']++;
		List<String> li= new ArrayList<>();
		allpermutation(freq, "", li, s);
		int c=0;
		for(String ss : li)
		{
			if(ss.equals(s))
				break;
			c++;
		}
		for(c=c+1 ; c<li.size() ;c++)
			System.out.println(li.get(c));
    }
	public static void allpermutation(int freq[], String ans, List<String> li, String s)
	{
		if(ans.length() == s.length())
			li.add(ans);
		for(int i =0; i<26;i++)
		{
			if(freq[i] >=1)
			{
				char ch = (char) (i+'a');
				freq[i]--;
				allpermutation(freq, ans+ch, li, s);
				freq[i]++;
			}
		}
	}
	
}


//public static void main(String[] args) {
//	// TODO Auto-generated method stub
//	Scanner sc = new Scanner(System.in);
//	String str = sc.next();
//	ArrayList<String> list = new ArrayList<>();
//	printPermutation(str, "",str,list);
//	Collections.sort(list);
//	for (int i = 0; i < list.size(); i++) {
//		System.out.println(list.get(i));
//	}
//
//}
//
//public static void printPermutation(String ques, String ans, String org, ArrayList<String> list) {
//	if (ques.length() == 0) {
//		if (ans.compareTo(org) > 0) {
//			// System.out.println(ans);
//			list.add(ans);
//		}
//		return;
//	}
//
//	for (int i = 0; i < ques.length(); i++) {
//
//		char ch = ques.charAt(i);
//
//		String ros = ques.substring(0, i) + ques.substring(i + 1);
//
//		printPermutation(ros, ans + ch, org, list);
//
//	}
//}
