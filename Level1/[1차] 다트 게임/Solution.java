class Solution {
	public int solution(String dartResult) {
		char[] ch = dartResult.toCharArray();

		int[] sum = new int[3];

		int cnt = 0;

		for (int i = 0; i < ch.length; i++) {
			int a = 0;
			if (ch[i] >= '0' && ch[i] <= '9') {
				if (ch[i] == '1' && ch[i + 1] == '0') {
					a = 10;
					i++;
				} else {
					a = ch[i] - 48;
				}

				if ((i + 2 >= ch.length) || (ch[i + 2] != '*' && ch[i + 2] != '#')) {
					if (ch[i + 1] == 'S') {
						sum[cnt] += a;
					} else if (ch[i + 1] == 'D') {
						sum[cnt] += a * a;
					} else if (ch[i + 1] == 'T') {
						sum[cnt] += a * a * a;
					}
					i++;
				} else if (ch[i + 2] == '*') {
					if (cnt - 1 >= 0) {
						sum[cnt - 1] = sum[cnt - 1] * 2;
					}
					if (ch[i + 1] == 'S') {
						sum[cnt] = a * 2;
					} else if (ch[i + 1] == 'D') {
						sum[cnt] = a * a * 2;
					} else if (ch[i + 1] == 'T') {
						sum[cnt] = a * a * a * 2;
					}
					i = i + 2;
				} else if (ch[i + 2] == '#') {
					if (ch[i + 1] == 'S') {
						sum[cnt] = a * (-1);
					} else if (ch[i + 1] == 'D') {
						sum[cnt] = a * a * (-1);
					} else if (ch[i + 1] == 'T') {
						sum[cnt] = a * a * a * (-1);
					}
					i = i + 2;
				}
				cnt++;
			}
		}

		return sum[0] + sum[1] + sum[2];
	}
}