# 프로그래머스 코딩 테스트 연습 
## LEVEL 1.두 정수 사이의 합
https://programmers.co.kr/learn/courses/30/lessons/12912

#### 문제
- 두 정수 a, b가 주어졌을 때 a와 b 사이에 속한 모든 정수의 합을 리턴하는 함수, solution을 완성하세요.
- 예를들어 a=3, b=5인 경우, 3+4+5=12 이므로 12를 리턴합니다.

#### 제한 조건
- a와 b가 같은 경우는 둘 중 아무 수나 리턴하세요.
- a와 b는 -10,000,000 이상 10,000,000 이하인 정수입니다.
- a와 b의 대소관계는 정해져있지 않습니다.

#### 예시
##### 입력 및 출력
|a|b|return|
|----|----|----|
|3|5|12|
|3|3|3|
|5|3|12|


<span>*집고 넘어 갑시다!*</span></br>

##### 등차수열의 합 공식
- 등차수열의 합 공식을 이용해 결과 만들기!
```
(b-a+1)*(a+b)/2;
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
