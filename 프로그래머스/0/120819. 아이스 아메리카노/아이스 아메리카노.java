class Solution {
    public int[] solution(int money) {
        int am = 5500;
        int[] answer = new int[2];
        
        answer[0] = money / am;
        answer[1] = money % am;
        return answer;
    }
}