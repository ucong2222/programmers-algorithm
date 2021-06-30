class Solution {
	public String solution(int a, int b) {
		int[] m = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		String[] s = { "THU", "FRI", "SAT", "SUN", "MON", "TUE", "WED" };
		int num = 0;

		if (a > 1) {
			for (int i = 0; i < a - 1; i++) {
				num += m[i];
			}
		}

		num += b;

		return s[num % 7];
	}
}