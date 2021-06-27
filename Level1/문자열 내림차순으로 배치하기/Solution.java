import java.util.*;

class Solution {
	public String solution(String s) {
		char[] ch = s.toCharArray();

		for (int i = 0; i < s.length(); i++) {
			for (int j = 0; j < s.length() - 1; j++) {
				if (ch[j] < ch[j + 1]) {
					char tmp = ch[j];
					ch[j] = ch[j + 1];
					ch[j + 1] = tmp;
				}
			}
		}

		return String.valueOf(ch);
	}
}

// StringBuilder 사용해 풀기 v1
class Solution {
	public String solution(String s) {
		char[] ch = s.toCharArray();
		StringBuilder sb = new StringBuilder();

		Arrays.sort(ch);

		for (int i = 0; i < s.length(); i++) {
			sb.append(ch[i]);
		}

		return sb.reverse().toString();
	}

}

//StringBuilder 사용해 풀기 v2
class Solution {
	public String solution(String s) {
		char[] ch = s.toCharArray();

		Arrays.sort(ch);

		return new StringBuilder(new String(ch)).reverse().toString();
	}
}