class Solution {
    public int solution(int slice, int n) {
        int answer = 0;
        if(slice < n){
            answer = n / slice;
            
            if(n % slice > 0){
                answer = answer+1;
            }
            
        }else{
            answer = 1;
        }
        
        return answer;
    }
}