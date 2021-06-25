class Solution {
	public int solution(int n) {
		int answer = 0;

		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				answer += i;
			}
		}

		return answer;
	}
}


// 최대공약수의 합이 아닌 모든 약수의 합이기 때문에 절반까지만 구하는 것이 효율적이라고한다.
class Solution {
	public int solution(int n) {
		int answer = 0;
		
		for (int i = 1; i <= n / 2; i++) {
			if (n % i == 0)
				answer += i;
		}
		
		return answer + n;

	}
}