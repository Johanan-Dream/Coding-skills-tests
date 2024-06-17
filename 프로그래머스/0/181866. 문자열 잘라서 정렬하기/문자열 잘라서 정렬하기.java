import java.util.*;
//Stream 방식 : 너무 오래 걸림
//테스트 1 〉	통과 (38.43ms, 87.7MB)
//테스트 2 〉	통과 (25.03ms, 83.4MB)
//테스트 3 〉	통과 (10.38ms, 79MB)
//테스트 4 〉	통과 (13.49ms, 78.3MB)
//테스트 5 〉	통과 (15.23ms, 89.3MB)
//테스트 6 〉	통과 (26.05ms, 79.4MB)
//테스트 7 〉	통과 (20.17ms, 82.2MB)
//테스트 8 〉	통과 (31.63ms, 84.5MB)
//테스트 9 〉	통과 (23.49ms, 81.8MB)
//테스트 10 〉	통과 (30.14ms, 94MB)
//테스트 11 〉	통과 (25.67ms, 79.2MB)
class Solution {
    public String[] solution(String myString) {
        String[] answer = {};
        //1. split하기 
        answer = myString.split("x");
        //2. 배열을 문자열로 변환
        Arrays.toString(answer);
        //3. 특정값 제거 
        //4. 다시 배열로 변환
        answer = Arrays.stream(answer)
                .filter(str -> !str.equals(""))
                .sorted()
                .toArray(String[]::new);

        return answer;
    }
}

//배열 -> 리스트, 리스트 -> 배열
//테스트 1 〉	통과 (25.86ms, 96.5MB)
//테스트 2 〉	통과 (21.79ms, 88.9MB)
//테스트 3 〉	통과 (9.19ms, 80.4MB)
//테스트 4 〉	통과 (6.18ms, 75.5MB)
//테스트 5 〉	통과 (17.29ms, 84.8MB)
//테스트 6 〉	통과 (11.49ms, 74.3MB)
//테스트 7 〉	통과 (13.22ms, 89.3MB)
//테스트 8 〉	통과 (25.32ms, 99.8MB)
//테스트 9 〉	통과 (15.72ms, 88.6MB)
//테스트 10 〉	통과 (24.34ms, 86.9MB)
//테스트 11 〉	통과 (15.64ms, 92.2MB)
import java.util.*;
class Solution {
    public String[] solution(String myString) {
        String[] answer = {};
        //1. split하기 
        answer = myString.split("x");
        //2. list로 변환하기 
        List<String> strList = new ArrayList<String>(Arrays.asList(answer));
        //3. 공백 제거 & 정렬
        strList.removeAll(Arrays.asList("", null));
        Collections.sort(strList);
        
        //4. 다시 배열로 변환
        answer = strList.toArray(String[]::new);
        return answer;
    }
}

