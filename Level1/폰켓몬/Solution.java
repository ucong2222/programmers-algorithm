import java.util.*;

// 배열만 이용해서 풀기
class Solution {
	public int solution(int[] nums) {
		int cnt = 1;

		Arrays.sort(nums);

		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] != nums[i + 1]) {
				cnt++;
			}
		}

		return cnt <= nums.length / 2 ? cnt : nums.length / 2;

	}
}

// list 이용해서 풀기
class Solution {
	public int solution(int[] nums) {
		List<Integer> list = new ArrayList<>();

		for (int i = 0; i < nums.length; i++) {
			if (!list.contains(nums[i])) {
				list.add(nums[i]);
			}
		}

		return list.size() < nums.length / 2 ? list.size() : nums.length / 2;
	}
}

// HashSet 이용해서 풀기
class Solution {
	public int solution(int[] nums) {
		HashSet hs = new HashSet<>();

		for (int i = 0; i < nums.length; i++) {
			hs.add(nums[i]);
		}

		return hs.size() < nums.length / 2 ? hs.size() : nums.length / 2;
	}
}