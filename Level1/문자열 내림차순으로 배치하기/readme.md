# 프로그래머스 코딩 테스트 연습 
## LEVEL 1.문자열 내림차순으로 배치하기
https://programmers.co.kr/learn/courses/30/lessons/12917

#### 문제
- 문자열 s에 나타나는 문자를 큰것부터 작은 순으로 정렬해 새로운 문자열을 리턴하는 함수, solution을 완성해주세요.
- s는 영문 대소문자로만 구성되어 있으며, 대문자는 소문자보다 작은 것으로 간주합니다.

#### 제한 조건
- str은 길이 1 이상인 문자열입니다.

#### 예시
##### 입력 및 출력
|n|return|
|----|----|
|"Zbcdefg"|"gfedcbZ"|



<span>*집고 넘어 갑시다!*</span></br>
1. 문자열 오름차순
```java
String s = "string";
char[] ch = s.toCharArray();

Arrays.sort(ch);

System.out.println(ch); // "ginrst"
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
