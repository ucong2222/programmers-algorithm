import java.util.*;

//오직 배열만 사용해서 푼 경우
import java.util.*;

class Solution {
	public int[] solution(int[] arr) {

		if (arr.length == 1)
			return new int[] { -1 };

		int minIdx = 0;
		int minCnt = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[minIdx] == arr[i]) {
				minCnt++;
			}

			if (arr[minIdx] > arr[i]) {
				minIdx = i;
			}
		}

		int[] answer = new int[arr.length - minCnt];

		for (int i = minIdx + 1; i < arr.length; i++) {
			arr[i - 1] = arr[i];

		}

		for (int i = 0; i < answer.length; i++) {
			answer[i] = arr[i];
		}

		return answer;
	}
}

// 리스트로 변형해 푼 경우
class Solution {
	public int[] solution(int[] arr) {
		if (arr.length == 1)
			return new int[] { -1 };
		List<Integer> list = new ArrayList<>();
		int min = arr[0];

		for (int i = 0; i < arr.length; i++) {
			list.add(arr[i]);

			if (min > arr[i]) {
				min = arr[i];
			}
		}

		while (list.contains(min)) {

			int idx = list.indexOf(min);
			list.remove(idx);

		}
		int[] answer = new int[list.size()];
		for (int i = 0; i < list.size(); i++) {
			answer[i] = list.get(i);
		}

		return answer;

	}
}
