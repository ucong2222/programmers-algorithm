# 프로그래머스 코딩 테스트 연습 
## LEVEL 1.평균 구하기
https://programmers.co.kr/learn/courses/30/lessons/12944


#### 문제
- 정수를 담고 있는 배열 arr의 평균값을 return 하는 함수, solution을 완성해보세요.

#### 제한 조건
- arr은 길이 1 이상, 100 이하인 배열입니다.
- arr의 원소는 -10,000 이상 10,000 이하인 정수입니다.

#### 예시
##### 입력 및 출력
|arr|return|
|----|----|
|[1,2,3,4]|2.5|
|[5,5]|5|



<span>*집고 넘어 갑시다!*</span></br>

나눗셈을 통해 소숫점까지 구해야 하는 경우
- int형 두 값을 통한 나눗셈으로는 소숫점을 구하지 못한다!
```java
int a=10;
int b=4;

double answer = a / 4;

System.out.println(answer); //2.0
```

방법
1. 정수값으로 지정된 하나의 값을 1.0을 곱해줌으로써 double 형 데이터로 변경
```java
int a=10;
int b=4;

double answer = ( a * 1.0 ) / 4;

System.out.println(answer); //2.5
```

2. 정수값으로 지정된 하나의 값을 강제타입 변환을 이용해 doublie 형 데이터로 변경
```java
int a=10;
int b=4;

double answer = (double)a / 4;

System.out.println(answer); //2.5
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
