import java.util.*;

// list 이용해 구하기
class Solution {
	public long solution(long n) {
		List<Integer> num = new ArrayList<>();

		while (n != 0) {
			num.add((int) (n % 10));

			n = n / 10;
		}

		Collections.sort(num);

		long answer = 0;

		for (int i = 0; i < num.size(); i++) {

			answer += num.get(i) * Math.pow(10, i);
		}

		return answer;
	}
}

// char배열로 변환 후 구하기
class Solution {
	public long solution(long n) {
		char[] num = Long.toString(n).toCharArray();

		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num.length; j++) {
				if (num[i] > num[j]) {
					char tmp = num[i];
					num[i] = num[j];
					num[j] = tmp;
				}
			}
		}

		return Long.parseLong(String.valueOf(num));
	}
}