
class Solution {
	public int[] solution(int n, int m) {
		int[] answer = new int[2];
		int tmp = 0;

		if (n < m) {
			tmp = n;
			n = m;
			m = tmp;
		}

		if (n % m == 0) {
			answer[0] = m;
			answer[1] = n;
		} else {
			for (int i = 1; i <= n; i++) {
				if (n % i == 0 && m % i == 0) {
					answer[0] = i;
					answer[1] = (n * m) / i;
				}
			}
		}

		return answer;
	}
}

// 유클리드 호제법 사용
class Solution {
	public int[] solution(int n, int m) {
		int[] answer = new int[2];
		int gcd = n * m;

		while (n != 0) {
			int tmp = m % n;
			m = n;
			n = tmp;
		}

		answer[0] = m;
		answer[1] = gcd / m;
		return answer;
	}
}