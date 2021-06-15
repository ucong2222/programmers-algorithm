# 프로그래머스 코딩 테스트 연습 
## LEVEL 1.하샤드 수
https://programmers.co.kr/learn/courses/30/lessons/12947


#### 문제
- 양의 정수 x가 하샤드 수이려면 x의 자릿수의 합으로 x가 나누어져야 합니다.
- 예를 들어 18의 자릿수 합은 1+8=9, 이고 18은 9로 나누어 떨어지므로 18은 하샤드 수입니다.
- 자연수 x를 입력받아 x가 하샤드 수인지 아닌지 검사하는 함수, solution을 완성해주세요.

#### 제한 조건
- x는 1 이상, 10000 이하인 정수입니다.

#### 예시
##### 입력 및 출력
|arr|return|
|----|----|
|10|true|
|12|true|
|11|fales|
|13|fales|


<span>*집고 넘어 갑시다!*</span></br>

###### int -> string[] 담기
1. string으로 변환 후 split 통해 쪼개기
```java
int a = 12345;
String[] str = String.valueOf(x).split("");

System.out.println(str[0]); // 1
```

<span>string->int 형으로 변환</span>
```java
String str = "1";
int a = Integer.parseInt(str);

System.out.println(a); // 1(type:int)
```

###### int -> char[] 담기
1. string으로 변환 후 charArray
```java
int a = 12345;
cahr[] ch = String.valueOf(x).toCharArray();

System.out.println(ch[0]); // 1
```

<span>char->int 형으로 변환</span>
```java
char ch = '1';
int a = (int)ch - 48 ; // 아스키 코드 이용해 바꿔주기

System.out.println(a); // 1(type:int)
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
