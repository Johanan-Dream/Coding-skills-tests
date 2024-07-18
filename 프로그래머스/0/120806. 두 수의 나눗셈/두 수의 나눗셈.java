class Solution {
    public int solution(int num1, int num2) {
        float numf1 = num1;
		float numf2 = num2;

		float result1 = numf1 / numf2;
		float result2 = result1 * 1000;
		int answer = (int) result2;
		return answer;
    }
}