// answer 배열에 넣는 값을 long으로 형변환
class Solution {
	public long[] solution(int x, int n) {
		long[] answer = new long[n];

		for (int i = 0; i < n; i++) {
			answer[i] = (long) x * (i + 1);
		}
		return answer;
	}
}

// x의 자료형을 int에서 long으로 형변환
class Solution {
	public long[] solution(long x, int n) {
		long[] answer = new long[n];

		for (int i = 0; i < n; i++) {
			answer[i] = x * (i + 1);
		}
		return answer;
	}
}

 
