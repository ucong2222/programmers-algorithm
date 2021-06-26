# 프로그래머스 코딩 테스트 연습 
## LEVEL 1.서울에서 김서방 찾기
https://programmers.co.kr/learn/courses/30/lessons/12919

#### 문제
- String형 배열 seoul의 element중 "Kim"의 위치 x를 찾아, "김서방은 x에 있다"는 String을 반환하는 함수, solution을 완성하세요.
- seoul에 "Kim"은 오직 한 번만 나타나며 잘못된 값이 입력되는 경우는 없습니다.

#### 제한 조건
- seoul은 길이 1 이상, 1000 이하인 배열입니다.
- seoul의 원소는 길이 1 이상, 20 이하인 문자열입니다.
- "Kim"은 반드시 seoul 안에 포함되어 있습니다.

#### 예시
##### 입력 및 출력
|seoul|return|
|----|----|
|["Jane", "Kim"]|"김서방은 1에 있다"|



<span>*집고 넘어 갑시다!*</span></br>

##### Stirng.format을 이용한 문자열 형식 설정
- String.format()
   - 리턴되는 문장ㄹ의 형태를 지정하는 메소드
   - 서식 문자열의 앞에 %를 붙임으로써 문자열에 사용하면 그 위치에 변수의 값을 형식화 하여 대입이 가능하다.

예시
```java
int age = 25;
String result = String.format("나는 %d살 입니다.", age);

System.out.println(result); // "나는 25살 입니다."
```

1. %d(10진수 형식)
2. %s(문자열 형식)
3. %f(실수형 형식)
4. %t (날짜시간 형식)
5. %c (유니코드 문자 형식)
6. %o, %x(8진수, 16진수 형식)


<style type="text/css">
span{
	color:red;
	font-weight:bold;
}

table, td, th {
        border:0.5px solid black;
}
</style>
