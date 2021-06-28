# 프로그래머스 코딩 테스트 연습 
## LEVEL 1.나누어 떨어지는 숫자 배열
https://programmers.co.kr/learn/courses/30/lessons/12910

#### 문제
- array의 값 element 중 divisor로 나누어 떨어지는 값을 오름차순으로 정렬한 배열을 반환하는 함수, solution을 작성해주세요.
- divisor로 나누어 떨어지는 element가 하나도 없다면 배열에 -1을 담아 반환하세요.

#### 제한 조건
- arr은 자연수를 담은 배열입니다.
- 정수 i, j에 대해 i ≠ j 이면 arr[i] ≠ arr[j] 입니다.
- divisor는 자연수입니다.
- array는 길이 1 이상인 배열입니다.

#### 예시
##### 입력 및 출력
|arr|divisor|return|
|----|----|----|
|[5, 9, 7, 10]|5|[5,10]|
|[2, 36, 1,3]|1|[1,2,3,36]|
|[3,2,6]|10|[-1]|


<span>*집고 넘어 갑시다!*</span></br>

##### List 오름차순/내림차순
- List 오름차순
```java
Collections.sort(list);
```

- List 내림차순
```java
Collections.sort(list, Collections.reverseOrder());
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
