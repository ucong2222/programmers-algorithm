class Solution {
	public int solution(int n) {

		int answer = 0;

		int[] num = new int[n + 1];

		// num 배열에 2부터 n까지 숫자 넣기
		for (int i = 2; i <= n; i++) {
			num[i] = i;
		}

		// 2부터 n의 제곱근까지 돌리기 -> 효율성을 위해
		for (int i = 2; i <= Math.sqrt(n); i++) {

			// 에라토스테네스의 체 방법 사용!
			// num[i] 가 0이 아니면 자신말고 자신의 배수 0값으로 초기화 시키기
			if (num[i] != 0) {
				for (int j = i; j * i <= n; j++) {
					num[j * i] = 0;
				}
			}
		}

		// num[i]가 0이 아닌값인 소수를 찾음과 동시에 갯수를 셈으로써 결과 도출
		for (int i = 2; i <= n; i++) {
			if (num[i] != 0) {
				answer++;
			}
		}

		return answer;

	}
}
