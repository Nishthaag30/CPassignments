package _3_3539;

import java.util.Scanner;

public class FindingCBNumbers {
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int num=sc.nextInt();
	String str =sc.next();
		PrintSubstring(str);

	}
	
		public static boolean isvisited(boolean[] visited, int i, int j){
		for (int k = i; k <= j; k++) {
			if (visited[k] == true) {
				return false;
			}
		}
		return true;
	}

	public static void PrintSubstring(String str) {
		int count = 0;
		boolean visited[] = new boolean[str.length()];
		for (int len = 1; len <= str.length(); len++) {
			for (int j = len; j <= str.length(); j++) {
				int z = j - len;
				String s = str.substring(z, j);
				if (isCbNumber(Long.parseLong(s)) == true && isvisited(visited, z, j - 1) == true) {
					count++;
					for (int k = z; k <= j - 1; k++) {
						visited[k] = true;

					}
				}
		}

	}
	System.out.println(count);

	}


	public static boolean isCbNumber(long num) 
	
	{
		int arr[] = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29 };
		if (num == 0 || num == 1) 
			return false;
		
		for (int i = 0; i < arr.length; i++) {
			if (num == arr[i]) {
				return true;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if (num % arr[i] == 0) 
			
				return false;
			
		}
		return true;

	}
}
