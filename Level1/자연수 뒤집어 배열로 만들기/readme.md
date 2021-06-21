# 프로그래머스 코딩 테스트 연습 
## LEVEL 1.자연수 뒤집어 배열로 만들기
https://programmers.co.kr/learn/courses/30/lessons/12932


#### 문제
- 자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요.
- 예를들어 n이 12345이면 [5,4,3,2,1]을 리턴합니다.

#### 제한 조건
- n은 10,000,000,000 이하인 자연수입니다.

#### 예시
##### 입력 및 출력
|n|return|
|----|----|
|12345|[5,4,3,2,1]|



<span>*집고 넘어 갑시다!*</span></br>

##### list 오름차순
- Collections.sort(list);
```java
List<Integer> list = new ArrayList<>();
num.add(4);
num.add(7);
num.add(1);

Collections.sort(list); // 배열의 경우 Arrays.sort(array);

for(int i=0; i<list.size(); i++){
	System.out.println(list.get(i));  // 1 4 7
}
```

###### Long -> String 변환
1. Long.toString()
```java
long num = 12345;
String str = Long.toString(num);

System.out.println(str); // 12345 (type:String)
```

######  String -> long변환
1. Long.parseLong()
```java
String str = "12345";
long num = Long.parseLong(str);

System.out.println(num); // 12345 (type:long)
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
