import java.util.*;

class Solution {
	public int[] solution(int[] numbers) {
		List<Integer> num = new ArrayList<>();

		for (int i = 0; i < numbers.length; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
				if (!num.contains(numbers[i] + numbers[j])) {
					num.add(numbers[i] + numbers[j]);
				}
			}
		}

		Collections.sort(num);

		int[] answer = new int[num.size()];
		for (int i = 0; i < num.size(); i++) {
			answer[i] = num.get(i);
		}

		return answer;

	}
}