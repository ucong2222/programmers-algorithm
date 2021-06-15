// toCharArray()와 valueOf()을 이용한 방법
class Solution {
	public String solution(String phone_number) {
		char[] ch = phone_number.toCharArray();

		for (int i = 0; i < ch.length - 4; i++) {
			ch[i] = '*';
		}

		return String.valueOf(ch);
	}
}

// subString을 이용한 방법
class Solution {
	public String solution(String phone_number) {
		String answer = "";

		for (int i = 0; i < phone_number.length() - 4; i++) {
			answer += "*";
		}

		answer += phone_number.substring(phone_number.length() - 4);

		return answer;
	}
}
