import java.util.*;

class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];
        
        //0. Integer 배열로 변환
        Integer[] result = Arrays.stream(num_list).boxed().toArray(Integer[]::new);
        //1. 리스트로 변환
        List<Integer> list = Arrays.asList(result);
        //2. 거꾸로 변환
        Collections.reverse(list);
        //3. 배열로 변환
        Integer[] reverseResult = list.toArray(result);
        //4. int로 변환
        answer = Arrays.stream(reverseResult).mapToInt(Integer::intValue).toArray();
        
        return answer;
    }
}