package _3_3539;

import java.util.*;

public class NonrepeatingCharacters {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int t= sc.nextInt();
		while(t-- > 0)
		{
			String s = sc.next();
			HashSet<Character> map = new HashSet<Character>();
			int i=0;
			while(i < s.length())
			{
				char ch = s.charAt(i);
				if(!map.contains(ch))
				{
					map.add(ch);
					int f=0;
					for(int j=i+1;j <s.length(); j++)
						if(ch== s.charAt(j))
						{
							f=1;
							break;
						}
					if(f==0){
						System.out.println(ch);	
						break;
					}
				} 
				i++;
			}
			if(i==s.length())
				System.out.println("-1");
		}
    }
	private static int Non_Repeating(String str) {
		// TODO Auto-generated method stub

		int si = 0;
		int ei = 0;
		int ans = 0;
		int frq[] = new int[256];

		while (ei < str.length()) {
			// window grow
			char ch = str.charAt(ei);
			frq[ch] = frq[ch] + 1;

			// window shrink
			while (frq[ch] > 1) {

				char c = str.charAt(si);
				frq[c] = frq[c] - 1;
				si++;
			}

			// ans calculate
			ans = Math.max(ans, ei - si + 1);

			ei++;

		}
		return ans;

	}
}
