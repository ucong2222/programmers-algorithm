import java.util.*;

class Solution {
	public int solution(int[][] board, int[] moves) {
		List<Integer> list = new ArrayList<>();
		int cnt = 0;

		for (int i = 0; i < moves.length; i++) {
			// 크레인 작동시킨 위치
			int num = moves[i];

			// 작동시킨 위치에 인형이 있나 확인
			for (int j = 0; j < board[0].length; j++) {
				
				// 만약 작동시킨 위치에 인형이 있다면 실행
				if (board[j][num - 1] != 0) {

					// list가 비어있지 않고 list 최근에 넣은 인형과 작동시킨 위치의 인형이 같다면 실행
					// list 최근에 넣은 인형을 없앤다.
					// list 최근에 넣은 인형과 작동시킨 위치의 인형을 뺏으므로 카운터 2개 더해준다.
					if (!list.isEmpty() && (list.get(list.size() - 1) == board[j][num - 1])) { 
						list.remove(list.size() - 1);
						cnt += 2;
					} 
					// list가 비어있거나 list 최근에 넣은 인형과 작동시킨 위치의 인형이 같지 않다면 실행
					// list에 작동시킨 위치에 있는 인형을 추가
					else {
						list.add(board[j][num - 1]);
					}

					// 작동시킨 위치에 있던 인형을 가져왔으므로 비워준다.
					board[j][num - 1] = 0;
					// 한번의 작동에 하나의 인형만 가져올수 있으므로 break 으로 for문 빠져나가기.
					break;
				}
			}
		}

		return cnt;
	}
}