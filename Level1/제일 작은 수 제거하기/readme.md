# 프로그래머스 코딩 테스트 연습 
## LEVEL 1.제일 작은 수 제거하기
https://programmers.co.kr/learn/courses/30/lessons/12935


#### 문제
- 정수를 저장한 배열, arr 에서 가장 작은 수를 제거한 배열을 리턴하는 함수, solution을 완성해주세요.
- 단, 리턴하려는 배열이 빈 배열인 경우엔 배열에 -1을 채워 리턴하세요.
- 예를 들어 arr이 [4,3,2,1]인 경우는 [4,3,2]를 리턴하고, [10]면 [-1]을 리턴합니다.

#### 제한 조건
- arr은 길이 1 이상인 배열입니다.
- 인덱스 i,j에 대해 i ≠ j 이면 arr[i] ≠ arr[j] 입니다.

#### 예시
##### 입력 및 출력
|arr|return|
|----|----|
|[4,3,2,1]|[4,3,2]|
|[10]|[-1]|



<span>*집고 넘어 갑시다!*</span></br>
- 가장 작은 수가 여러개일 경우도 있어요!

#### ArrayList 알고가기!
1. ArrayList 값 추가
```java
ArrayList<Integer> list = new ArrayList<Integer>();
list.add(3); // 값 추가
list.add(null); // null값 또한 add 가능
list.add(1,10)// index1 뒤에 10 삽입
```

2. ArrayList 값 삭제
```java
ArrayList<Integer> list = new ArrayList<Integer>();
list.remove(1); // index 1 제거
list.clear(); // 모든 값 제거
```

3. ArrayList 값 가져오기
```java
ArrayList<Integer> list = new ArrayList<Integer>();
list.get(1); // index 1 값 가져오기
```

4. ArrayList 값 검색
```java
ArrayList<Integer> list = new ArrayList<Integer>();
list.contains(1); // list에 1이 있는지 검색, true or false
list.indexOf(1); // 1이 있는 index반환, 없으면 -1
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
