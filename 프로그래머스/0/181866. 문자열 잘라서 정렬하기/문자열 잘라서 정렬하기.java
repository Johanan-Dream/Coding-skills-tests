import java.util.*;
class Solution {
    public String[] solution(String myString) {
        String[] answer = {};
        //1. split하기 
        answer = myString.split("x");
        //2. list로 변환하기 
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