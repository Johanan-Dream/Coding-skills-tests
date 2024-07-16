import java.util.Arrays;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        		int[] answer = new int[commands.length];

		int[] test = {};
		for(int i = 0; i < commands.length; i++){
			int start = commands[i][0];
			int end = commands[i][1];
			int choice = commands[i][2];

			test = new int[end - start + 1];
			int x = 0;
			for(int j = start; j <= end; j++){
				//꺼내기
				test[x] = array[j-1];
				x++;
			}
			//정렬하기
			test = Arrays.stream(test).sorted().toArray();
			int a = test[choice-1];
			answer[i] = a;
		}
		return answer;
    }
}