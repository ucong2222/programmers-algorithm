# 프로그래머스 코딩 테스트 연습 
## LEVEL 1.정수 내림차순으로 배치하기
https://programmers.co.kr/learn/courses/30/lessons/12933


#### 문제
- 함수 solution은 정수 n을 매개변수로 입력받습니다.
- n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴해주세요.
- 예를들어 n이 118372면 873211을 리턴하면 됩니다.

#### 제한 조건
- n은 1이상, 8000000000 이하인 양의 정수입니다.

#### 예시
##### 입력 및 출력
|n|return|
|----|----|
|118372|873211|



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
