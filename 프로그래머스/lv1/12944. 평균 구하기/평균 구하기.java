class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        double sum = 0;

        for(int a:arr) {
            sum += a;
        }
        
        return sum/arr.length;
    }
}