# 프로그래머스 코딩 테스트 연습 
## LEVEL 1.폰켓몬
https://programmers.co.kr/learn/courses/30/lessons/1845

#### 문제
- 당신은 폰켓몬을 잡기 위한 오랜 여행 끝에, 홍 박사님의 연구실에 도착했습니다. 홍 박사님은 당신에게 자신의 연구실에 있는 총 N 마리의 폰켓몬 중에서 N/2마리를 가져가도 좋다고 했습니다.
- 홍 박사님 연구실의 폰켓몬은 종류에 따라 번호를 붙여 구분합니다. 따라서 같은 종류의 폰켓몬은 같은 번호를 가지고 있습니다.
- 예를들어 연구실에 총 4마리에 폰켓몬이 있다고 할때, 각 폰켓몬의 종류 번호가 [3번, 1번, 2번, 3번] 이라면 이는 3번 폰켓몬 두마리, 1번 폰켓몬 한마리, 2번 폰켓몬 한마리가 있음을 나타냅니다.
- 이때 4마리의 폰켓몬 중 2마리를 고르는 방법은 다음과 같이 6가지가 있습니다.

1. 첫 번째(3번), 두 번째(1번) 폰켓몬을 선택
2. 첫 번째(3번), 세 번째(2번) 폰켓몬을 선택
3. 첫 번째(3번), 네 번째(3번) 폰켓몬을 선택
4. 두 번째(1번), 세 번째(2번) 폰켓몬을 선택
5. 두 번째(1번), 네 번째(3번) 폰켓몬을 선택
6. 세 번째(2번), 네 번째(3번) 폰켓몬을 선택

- 위 예시에서 가질수 있는 폰켓몬 종류 수 최댓값은 2가 됩니다.
- 당신은 최대한 다양한 종류의 폰켓몬을 가지길 원하기 때문에, 최대한 많은 종류의 폰켓몬을 포함해서 N/2마리를 선택하려고 합니다.

- N마리 폰켓몬의 종류 번호가 담긴 배열 nums가 매개변수로 주어질 때, N/2마리의 폰켓몬을 선택하는 방법 중, 가장 많은 종류의 폰켓몬을 선택하는 방법을 찾아, 그 때의 폰켓몬 종류 번호의 개수를 return 하도록 solution 함수를 완성해주세요.

#### 제한 조건
- nums는 폰켓몬의 종류 번호가 담긴 1차원 배열입니다.
- nums의 길이(N)는 1 이상 10,000 이하의 자연수이며, 항상 짝수로 주어집니다.
- 폰켓몬의 종류 번호는 1 이상 200,000 이하의 자연수로 나타냅니다.
- 가장 많은 종류의 폰켓몬을 선택하는 방법이 여러 가지인 경우에도, 선택할 수 있는 폰켓몬 종류 - 개수의 최댓값 하나만 return 하면 됩니다.

#### 예시
##### 입력 및 출력
|nums|result|
|----|----|
|[3,1,2,3]|2|
|[3,3,3,2,2,4]|3|
|[3,3,3,2,2,2]|2|


<span>*집고 넘어 갑시다!*</span></br>
- HashSet > 배열 > 리스트 순으로 빠르다.

1. HashSet이란?
- Set 인터페이스의 구현 클래스
- 객체를 중복해서 저장할 수 없고 하나의 null 값만 저장할 수 있다.
- 저장 순서가 유지되지 않는다. (저장순서 유지하고 싶으면 LinkedHashSet 클래스 사용)
- 자동 정렬을 해주지 않는다. (자동정렬 하고 싶으면 TreeSet 클래스 사용)

2. HashSet 사용법 예시
```java
HashSet<Integer> set1 = new HashSet<Integer>(); // HashSet 생성
HashSet<Integer> set2 = new HashSet<>(); // new에서 타입 피라미터 생략 가능
HashSet<Integer> set3 = new HashSet<Integer>(set1); // set1의 모든 값을 가진 HashSet 생성
HashSet<Integer> set1 = new HashSet<Integer>(10); // 초기 용량(capacity) 지정
HashSet<Integer> set1 = new HashSet<Integer>(10, 0.7f); // 초기 capacity, load factor 지정
HashSet<Integer> set1 = new HashSet<Integer>(Arrays.asList(1,2,3)); // 초기값 지정
```

3. HashSet 값 추가
```java
HashSet<Integer> set = new HashSet<Integer>(); // HashSet 생성

set.add(1);
set.add(2);
set.add(2); // 중복된 값이므로 저장되지 않는다.
set.add(3);

System.out.println(set); // [1,2,3]
```

3. HashSet 값 삭제
```java
HashSet<Integer> set = new HashSet<Integer>(Arrays.asList(1,2,3)); // HashSet 생성

set.remove(1); // 1인 값 제거
System.out.println(set); // [2,3]

set.clear(); // 모든 값 제거
System.out.println(set); // []
```

4. HashSet 크기 구하기
```java
HashSet<Integer> set = new HashSet<Integer>(Arrays.asList(1,2,3));// HashSet 생성

System.out.println(set.size()); //set 크기 : 3
```

5. HashSet 값 출력
- 인덱스로 객체를 가져오는 get 메소드가 없음
- 대신 전체 객체를 대상으로 한 번씩 반복해서 가져오는 반복자(Iterator)를 제공
```java
HashSet<Integer> set = new HashSet<Integer>(Arrays.asList(1,2,3)); // HashSet 생성

Iterator iter = set.iterator(); // Iterator 사용

while(iter.hasNext()) { // 값이 있으면 True , 없으면 False
    System.out.println(iter.next());
}

// 출력
1
2
3
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
