// 내가 처음 풀었던 방법 -> 시간이 오래걸린다 ㅠㅠ
class Solution {
	public int[] solution(int N, int[] stages) {
		int user = stages.length;
		float cnt = 0;
		float tmp1 = 0;
		int tmp2 = 0;

		float[] answer = new float[N];
		int[] result = new int[N];

		for (int i = 1; i <= N; i++) {
			cnt = 0;

			for (int j = 0; j < stages.length; j++) {
				if (i == stages[j]) {
					cnt++;
				}
			}

			answer[i - 1] = cnt / user;
			user -= cnt;

			result[i - 1] = i;
		}

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N - 1; j++) {
				if (answer[j] < answer[j + 1]) {
					tmp1 = answer[j];
					answer[j] = answer[j + 1];
					answer[j + 1] = tmp1;

					tmp2 = result[j];
					result[j] = result[j + 1];
					result[j + 1] = tmp2;
				}
			}
		}

		return result;

	}
}

// 다시 풀어보았다! 이 방법이 훨 빠르다.
class Solution {
	public int[] solution(int N, int[] stages) {
		int[] answer = new int[N];
		double[] failure = new double[N];

		int userCnt = stages.length;
		int tmpI = 0;
		double tmpD = 0;

		// stage별 인원 체크
		for (int i = 0; i < stages.length; i++) {
			int stage = stages[i];

			if (stage != N + 1)
				answer[stage - 1]++;
		}

		// 실패율 구하기
		for (int i = 0; i < N; i++) {
			failure[i] = (double) answer[i] / userCnt;
			userCnt -= answer[i];

			answer[i] = i + 1;
		}

		// 내림차순으로 바꾸기
		for (int i = 1; i < N; i++) {
			for (int j = 0; j < N - i; j++) {
				if (failure[j] < failure[j + 1]) {
					tmpD = failure[j];
					failure[j] = failure[j + 1];
					failure[j + 1] = tmpD;

					tmpI = answer[j];
					answer[j] = answer[j + 1];
					answer[j + 1] = tmpI;
				}
			}
		}

		return answer;
	}
}