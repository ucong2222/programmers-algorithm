# 프로그래머스 코딩 테스트 연습 
## LEVEL 1.최대공약수와 최소공배수
https://programmers.co.kr/learn/courses/30/lessons/12940


#### 문제
- 두 수를 입력받아 두 수의 최대공약수와 최소공배수를 반환하는 함수, solution을 완성해보세요.
- 배열의 맨앞에 최대 공약수, 그다음 최소 공배수를 넣어 반환하면 됩니다.
- 예를 들어 두 수 3, 12의 최대공약수는 3, 최소 공배수는 12이므로 solution(3, 12)는 [3, 12]를 반환해야 합니다.

#### 제한 조건
- 두 수는 1이상 1000000이하의 자연수 입니다.

#### 예시
##### 입력 및 출력
|n|m|return|
|----|----|----|
|3|12|[3,12]|
|2|5|[1,10]|



<span>*집고 넘어 갑시다!*</span></br>

##### 최소공약수(GCD) 최대공약수(LMC) 구하기
###### 최소공약수 유클리드 호제법 사용해 구하기
```
A>B일때,
GCD(A,B) = GCD(B,A%B)
if A%B = 0 => GCD = B
else GCD(B,A%B)
```
###### 최대공약수
```
LCM = (A*B)/CGD
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
