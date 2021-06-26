class Solution {
	public String solution(String[] seoul) {
		String answer = "";

		for (int i = 0; i < seoul.length; i++) {
			if (seoul[i].equals("Kim")) {
				answer = "김서방은 " + i + "에 있다";
			}
		}

		return answer;
	}
}

// String.format() 메소드 사용해 출력하기
class Solution {
	public String solution(String[] seoul) {
		int idx = 0;

		for (int i = 0; i < seoul.length; i++) {
			if (seoul[i].equals("Kim")) {
				idx = i;
			}
		}

		return String.format("김서방은 %d에 있다", idx);

	}
}