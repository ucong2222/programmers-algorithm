import java.util.*;

class Solution {
	public String solution(String new_id) {

		// 1단계
		new_id = new_id.toLowerCase();

		StringBuilder sb = new StringBuilder();

		// 2단계
		for (int i = 0; i < new_id.length(); i++) {
			if ((new_id.charAt(i) >= 'a' && new_id.charAt(i) <= 'z')
					|| (new_id.charAt(i) >= '0' && new_id.charAt(i) <= '9') || new_id.charAt(i) == '_'
					|| new_id.charAt(i) == '-' || new_id.charAt(i) == '.') {
				sb.append(new_id.charAt(i));
			}
		}

		// 3단계
		for (int i = 0; i < sb.length() - 1; i++) {
			if (sb.charAt(i) == ('.') && sb.charAt(i) == sb.charAt(i + 1)) {
				sb.deleteCharAt(i);
				i--;
			}

		}

		// 4단계
		if (sb.length() > 0 && sb.charAt(0) == '.') {
			sb.deleteCharAt(0);
		}

		if (sb.length() > 0 && sb.charAt(sb.length() - 1) == '.') {
			sb.deleteCharAt(sb.length() - 1);
		}

		// 5단계
		if (sb.length() == 0) {
			sb.append("a");
		}

		// 6단계
		if (sb.length() > 15) {
			sb.delete(15, sb.length());
		}

		if (sb.charAt(sb.length() - 1) == '.') {
			sb.deleteCharAt(sb.length() - 1);
		}

		// 7단계
		while (sb.length() < 3) {
			sb.append(sb.charAt(sb.length() - 1));
		}

		return sb.toString();

	}
}

// 정규표현식 사용

class Solution {
	public String solution(String new_id) {

		// 1단계
		new_id = new_id.toLowerCase();

		// 2단계
		// [] : 안의 패턴을 포함하는 것
		// [^ ] : 안의 패턴을 포함하지 않는 것
		new_id = new_id.replaceAll("[^a-z0-9-_.]", "");

		// 3단계
		// []{n,m} : 안의 패턴이 n개 이상 m개 이하인 것 , m 생략시 n개 이상
		new_id = new_id.replaceAll("[.]{2,}", ".");

		// 4단계
		// A|B : A 또는 B
		// ^[] : 안의 패턴으로 시작하는 것
		// []$ : 안의 패턴으로 끝나는 것
		new_id = new_id.replaceAll("^[.]|[.]$", "");

		// 5단계
		if (new_id.length() == 0) {
			new_id += "a";
		}

		// 6단계
		if (new_id.length() > 15) {
			new_id = new_id.substring(0, 15);

			new_id = new_id.replaceAll("[.]$", "");
		}

		// 7단계
		while (new_id.length() < 3) {
			new_id += new_id.charAt(new_id.length() - 1);
		}

		return new_id;
	}
}