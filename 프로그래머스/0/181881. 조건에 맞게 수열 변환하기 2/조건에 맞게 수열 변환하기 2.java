
import java.util.*;
class Solution {
    public static int solution(int[] arr) {
		int answer = 0;
		int[] test = new int[arr.length];
		while (true) {
			test = arr.clone();
			for (int i = 0; i < arr.length; i++) {
				if ((arr[i] >= 50) && (arr[i] % 2 == 0)) {
					arr[i] = arr[i] / 2;
				} else if (arr[i] < 50 && arr[i] % 2 != 0) {
					arr[i] = arr[i] * 2 + 1;
				}
			}

			if (Arrays.equals(test, arr)) {
				break;
			}
			answer++;
		}
		return answer;
	}
}