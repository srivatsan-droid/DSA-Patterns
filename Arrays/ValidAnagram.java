import java.util.*;
public class ValidAnagram {
	public static boolean isAnagram(String s,String t) {
		int count[] = new int[26];
		if(s.length() != t.length()) {
			return false;
		}
		for(int i = 0;i < s.length();i++) {
			count[s.charAt(i) - 'a']++;
			count[t.charAt(i) - 'a']--;
		}
		for(int cnt : count) {
			if(cnt != 0) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = "rat";
		String t = "car";
		boolean ans = isAnagram(s,t);
		System.out.println(ans);
	}
}