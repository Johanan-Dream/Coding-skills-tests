import java.util.*;

class Solution {
    public int[] solution(int[] array) {
        int[] answer = new int[2];
        int maxIndex = 0;

        for(int i= 0; i<array.length; i ++){
            if(array[i] > answer[0]){
                answer[0] = array[i];
                maxIndex = i;
            }
        }
        answer[1] = maxIndex;
        
        return answer;
    }
}