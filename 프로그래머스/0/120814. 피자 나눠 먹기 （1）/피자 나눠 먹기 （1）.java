class Solution {
    public int solution(int n) {
        int answer = 1;
        
        if(n > 7){
            answer = n / 7;
            if(n % 7 > 0){
                answer = answer+1;
            }
        }
        return answer;
    }
}