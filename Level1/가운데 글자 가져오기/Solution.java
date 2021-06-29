// 배열로 나눠 결과 가져오기
class Solution {
	public String solution(String s) {
		String[] str = s.split("");
		int n = str.length / 2;

		if (str.length % 2 == 0) {

			return str[n - 1] + str[n];
		} else {

			return str[n];
		}
	}
}

// substring 사용해서 결과 가져오기
class Solution {
	public String solution(String s) {

		return s != null ? s.substring((s.length() - 1) / 2, s.length() / 2 + 1) : "";
	}
}