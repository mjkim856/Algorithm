class Solution {
    public int solution(int[] dot) {
        long first = dot[0];
        long second = dot[1];
        int answer = 0;
        
        if(first > 0 && second > 0) {
            answer = 1;
        } else if (first < 0 && second > 0) {
            answer = 2;
        } else if (first < 0 && second < 0) {
            answer = 3;
        } else if (first > 0 && second < 0) {
            answer = 4;
        }
        
        return answer;
    }
}