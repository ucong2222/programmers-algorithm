import java.util.*;

class Solution {
	public String solution(String s) {
		String answer = "";

		String[] st = s.split("");
		int cnt = 0;

		for (int i = 0; i < st.length; i++) {
			if (st[i].equals(" ")) {
				cnt = 0;
			} else {
				if (cnt % 2 == 0) {
					st[i] = st[i].toUpperCase();
					cnt++;
				} else {
					st[i] = st[i].toLowerCase();
					cnt++;
				}
			}
			answer += st[i];

		}

		return answer;
	}
}

// 삼항연산자 사용한 방법
class Solution {
	public String solution(String s) {
		String answer = "";
		int cnt = 0;
		String[] array = s.split("");

		for (String st : array) {
			cnt = st.contains(" ") ? 0 : cnt + 1;
			answer += cnt % 2 == 0 ? st.toLowerCase() : st.toUpperCase();
		}

		return answer;
	}
}