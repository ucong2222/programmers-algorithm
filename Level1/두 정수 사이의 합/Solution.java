
class Solution {
	public long solution(int a, int b) {
		long answer = 0;
		if (a > b == false) {
			int tmp = a;
			a = b;
			b = tmp;
		}

		for (int i = b; i <= a; i++) {
			answer += i;
		}

		return answer;
	}
}

class Solution {
	public long solution(int a, int b) {
		long answer = 0;
		for (int i = (a > b ? b : a); i <= (a > b ? a : b); i++) {
			answer += i;
		}

		return answer;
	}
}

// 등차수열의 합 공식 사용 -> 위의 코드보다 실행시간이 아주아주 빠르다!!!!!!!!!!!!!!!!!!!!!!
class Solution {
	public long solution(int a, int b) {
		int d = b - a < 0 ? a - b : b - a;

		return (long) (d + 1) * (a + b) / 2;
	}
}