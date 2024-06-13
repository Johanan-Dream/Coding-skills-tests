import java.util.*;
class Solution {
    public String[] solution(String[] names) {
        String[] answer = {};
        ArrayList<String> result = new ArrayList();
        //names를 5개씩 그룹으로 묶는다 (마지막 그룹이 5명이 아니어도 됨)
        //이 그룹에서 맨앞에 있는 사람의 이름을 담은 리스트를 출력한다.
        for(int i=0 ; i<names.length; i+=5){
            result.add(names[i]);
            answer = result.stream().toArray(String[]::new);
        }
        return answer;
    }
}