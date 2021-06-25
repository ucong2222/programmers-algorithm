# 프로그래머스 코딩 테스트 연습 
## LEVEL 1.약수의 합
https://programmers.co.kr/learn/courses/30/lessons/12922

#### 문제
- 길이가 n이고, "수박수박수박수...."와 같은 패턴을 유지하는 문자열을 리턴하는 함수, solution을 완성하세요.
- 예를들어 n이 4이면 "수박수박"을 리턴하고 3이라면 "수박수"를 리턴하면 됩니다.


#### 제한 조건
- n은 길이 10,000이하인 자연수입니다.

#### 예시
##### 입력 및 출력
|n|return|
|----|----|
|3|"수박수"|
|4|"수박수박"|



<span>*집고 넘어 갑시다!*</span></br>

##### String VS StringBuffer VS StringBuilder

1. String
- 불변의 속성을 가지기 때문에 문자열을 수정하는 시점에 새로운 String 인스턴스 생성됨
- 연산시 새로운 메모리 영역을 가리키게 변경되고 처음 선언했던 메모리 영역은 가비지로 남아있다가 가비시 컬렉션에 의해 제거된다.
- 변하지 않는 문자열을 자주 읽어들이는 경우 String 사용하면 좋은 성능 기대 가능 But 문자열 추가, 수정, 삭제 등의 연산이 빈번하게 발생하는 알고리즘에 사용하게 되면 힙 메모리에 많은 임시 가비지가 생성되어 힙메모리의 부족으로 성능에 치명적인 영향 끼칠 수 있음.

2. StringBuffer / StringBuilder
- 가변성을 가지기 때문에 동일 객체내에서 문자열 변경하는 것이 가능
- 문자열의 추가, 수정, 삭제가 빈번하게 발생할 경우 사용

3. StringBuffer VS StringBuilder
- StringBuffer
   - 동기화 키워드를 지원하여 멀티쓰레드 환경에서 안전하다.
   - String 또한 불변성 가지기 때문에 멀티쓰레드 환경에서 안정성을 가짐
- StringBuilder
   - 동기화를 지원하지 않기 때문에 멀티쓰레드 환경에서 사용하는 것은 적합하지 않다.
   - 동기화를 고려하지 않는 만큼 단일쓰레드에서 성능은 StringBuffer 보다 뛰어나다.

<style type="text/css">
span{
	color:red;
	font-weight:bold;
}

table, td, th {
        border:0.5px solid black;
}
</style>
