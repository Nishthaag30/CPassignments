package _4_3553_recursion;

import java.util.*;

public class DictionaryOrderSmaller {
	public static void main(String args[]) {
        // Your Code Here
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		ArrayList<String> li = new ArrayList<>();
		allpermutation(s,"", li, s);
		Collections.sort(li);
		for(String st : li)
			System.out.println(st);
    }
	public static void allpermutation(String ques, String ans, List<String> li, String s)
	{
		if(ques.length()==0)
		{
			if(s.compareTo(ans) > 0)
				li.add(ans);
			return;
		}
		for(int i = 0; i<ques.length() ; i++)
		{
			char ch= ques.charAt(i);
			String ros= ques.substring(0,i)+ ques.substring(i+1);
			allpermutation(ros, ans+ch, li, s);
		}
	}
}
