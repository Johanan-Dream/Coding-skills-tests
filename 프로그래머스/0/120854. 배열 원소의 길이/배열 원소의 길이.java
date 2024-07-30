class Solution {
    public int[] solution(String[] strlist) {
        int[] answer = new int[strlist.length];
        
        for(int i = 0 ; i<strlist.length; i++){
            String value = strlist[i];
            answer[i] = value.length();
        }
        return answer;
    }
}