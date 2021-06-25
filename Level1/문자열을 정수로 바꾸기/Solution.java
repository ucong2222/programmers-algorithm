class Solution {
	public int solution(String s) {
		int answer = Integer.parseInt(s);
		return answer;
	}
}

// 다른 방법으로 풀기
class Solution {
	public int solution(String s) {
		boolean sign = true;
		int result = 0;

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);

			if (ch == '-') {
				sign = false;
			} else if (ch != '+') {
				result = result * 10 + (ch - 48);
			}

		}
		return sign ? result : -1 * result;
	}
}