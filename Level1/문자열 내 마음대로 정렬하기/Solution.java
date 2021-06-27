import java.util.*;

class Solution {
	public String[] solution(String[] strings, int n) {

		Arrays.sort(strings);

		for (int i = 0; i < strings.length; i++) {
			for (int j = 0; j < strings.length - 1; j++) {
				if (strings[j].charAt(n) > strings[j + 1].charAt(n)) {
					String str = strings[j];
					strings[j] = strings[j + 1];
					strings[j + 1] = str;
				}
			}
		}

		return strings;
	}
}

// compareTo 사용해 풀기
class Solution {
	public String[] solution(String[] strings, int n) {

		for (int i = 0; i < strings.length; i++) {
			for (int j = 0; j < strings.length - 1; j++) {
				if (strings[j].charAt(n) > strings[j + 1].charAt(n)) {
					String str = strings[j];
					strings[j] = strings[j + 1];
					strings[j + 1] = str;
				} else if (strings[j].charAt(n) == strings[j + 1].charAt(n)) {
					if (strings[j].compareTo(strings[j + 1]) > 0) {
						String str = strings[j];
						strings[j] = strings[j + 1];
						strings[j + 1] = str;
					}

				}
			}
		}

		return strings;
	}
}