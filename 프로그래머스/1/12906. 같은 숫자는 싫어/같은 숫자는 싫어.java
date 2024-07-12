import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
int[] answer = {};

		Stack<Integer> stack = new Stack();
		for(int i =0 ; i < arr.length ; i ++ ){
			if(i==0){
				stack.push(arr[i]);
			}

			if(!stack.peek().equals(arr[i])){
				stack.push(arr[i]);
			}
		}

		answer = new int[stack.size()];
		int index = answer.length-1;
		for(int i = 0; i< answer.length; i ++ ){
			answer[index] = stack.pop();
			index--;
		}

		return answer;
	}
}