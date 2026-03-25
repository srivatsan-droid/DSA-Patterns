public class permutationOfString {
	public static boolean isPermutation(String s1,String s2){
		int count[] = new int[26];
		if(s1.length() > s2.length())
			return false;
		int k = s1.length();
		for(int i = 0;i < k;i++) {
			count[s1.charAt(i) - 'a']++;
			count[s2.charAt(i) - 'a']--;
		}
		if(getCount(count))
			return true;
		for(int i = k;i < s2.length();i++) {
			count[s2.charAt(i) - 'a']--;
			count[s2.charAt(i - k) - 'a']++;
			if(getCount(count)) 
				return true;
		} 
		return false;
	}
	public static boolean getCount(int count[]) {
		for(int num : count) {
			if(num != 0)
				return false;
		}
		return true;
	}
	public static void main(String[] args) {
		String s1 = "ba";
		String s2 = "eidbaooo";
		boolean ans = isPermutation(s1,s2);
		System.out.println(ans);
	}
}