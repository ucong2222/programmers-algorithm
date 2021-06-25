import java.util.*;

// 타입변환 이용해 풀기
public class Solution {
	public int solution(int n) {
		String num = n + "";
		char[] ch = num.toCharArray();

		int answer = 0;

		for (int i = 0; i < num.length(); i++) {
			answer = answer + Integer.parseInt(Character.toString(ch[i]));
		}

		return answer;
	}
}

// 타입변환 없이 풀기
public class Solution {
	public int solution(int n) {
		int answer = 0;

		while (ture) {
			answer += n % 10;
			if (n < 10) {
				break;
			}

			n = n / 10;
		}

		return answer;
	}
}