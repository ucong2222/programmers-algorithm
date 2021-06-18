# 프로그래머스 코딩 테스트 연습 
## LEVEL 1.정수 제곱근 판별
https://programmers.co.kr/learn/courses/30/lessons/12934


#### 문제
- 임의의 양의 정수 n에 대해, n이 어떤 양의 정수 x의 제곱인지 아닌지 판단하려 합니다.
- n이 양의 정수 x의 제곱이라면 x+1의 제곱을 리턴하고, n의 양수 정수 x의 제곱이 아니라면 -1을 리턴하는 함수를 완성하세요.

#### 제한 조건
- n은 1이상, 50000000000000 이하인 양의 정수입니다.

#### 예시
##### 입력 및 출력
|n|return|
|----|----|
|121|144|
|3|-1|



<span>*집고 넘어 갑시다!*</span></br>

##### Math 클래스 사용
- Math 클래스 사용시 값이 double 형으로 반환된다는것 잊지마세요!
1. 제곱근 구하기
- Math.sqrt(제곱근 구할 값);
```java
int n = 144;
double sqrt = Math.sqrt(n); // double로 반환되기 때문에 int로 받을 시 오류

System.out.println(sqrt); // 12.0
```

2. 제곱 구하기
- Math.pow(밑, 지수);
```java
int n = 2;
int m = 4;
double pow = Math.pow(n,m);

System.out.println(pow); // 16.0
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
