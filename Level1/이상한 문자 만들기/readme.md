# 프로그래머스 코딩 테스트 연습 
## LEVEL 1.이상한 문자 만들기
https://programmers.co.kr/learn/courses/30/lessons/12930

#### 문제
- 문자열 s는 한개 이상의 단어로 구성되어 있습니다.
- 각 단어는 하나 이상의 공백 문자로 구분되어 있습니다.
- 각 단어의 짝수번째 알파벳은 대문자로, 홀수번째 알파벳은 소문자로 바꾼 문자열을 리턴하는 함수, solution을 완성하세요.

#### 제한 조건
- 문자열 전체의 짝/홀수 인덱스가 아니라, 단어(공백을 기준)별로 짝/홀수 인덱스를 판단해야합니다.
- 첫 번째 글자는 0번째 인덱스로 보아 짝수번째 알파벳으로 처리해야 합니다.

#### 예시
##### 입력 및 출력
|n|return|
|----|----|
|"try hello world"|"TrY HeLlO WoRlD"|



<span>*집고 넘어 갑시다!*</span></br>
- 문자를 비교할때 == 를 사용하면 오류남! equals 사용바람!

##### String 소문자 대문자로 변환
- toUpperCase()
```java
String st = "a";

st = st.toUpperCase(); 

System.out.println(st); // "A" 
```

##### String 대문자를 소문자로 변환
- toLowerCase()
```java
String st = "A";

st = st.toLowerCase();

System.out.println(st); // "a" 
```

- char[] 의 경우 Character.toLowerCase(char); or Character.toUpperCase(char);


<style type="text/css">
span{
	color:red;
	font-weight:bold;
}

table, td, th {
        border:0.5px solid black;
}
</style>
