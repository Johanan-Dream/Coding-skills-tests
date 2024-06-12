class Solution {
    public int solution(String my_string, String is_suffix) {
        int answer = 0;
        // endsWith() : 접미사가 맞다면 true 아니라면 false 반환
        if(my_string.endsWith(is_suffix)){
            answer = 1;
        }else{
            answer = 0;
        }
        return answer;
    }
}