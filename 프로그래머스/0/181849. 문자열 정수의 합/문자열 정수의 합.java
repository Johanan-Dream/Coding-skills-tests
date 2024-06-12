
//한 자리 정수로 이루어진 문자열 num_str이 주어질 때, 각 자리수의 합을 return하도록 solution 함수를 완성해주세요.
class Solution {
    public int solution(String num_str) {
        int answer = 0;
        int num;
        String[] num_list = num_str.split("");
        
        for(int i=0; i< num_list.length; i++){
            num = Integer.parseInt(num_list[i]);
            answer = answer + num;
        }
        return answer;
    }
}