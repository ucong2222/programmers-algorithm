# 프로그래머스 코딩 테스트 연습 
## LEVEL 1.완주하지 못한 선수
https://programmers.co.kr/learn/courses/30/lessons/42576

#### 문제
- 수많은 마라톤 선수들이 마라톤에 참여하였습니다. 단 한명의 선수를 제외하고는 모든 선수가 마라톤을 완주하였습니다.
- 마라톤에 참여한 선수드르이 이름이 담긴 배열 participant와 완주한 선수들의 이름이 담긴 배열 completion이 주어질 때, 완주하지 못한 선수의 이름을 return 하도록 solution함수를 작성해주세요.

#### 제한 조건
- 마라톤 경기에 참여한 선수의 수는 1명 이상 100,000명 이하입니다.
- completion의 길이는 participant의 길이보다 1 작습니다.
- 참가자의 이름은 1개 이상 20개 이하의 알파벳 소문자로 이루어져 있습니다.
- 참가자 중에는 동명이인이 있을 수 있습니다.

#### 예시
##### 입력 및 출력
|participant|completion|return|
|----|----|----|
|["leo", "kiki", "eden"]|["eden", "kiki"]|"leo"|
|["marina", "josipa", "nikola", "vinko", "filipa"]|["josipa", "filipa", |["marina", "nikola"]|"vinko"|
|["mislav", "stanko", "mislav", "ana"]|["stanko", "ana", "mislav"]|"mislav"|

<span>*집고 넘어 갑시다!*</span></br>
#### Map의 특징
- key와 value는 한쌍으로 key는 식별하고 value에 key에 맞는 값을 넣는 식
- key는 중복이 불가능
- 동일한 key값으로 값을 넣을 시 최근에 넣은 값 적용
- key나 value는 null값이 아니다. (HashMap은 키나 값에 null 저장 가능)



- Map 주요 메소드 사용법
```java
Map<String, Integer> map = new HashMap<String, Integer>;

map.put("ucong", 20); // map 안에 값 넣기
map.put("heyho", 23); 
map.put("ucong", 25); // 동일한 key값에 다른 값넣을경우 최근 넣은 값 적용

System.out.println(map.get("ucong")); // 25 , key를 사용해 Map 안의 값 가져오기 

map.size(); // 2, 맵 크기

map.replace("hayho", 30); // key의 값 내용을 변경

map.containsKey("hayho")' // true, key가 존재하는지 확인
map.containsValue(23); // true, value가 존재하는지 확인

map.isEmpty(); // false, Map의 크기가 0인지 확인

map.remove("heyho"); // key에 해당하는 값 삭제
```

- Map 전체 출력
```java
Map<String, Integer> map = new HashMap<>();
map.put("key01",1);
map.put("key02",2);
map.put("key03",3);
map.put("key04",4);


//entrySet() : key와 value의 값 모두 필요한 경우
for( Map.Entry<Stirng, Integer> entry : map.entrySet()){
	System.out.println("key값 : " + entry.getKey() + ", value값 :" + entry.getValue() );
}

// keySet() : key의 값만 필요한 경우
for(String key : map.KeySet()){
	String value = map.get(key);
	System.out.println("key값 : " + key + ", value값 :" + value );
}
```

#### Map의 getOrDefault
- 찾는 키가 존재한다면 찾는 키의 값을 반환하고 없다면 기본 값을 반환하는 메서드
- getOrDefault(key, defaultValue);
```java
String[] str = {"a","b","c","a"};
Map<String, Integer> map = new HashMap<>();

for( String s : str ){
	map.put(s, map.getOrDefault(s,0) + 1);
}

System.out.println(map); // { a=2, b=1, c=1}
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
