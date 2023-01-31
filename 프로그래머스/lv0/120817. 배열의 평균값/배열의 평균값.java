class Solution {
    public double solution(int[] numbers) {
        int length = numbers.length;
        int arrSum = 0;
        for(int i = 0; i < length; i++) {
            arrSum += numbers[i];
        }
        
        
        
        double answer = ((double)arrSum / length);
        return answer;
    }
}