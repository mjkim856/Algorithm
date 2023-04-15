class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[2];
        for(int n:num_list) {
            answer[n%2] += 1;
        }
        return answer;
    }
}