class Solution {
    public int[] solution(int[] array) {
        int[] answer = {-1, -1};
        
        for(int i = 0; i < array.length; i++) {
            if(answer[0] < array[i]) {
                answer[0] = array[i];
                answer[1] = i;
            }
        }    
        return answer;
    }
}