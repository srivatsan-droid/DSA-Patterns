import java.util.*;
public class groupAnagrams {
	public static List<List<String>> groupAnagrams(String[] strs) {
		HashMap<String,List<String>> map = new HashMap<>();
		for(int i = 0;i < strs.length;i++) {
			char c[] = strs[i].toCharArray();
			Arrays.sort(c);
			String key = new String(c);
			map.computeIfAbsent(key,k -> new ArrayList<>()).add(strs[i]);
		}
		return new ArrayList<>(map.values());
	}
	public static void main(String[] args) {
		String strs[] = {"eat","tea","tan","ate","nat","bat"};
		List<List<String>> ans = groupAnagrams(strs);
		for(int i = 0;i < ans.size();i++) {
			System.out.println(ans.get(i));
		}
	}
}