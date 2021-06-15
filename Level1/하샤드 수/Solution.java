// 형 변환 없이 푸는 방법
class Solution {
	public boolean solution(int x) {
		boolean answer = true;
		int sum = 0;
		int tmpNum = x;

		while (tmpNum > 0) {
			sum += tmpNum % 10;
			tmpNum = tmpNum / 10;
		}

		if (x % sum != 0) {
			answer = false;
		}

		return answer;
	}
}

// char로 변환 후 푸는 방법
class Solution {
	public boolean solution(int x) {
		int sum = 0;
		char[] ch = String.valueOf(x).toCharArray();

		for (char c : ch) {
			sum += (int) c - 48;
		}

		return x % sum == 0;
	}
}

// String으로 변환 후 푸는 방법
class Solution {
	public boolean solution(int x) {
		int sum = 0;
		String[] str = String.valueOf(x).split("");

		for (String num : str) {
			sum += Integer.parseInt(num);
		}
		return x % sum == 0;
	}
}