# 프로그래머스 코딩 테스트 연습 
## LEVEL 1.문자열 내 마음대로 정렬하기
https://programmers.co.kr/learn/courses/30/lessons/12915

#### 문제
- 문자열로 구성된 리스트 strings와, 정수 n이 주어졌을 때, 각 문자열의 인덱스 n번째 글자를 기준으로 오름차순 정렬하려 합니다.
- 예를들어 strings가 ["sun","bed","car"]이고 n이 1이면 각 단어의 인덱스 1의 문자 "u","e","a"로 strings를 정렬합니다.

#### 제한 조건
- strings는 길이 1 이상, 50이하인 배열입니다.
- strings의 원소는 소문자 알파벳으로 이루어져 있습니다.
- strings의 원소는 길이 1 이상, 100이하인 문자열입니다.
- 모든 strings의 원소의 길이는 n보다 큽니다.
- 인덱스 1의 문자가 같은 문자열이 여럿 일 경우, 사전순으로 앞선 문자열이 앞쪽에 위치합니다.

#### 예시
##### 입력 및 출력
|strings|n|return|
|----|----|----|
|["sun", "bed", "car"]|1|["car", "bed", "sun"]|
|["abce", "abcd", "cdx"]|2|["abcd", "abce", "cdx"]|


<span>*집고 넘어 갑시다!*</span></br>

##### compareTo으로 문자열 비교하기
- 기준값.compareTo(비교대상)
1. 비교대상에 기준값 문자열이 포함되어있을 경우
- 기준값에 비교대상 포함되어있을 경우 서로의 문자열 길이의 차이값을 리턴해준다.
- 비교가 불가능한 지점의 각 문자열의 아스키값을 기준으로 비교를 해준다. ( 아스키코드의 값의 차이값 리턴)
```java
String str = "abcd";

System.out.println( str.compareTo("abcd") );  // 0 (같은 경우는 숫자나 문자나 0을 리턴)
System.out.println( str.compareTo("ab") );  //  2
System.out.println( str.compareTo("a") );  //  3
System.out.println( str.compareTo("c") );  //  -2      
System.out.println( str.compareTo("") );  //  4 
System.out.println( "".compareTo(str) );  //  -4
```

2. 비교대상과 전혀 다른 문자열일 경우
```java
String str = "abcd";

System.out.println( str.compareTo("zefd") );  //  -25
System.out.println( str.compareTo("zEFd") );  //  -25
System.out.println( str.compareTo("ABCD") );  //  32
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
