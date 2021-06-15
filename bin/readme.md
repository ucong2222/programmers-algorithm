# 프로그래머스 코딩 테스트 연습 
## LEVEL 1.핸드폰 번호 가리기
https://programmers.co.kr/learn/courses/30/lessons/12954


#### 문제
- 전화번호가 문자열 phone_number로 주어졌을 때, 전화번호의 뒷 4자리를 제외한 나머지 숫자를 전부 *으로 가린 문자열을 리턴하는 함수, solution을 완성해주세요.

#### 제한 조건
- s는 길이 4 이상, 20이하인 문자열입니다.

#### 예시
##### 입력 및 출력
|phone_number|return|
|----|----|
|"01033334444"|"*******4444"|
|"027778888"|"*****8888"|

<span>*집고 넘어 갑시다!*</span></br>

###### String -> char 변환
1. charAt()
```java
String input = "김유경 화이팅!"
char a = input.charAt(1);
char b = input.charAt(5);
System.out.println(a); //김
System.out.println(b); //화
```

2. toCharArray()
```java
String input="김유경 화이팅!"
char[] arrCh = input.toCharArray();

System.out.println(arrCh[6]); //이
```

###### char -> string 변환
1. valueOf()
```java
char c1 = 'a';
String str1 = String.valueOf(c1);
System.out.println(str1); // a(type:String)

char[] c2={'화','이','팅'};
String str2 = String.valueOf(c2);
System.out.ptrintln(str2); // 화이팅(type:Stirng)
```

2. toString()
```java
char c1 = 'a';
String str1 = String.toString(c1);
System.out.println(str1); // a(type:String)

* toString()의 사용시 char[] 배열은 변환이 불가능!
```

###### subString
String.substring(start) // 문자열의 start위치부터 끝까지 자르기
String.substring(start,end) // 문자열의 start위치 부터 end전까지 문자열
```java
String str = "우리모두힘내자!"

str.substring(3); // 두힘내자!
str.substring(3,6) // 두힘내
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
