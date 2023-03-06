package _3_3539_String;

import java.util.Scanner;

public class StringCompression {
	public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        StringBuilder s = new StringBuilder();
        for(int i=0;i <str.length() ; )
        {
            char c = str.charAt(i);
            int j,cnt = 0;
            for(j=i; j<str.length(); j++)
                if(c== str.charAt(j))
                    cnt++;
                else break;
            s.append(c);
            s.append(cnt);
            i=j;
        } 
        System.out.print(s.toString());
    }
	
	//Alternate
	public static void StringCompression(String str) {
		char prev = str.charAt(0);
		int count = 1;
		String ans ="";
		for (int i = 1; i < str.length(); i++) {
			char curr = str.charAt(i);
			if (prev == curr) {
				count++;
			} else {
				ans = ans + prev + count;
				prev=curr;
				count = 1;
			}

		}
		
		ans = ans + str.charAt(str.length()-1)+count;
		System.out.println(ans);

	}
}
