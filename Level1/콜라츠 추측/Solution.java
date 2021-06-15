// while문 통한 방법
class Solution {
	public int solution(double num) {
		int count = 0;

		if (num == 1)
			return 0;
		while (count <= 500) {
			if (num % 2 == 0) {
				num /= 2;
			} else {
				num = num * 3 + 1;
			}

			count++;

			if (num == 1) {
				return count;
			}
		}

		return -1;
	}
}

// 삼항식을 통한 방법
class Solution {
	public int solution(double num) {
		int count = 0;

		if (num == 1)
			return 0;
		for (int i = 0; i < 500; i++) {
			num = num % 2 == 0 ? num / 2 : num * 3 + 1;
			count++;
			if (num == 1) {
				return count;
			}
		}
		return -1;
	}
}
