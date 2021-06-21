import java.util.*;

class Solution {
	public int[] solution(long n) {
		String m = n + "";
		int[] answer = new int[m.length()];
		int cnt = 0;

		while (n != 0) {
			answer[cnt] = (int) (n % 10);
			n = n / 10;
			cnt++;
		}

		return answer;
	}
}

class Solution {
	public int[] solution(long n) {
		List<Integer> num = new ArrayList<>();

		while (n != 0) {
			num.add((int) (n % 10));

			n /= 10;
		}

		int[] answer = new int[num.size()];

		for (int i = 0; i < answer.length; i++) {
			answer[i] = num.get(i);
		}

		return answer;
	}
}