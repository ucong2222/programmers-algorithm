class Solution {
	public int solution(int n) {
		StringBuilder sb = new StringBuilder();
		int answer = 0;

		while (n > 0) {
			sb.append(n % 3);
			n = n / 3;
		}

		for (int i = 0; i < sb.length(); i++) {
			answer += Math.pow(3, i) * (sb.charAt(sb.length() - 1 - i) - 48);
		}

		return answer;
	}
}