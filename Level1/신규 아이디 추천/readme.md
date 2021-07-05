# 프로그래머스 코딩 테스트 연습 
## LEVEL 1.신규 아이디 추천
https://programmers.co.kr/learn/courses/30/lessons/72410

#### 문제설명
- 새로 가입하는 유저들이 카카오 아이디 규칙에 맞지 않는 아이디를 입력했을 때, 입력된 아이디와 유사하면서 규칙에 맞는 아이디를 추천해주는 프로그램을 개발하는 것

- 아이디의 길이는 3자 이상 15자 이하여야 합니다.
- 아이디는 알파벳 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.) 문자만 사용할 수 있습니다.
- 단, 마침표(.)는 처음과 끝에 사용할 수 없으며 또한 연속으로 사용할 수 없습니다.

- 다음과 같이 7단계의 순차적인 처리 과정을 통해 신규 유저가 입력한 아이디가 카카오 규칙에 맞는지 검사하고 규칙에 맞지 않는 경우 규칙에 맞는 새로운 아이디를 추천해주려고 합니다.
- 신규유저가 입력한 아이디가 new_id 라고 한다면,

1단계 new_id의 모든 대문자를 대응되는 소문자로 치환합니다.
2단계 new_id에서 알파벳 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.)를 제외한 모든 문자를 제거합니다.
3단계 new_id에서 마침표(.)가 2번 이상 연속된 부분을 하나의 마침표(.)로 치환합니다.
4단계 new_id에서 마침표(.)가 처음이나 끝에 위치한다면 제거합니다.
5단계 new_id가 빈 문자열이라면, new_id에 "a"를 대입합니다.
6단계 new_id의 길이가 16자 이상이면, new_id의 첫 15개의 문자를 제외한 나머지 문자들을 모두 제거합니다.
     만약 제거 후 마침표(.)가 new_id의 끝에 위치한다면 끝에 위치한 마침표(.) 문자를 제거합니다.
7단계 new_id의 길이가 2자 이하라면, new_id의 마지막 문자를 new_id의 길이가 3이 될 때까지 반복해서 끝에 붙입니다.

#### 문제
- 신규 유저가 입력한 아이디를 나타내는 new_id가 매개변수로 주어질 때, 네오가 설계한 7단계의 처리 과정을 거친 후의 추천 아이디를 return 하도록 solution 함수를 완성해 주세요.

#### 제한 조건
- new_id는 길이 1 이상 1,000 이하인 문자열입니다.
- new_id는 알파벳 대문자, 알파벳 소문자, 숫자, 특수문자로 구성되어 있습니다.
- new_id에 나타날 수 있는 특수문자는 -_.~!@#$%^&*()=+[{]}:?,<>/ 로 한정됩니다.

#### 예시
##### 입력 및 출력
|no|new_id|result|
|----|----|----|
|예1|"...!@BaT#*..y.abcdefghijklm"|"bat.y.abcdefghi"|
|예2|"z-+.^."|"z--"|
|예3|"=.="|"aaa"|
|예4|"123_.def"|"123_.def"|
|예5|"abcdefghijklmn.p"|"abcdefghijklmn"|

<span>*집고 넘어 갑시다!*</span></br>
#### StringBuilder 주요 메소드
```java
Strinbuilder sb = new StringBuilder;

sb.append("abcdefghijk"); // 문자열 추가
System.out.println(sb.toString()); // "abcdefghijk"

sb.deleteCharAt(5); // 5번째 index 값 제거 
System.out.println(sb.toString()); // "abcdeghijk"

sb.delete(4, 6); // 인덱스 4번째부터 6번째 전까지 값 제거
System.out.println(sb.toString()); // "abcdhijk";

sb.delete(5); // 인덱스 5번째부터 끝까지 값 제거
System.out.println(sb.toString()); // "abcde"
```

#### 정규표현식
- Solution 주석 참고



<style type="text/css">
span{
	color:red;
	font-weight:bold;
}

table, td, th {
        border:0.5px solid black;
}
</style>
