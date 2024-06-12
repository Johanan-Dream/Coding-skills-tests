
//한 자리 정수로 이루어진 문자열 num_str이 주어질 때, 각 자리수의 합을 return하도록 solution 함수를 완성해주세요.

//substring 사용시 문제점: 마지막 문자 추출시 반복문 처리시 번거로움

//방법 1. String 배열로 전환 후 값 추출하여 합계
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

//방법 2. char 타입으로 처리 
//문제점 : char 타입을 int 타입으로 강제 변환시 아스키 코드값이 나오기 때문에 getNumericValue 메서드를 활용하여 합계
//getNumericValue : 해당 문자에 대응하는 십진수 숫자값을 반환, 만약 해당 문자가 숫자가 아니라면 -1 반환

class Solution {
    public int solution(String num_str) {
        int answer = 0;
        int num;
        for(char c :num_str.toCharArray()){
            num = Character.getNumericValue(c);
            if(num != -1){
                answer += num;
            }
        }
        return answer;
    }
}
