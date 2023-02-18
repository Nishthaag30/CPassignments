package _3_3539;

import java.util.*;

public class MinimumWindowSizeSubstring {
	public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        Map<Character,Integer> map1 = new HashMap<>();
        for(int i = 0; i < t.length(); i++) 
            map1.put(t.charAt(i),map1.getOrDefault(t.charAt(i),0) + 1); 
        Map<Character,Integer> map2 = new HashMap<>();
        int lo = 0;
        int hi = 0;
        int t_lo = 0;
        int t_hi = 0;
        int ans = -1;
        int len = 0;
        while(hi < s.length()) {
            map2.put(s.charAt(hi),map2.getOrDefault(s.charAt(hi),0)+1);
            if(map1.containsKey(s.charAt(hi)) && map1.get(s.charAt(hi)) == map2.get(s.charAt(hi)))
            len += 1;
            while(lo <= hi && len == map1.size()) {
                char c = s.charAt(lo);
                if(ans == -1 || hi - lo + 1 < ans){
                    ans = hi - lo + 1;
                    t_lo = lo;
                    t_hi = hi;
                }
            map2.put(c,map2.get(c) - 1);
            if(map1.containsKey(c) && map2.get(c) < map1.get(c))
            len--;
            lo++;
            }
            hi++;
        }
        System.out.println(ans == -1 ? "":s.substring(t_lo,t_hi + 1));
    }
}
