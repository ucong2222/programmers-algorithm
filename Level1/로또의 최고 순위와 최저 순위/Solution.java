class Solution {
	public int[] solution(int[] lottos, int[] win_nums) {
		int[] answer = new int[2];
		int sameCnt = 0;
		int zeroCnt = 0;

		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				if (win_nums[i] == lottos[j]) {
					sameCnt++;
				}
			}
		}

		for (int i = 0; i < 6; i++) {
			if (lottos[i] == 0) {
				zeroCnt++;
			}
		}

		answer[0] = sameCnt + zeroCnt < 2 ? 6 : 7 - (sameCnt + zeroCnt);
		answer[1] = sameCnt < 2 ? 6 : 7 - sameCnt;

		return answer;
	}
}

// 다른 사람 풀이
// Map 이용
import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        Map<Integer, Boolean> map = new HashMap<Integer, Boolean>();
        int zeroCount = 0;

        for(int lotto : lottos) {
            if(lotto == 0) {
                zeroCount++;
                continue;
            }
            map.put(lotto, true);
        }


        int sameCount = 0;
        for(int winNum : win_nums) {
            if(map.containsKey(winNum)) sameCount++;
        }

        int maxRank = 7 - (sameCount + zeroCount);
        int minRank = 7 - sameCount;
        if(maxRank > 6) maxRank = 6;
        if(minRank > 6) minRank = 6;

        return new int[] {maxRank, minRank};
    }
}