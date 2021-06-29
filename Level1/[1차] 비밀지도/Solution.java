// 내 풀이방법
class Solution {
	public String[] solution(int n, int[] arr1, int[] arr2) {
		String[] answer = new String[n];

		for (int i = 0; i < n; i++) {
			answer[i] = "";
			for (int j = n - 1; j >= 0; j--) {
				if (arr1[i] % 2 + arr2[i] % 2 == 0) {
					answer[i] = " " + answer[i];
				} else {
					answer[i] = "#" + answer[i];
				}

				arr1[i] = arr1[i] / 2;
				arr2[i] = arr2[i] / 2;
			}

		}

		return answer;
	}
}