import java.util.*;

// 맵 이용하지 않고 풀기
class Solution {
	public String solution(String[] participant, String[] completion) {
		Arrays.sort(participant);
		Arrays.sort(completion);

		int i = 0;
		for (i = 0; i < completion.length; i++) {

			if (!participant[i].equals(completion[i])) {
				return participant[i];

			}
		}

		return participant[i];
	}
}

// 해시 이용해서 풀기
class Solution {
	public String solution(String[] participant, String[] completion) {
		Map<String, Integer> hs = new HashMap<>();
		String answer = "";

		for (String str : completion) {
			if (!hs.containsKey(str)) {
				hs.put(str, 1);
			} else {
				int value = hs.get(str);
				hs.replace(str, ++value);
			}
		}

		for (String str : participant) {
			if (hs.containsKey(str)) {
				int value = hs.get(str);
				hs.remove(str);

				if (value != 1) {
					hs.put(str, value - 1);
				}

			} else {
				answer = str;
				break;
			}
		}

		return answer;
	}
}

// Map의 getOrDefault 사용 , 다른사람풀이
class Solution {
	public String solution(String[] participant, String[] completion) {
		String answer = "";
		HashMap<String, Integer> map = new HashMap<>();

		for (String str : participant)
			map.put(str, map.getOrDefault(str, 0) + 1);

		for (String str : completion)
			map.put(str, map.get(str) - 1);

		for (String key : map.keySet()) {
			if (map.get(key) != 0) {
				answer = key;
				break;
			}
		}
		return answer;
	}
}
