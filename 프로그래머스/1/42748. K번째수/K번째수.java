
//방법1
import java.util.Arrays;
class Solution {
	public static int[] solution(int[] array, int[][] commands) {
		int[] answer = new int[commands.length];
		
		int[] test = {};// 임시로 값을 담아둘 배열

		//1번 반복문
		for(int i = 0; i < commands.length; i++){
			int start = commands[i][0];
			int end = commands[i][1];
			int choice = commands[i][2];

			test = new int[end - start + 1];
			
			//2번 반복문
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

//방법2
import java.util.Arrays;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
		for(int i = 0; i < commands.length; i++){
			int[] temp = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
			Arrays.sort(temp);
			answer[i] = temp[commands[i][2]-1];
		}
		return answer;
    }
}

//방법2가 더 빠름
