# 프로그래머스 코딩 테스트 연습 
## LEVEL 1.약수의 합
https://programmers.co.kr/learn/courses/30/lessons/12926

#### 문제
- 어떤 문장의 각 알파벳을 일정한 거리만큼 밀어서 다른 알파벳으로 바꾸는 암호화 방식을 시저암호라고 합니다.
- 예를 들어 "AB"는 1만큼 밀면 "BC"가 되고, 3만큼 밀면 "DE"가 됩니다. "z"는 1만큼 밀면 "a"가 됩니다. 
- 문자열 s와 거리 n을 입력받아 s를 n만큼 민 암호문을 만드는 함수, solution을 완성해 보세요.


#### 제한 조건
- 공백은 아무리 밀어도 공백입니다.
- s는 알파벳 소문자, 대문자, 공백으로만 이루어져 있습니다.
- s의 길이는 8000이하입니다.
- n은 1 이상, 25이하인 자연수입니다.

#### 예시
##### 입력 및 출력
|s|n|return|
|----|----|----|
|"AB"|1|"BC"|
|"z"|1|"a"|
|"a B z"|4|"e F d"|


<span>*집고 넘어 갑시다!*</span></br>
- 'char'의 자료형은 아스키 코드의 형태를 나타낼 수 있다. 

1. 공백
```java
char c = 32 ;
System.out.println(c); // ' ' = 공백
```

2. a-z(97-122)
```java
char c1 = 97 ;
char c2 = 122 ;

System.out.println(c1); // 'a'
System.out.println(c2); // 'z' 
```

3. A-Z (65-90)
```java
char c1 = 65 ;
char c2 = 90;

System.out.println(c1); // 'A'
System.out.println(c2); // 'Z'
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
