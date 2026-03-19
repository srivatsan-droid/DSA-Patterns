import java.util.*;
public class encodeDecodeString {
	public static String encode(String s[]) {
		StringBuilder res = new StringBuilder();
		for(String strs : s){
			res.append(strs.length()).append("#").append(strs);
		} 
		return res.toString();
	}
	public static String[] decode(String s) {
		List<String> list = new ArrayList<>();
        int i = 0;

        while (i < s.length()) {
            int j = i;

            // find '#'
            while (s.charAt(j) != '#') {
                j++;
            }

            int len = Integer.parseInt(s.substring(i, j));

            j++; // move after '#'
            String word = s.substring(j, j + len);

            list.add(word);

            i = j + len; // move to next block
        }

        return list.toArray(new String[0]);
	}
	public static void main(String[] args) {
		String s[] = {"Hello","World"};
		String ans = encode(s);
		String result[] = decode(ans);
		System.out.println(ans);
		for(int i = 0;i < result.length;i++) {
			System.out.println(result[i] + " ");
		}
	}
}