# 프로그래머스 코딩 테스트 연습 
## LEVEL 1.문자열 내 p와 y의 개수
https://programmers.co.kr/learn/courses/30/lessons/12916

#### 문제
- 대문자와 소문자가 섞여있는 문자열 s가 주어집니다.
- s에 'p'의 개수와 'y'의 개수를 비교해 같으면 True, 다르면 False를 return 하는 solution을 완성하세요.
- 'p'와 'y' 모두 하나도 없는 경우는 항상 True를 리턴합니다.
- 단, 개수를 비교할 때 대문자와 소문자는 구별하지 않습니다.

- 예를들어 s가 "pPoooyY"면 true를 return 하고 "Pyy"라면 false 를 return 합니다.

#### 제한 조건
- 문자열 s의 길이 : 50 이하의 자연수
- 문자열 s는 알파벳으로만 이루어져 있습니다.

#### 예시
##### 입력 및 출력
|n|return|
|----|----|
|"pPoooyY"	|true|
|"Pyy"	|false|



<span>*집고 넘어 갑시다!*</span></br>
1. String 문자열 대문자로 변환
```java
String str = "string";
str = str.toUpperCase();

System.out.println(str); // "STRING"
```

2. char로 받은 문자를 대문자로 변환
```java
char ch = Character.toUpperCase('c');

System.out.println(ch); // 'C'
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
