
class Solution {
	public String solution(String s, int n) {
		char[] ch = s.toCharArray();

		for (int i = 0; i < ch.length; i++) {

			if ('a' <= ch[i] && 'z' >= ch[i]) {
				if (ch[i] + n > 'z') {
					ch[i] = (char) (ch[i] + n - 26);
				} else {
					ch[i] = (char) (ch[i] + n);
				}

			} else if ('A' <= ch[i] && 'Z' >= ch[i]) {
				if (ch[i] + n > 'Z') {
					ch[i] = (char) (ch[i] + n - 26);
				} else {
					ch[i] = (char) (ch[i] + n);
				}
			} else {
				ch[i] = ch[i];
			}

		}

		return String.valueOf(ch);
	}
}