# 프로그래머스 코딩 테스트 연습 
## LEVEL 1.자릿수 더하기
https://programmers.co.kr/learn/courses/30/lessons/12931


#### 문제
- 자연수 N이 주어지면, N의 각 자릿수의 합을 구해서 return 하는 solution 함수를 만들어 주세요.
- 예를들어 N = 123이면 1+2+3 = 6을 return 하면 됩니다.

#### 제한 조건
- N의 범위 : 100,000,000 이하의 자연수

#### 예시
##### 입력 및 출력
|n|return|
|----|----|
|123|6|
|987|24|



<span>*집고 넘어 갑시다!*</span></br>

##### int를 String으로 변환
- "" 를 더해줌으로써 변환
```java
int n = 1;
String num = n + "" ;

System.out.println(num); // "1" 
```

##### String을 int로 변환
- Integer.parseInt 사용
```java
String num = "1" ;
int n = Integer.parseInt(num);

System.out.println(n); // 1 
```

##### char[] 을 String으로 변환
- Character.toString(char) 사용
```java
char[] ch = {'안','녕'};
String st = Chracter.toString(ch);

System.out.println(st); // "안녕" 
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
