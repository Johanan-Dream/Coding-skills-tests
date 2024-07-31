import java.util.*;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        //0. 소문자 변환
        answer = my_string.toLowerCase();
        
        //1. 배열로 변환
        char[] charArray = answer.toCharArray();
        
        //2. 정렬
        Arrays.sort(charArray);
        
        //2. 다시 스트링으로 변환
        answer = String.valueOf(charArray);
        
        return answer;
    }
}