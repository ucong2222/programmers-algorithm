# 프로그래머스 코딩 테스트 연습 
## LEVEL 1.행렬의 덧셈
https://programmers.co.kr/learn/courses/30/lessons/12950

#### 문제
- 행렬의 덧셈은 행과 열의 크기가 같은 두 행렬의 같은 행, 같은 열의 값을 서로 더한 결과가 됩니다.
- 2개의 행렬 arr1과 arr2를 입력받아, 행렬 덧셈의 결과를 반환하는 함수, solution을 완성해주세요.

#### 제한 조건
- 행렬 arr1, arr2의 행과 열의 길이는 500을 넘지 않습니다.

#### 예시
##### 입력 및 출력
|arr1|arr2|return|
|----|----|----|
|[[1,2],[2,3]]|[[3,4],[5,6]]|[[4,6],[7,9]]|
|[[1],[2]]|[[3],[4]]|[[4],[6]]|

<span>*집고 넘어 갑시다!*</span></br>

- 다차원 배열 알고가기!
```java
class Main {
	public static void main(String[] args) {
		int[][] arr1 = {
			{1,2,3},
			{5,2,5},
			{5,2,2},
			{1,2,3},
			{1,2,3}
		}; // int[5][3]
		System.out.printf("열: %d", arr1.length); //5
		System.out.printf("행: %d", arr1(0).length); // 3
	}
}
```

   
<style type="text/css">
span{
	color:red;
	font-weight:bold;
}

table, td, th {
        border:0.5px solid black;
}
</style>
