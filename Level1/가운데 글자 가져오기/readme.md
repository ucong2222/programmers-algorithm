# 프로그래머스 코딩 테스트 연습 
## LEVEL 1.가운데 글자 가져오기
https://programmers.co.kr/learn/courses/30/lessons/12903

#### 문제
- 단어 s의 가운데 글자를 반환하는 함수, solution을 만들어보세요.
- 단어의 길이가 짝수라면 가운데 두글자를 반환하면 됩니다.

#### 제한 조건
- s는 길이가 1 이상, 100이하인 스트링입니다.

#### 예시
##### 입력 및 출력
|a|return|
|----|----|
|"abcde"|"c"|
|"qwer"|"we"|


<span>*집고 넘어 갑시다!*</span></br>
##### substring으로 문자열 자르기
1. String.substring(start); // 문자열 start 위치부터 끝까지 문자열 자르기
```java
String s = "안녕하세요";
String result = s.substring(2); // index 2 부터 시작

System.out.println(result); // "하세요"
```

1. String.substring(start, end); // 문자열 start 위치부터 end 전 까지 문자열 자르기
```java
String s = "안녕하세요";
String result = s.substring(2,4); // index 2 부터 시작해서 index 4 전인 index 3 까지

System.out.println(result); // "하세"
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
