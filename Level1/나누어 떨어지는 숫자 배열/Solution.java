import java.util.*;

// array 사용
class Solution {
	public int[] solution(int[] arr, int divisor) {
		int[] answer = { -1 };
		int cnt = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % divisor == 0) {
				cnt++;
			}
		}

		if (cnt == 0) {
			return answer;
		} else if (cnt > 0) {
			answer = new int[cnt];
			cnt = 0;
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] % divisor == 0) {
					answer[cnt++] = arr[i];
				}
			}
		}

		Arrays.sort(answer);

		return answer;
	}
}

// list 사용
class Solution {
	public int[] solution(int[] arr, int divisor) {
		List<Integer> list = new ArrayList<>();

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % divisor == 0) {
				list.add(arr[i]);
			}
		}

		if (list.size() == 0)
			return new int[] { -1 };

		int[] answer = new int[list.size()];

		Collections.sort(list);

		for (int i = 0; i < list.size(); i++) {
			answer[i] = list.get(i);
		}

		return answer;
	}
}