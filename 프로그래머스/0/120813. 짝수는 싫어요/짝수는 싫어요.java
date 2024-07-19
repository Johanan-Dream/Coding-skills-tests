import java.util.*;

class Solution {
    public int[] solution(int n) {        
        ArrayList list = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            if(i%2 == 1){
                list.add(i);
            }
        }
        
        int size = list.size();
        int[] answer = new int[size];
        for(int j=0; j<size; j++){
            answer[j] =(int) list.get(j);
        }
        
        return answer;
    }
}