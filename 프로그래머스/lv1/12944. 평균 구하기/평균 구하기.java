class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        double sum = 0;

        if(arr.length == 0 || arr == null) {
            answer = 0;
        } else {
            for(int a:arr) {
                sum += a;
            }
        }
        
        return sum/arr.length;
    }
}