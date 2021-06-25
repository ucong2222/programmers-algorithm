# 프로그래머스 코딩 테스트 연습 
## LEVEL 1.약수의 합
https://programmers.co.kr/learn/courses/30/lessons/12925

#### 문제
- 문자열 s를 숫자로 변환한 결과를 반환하는 함수, solution을 완성하세요.


#### 제한 조건
- s의 길이는 1 이상 5이하입니다.
- s의 맨앞에는 부호(+, -)가 올 수 있습니다.
- s는 부호와 숫자로만 이루어져있습니다.
- s는 "0"으로 시작하지 않습니다.

#### 예시
##### 입력 및 출력
|str|return|
|----|----|
|"1234"|1234|
|"-1234"|-1234|



<span>*집고 넘어 갑시다!*</span></br>
- 문자 0의 아스키코드 48

1. char('0' ~ '9')을 int형으로 변환
```java
char c1 = '0';
char c2 = '9';

int n1 = c1-48;
int n2 = c2-'0';

System.out.println(n1); // 0 (int형)
System.out.println(n2); // 9 (int형)
```

##### String으로 저장되노 문자열 중에서 한글자만 선택해 char타입으로 변환시키기
1. charAt(index)
```java
String st = "string";
char ch = st.charAt(0);

System.out.println(ch); // 's'
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
