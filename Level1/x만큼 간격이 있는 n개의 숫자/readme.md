# 프로그래머스 코딩 테스트 연습 
## LEVEL 1.x만큼 간격이 있는 n개의 숫자
https://programmers.co.kr/learn/courses/30/lessons/12954


#### 문제
- 함수 solution은 정수 x와 자연수 n을 입력 받아, x부터 시작해 x씩 증가하는 숫자를 n개 지니는 리스트를 리턴해야 합니다.
- 다음 제한 조건을 보고, 조건을 만족하는 함수, solution을 완성해주세요.

#### 제한 조건
- x는 -100000000 이상, 100000000 이하인 정수입니다.
- n은 1000 이하인 자연수 입니다.

#### 예시
##### 입력 및 출력
|x|n|answer|
|----|----|----|
|2|5|[2,4,6,8,10]|
|4|3|[4,8,12]|
|-4|2|[-4,-8]|

<span>*집고 넘어 갑시다!*</span></br>

- x와 n을 곱했을 때 int 범위를 넘어서는 경우가 있다. int 범위를 넘는 값은 answer 배열에 제대로 담을 수 없으므로 x를 long으로 형변환하거나 answer 배열에 넣는 값을 long으로 형변환하여 저장!
   - ex ) x=10000000, n=1000
   
   
<style type="text/css">
span{
	color:red;
	font-weight:bold;
}

table, td, th {
        border:0.5px solid black;
}
</style>
