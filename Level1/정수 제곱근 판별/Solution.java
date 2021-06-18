class Solution {
	public long solution(long n) {
		long answer = (long) Math.sqrt(n);

		return answer * answer == n ? (long) Math.pow(answer + 1, 2) : -1;
	}
}