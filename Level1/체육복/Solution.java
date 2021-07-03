// 문제 해결 방법 v1
class Solution {
	public int solution(int n, int[] lost, int[] reserve) {
		int student = n - lost.length;

		// 도난당한 사람 중 여벌있는사람 구하기
		for (int i = 0; i < lost.length; i++) {
			for (int j = 0; j < reserve.length; j++) {
				if (lost[i] == reserve[j]) {
					reserve[j] = -1;
					lost[i] = -1;
					student++;
					break;
				}
			}
		}

		// 여벌있는사람이 도난당한사람한테 빌려줄수 있는지 구하기
		for (int i = 0; i < lost.length; i++) {
			for (int j = 0; j < reserve.length; j++) {
				if (lost[i] - 1 == reserve[j] || lost[i] + 1 == reserve[j]) {
					reserve[j] = -1;
					student++;
					break;
				}
			}
		}

		return student;
	}
}

//문제 해결 방법 v2

class Solution {
	public int solution(int n, int[] lost, int[] reserve) {
		int[] people = new int[n];
		int student = n;

		// 도난 당한 사람 -1
		for (int l : lost) {
			people[l - 1]--;
		}

		// 여벌 체육복 있는 사람 +1 , 만약 여벌 체육복있는데 도난 당한 사람은 0 값가짐
		for (int r : reserve) {
			people[r - 1]++;
		}

		for (int i = 0; i < n; i++) {
			// 도난사람일때 실행
			if (people[i] == -1) {
				// 도난당한 사람의 전번호인 사람이 체육복 여벌을 가지고 있을 때
				if (i > 0 && people[i - 1] == 1) {
					people[i]++;
					people[i - 1]--;
				}
				// 도난당한 사람의 뒷번호인 사람이 체육복 여벌을 가지고 있을 때
				else if (i + 1 < n && people[i + 1] == 1) {
					people[i]++;
					people[i + 1]--;
				} 
				// 도난당한 사람이 빌리지 못했을 경우
				else {
					student--;
				}
			}
		}

		return student;

	}
}