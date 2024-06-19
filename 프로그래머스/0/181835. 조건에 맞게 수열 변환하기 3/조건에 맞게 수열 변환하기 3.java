class Solution {
    public int[] solution(int[] arr, int k) {
        //k가 홀수라면 모든 원소에 K를 곱한다.
        //k가 짝수라면 모든 원소에 K를 더한다.
        if(k%2==0){
            for(int i = 0; i<arr.length; i ++){
                arr[i] = arr[i]+k;
            }
        }else{
            for(int i = 0; i<arr.length; i ++){
                arr[i] = arr[i]*k;
            }
        }
        return arr;
    }
}