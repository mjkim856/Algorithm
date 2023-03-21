class Solution {
    public boolean solution(int x) {
        boolean answer = false;
        int sum = 0;
        int temp = x;
        
        while(temp > 0) {
            sum += temp%10;
            temp = temp/10;
        }

        if(x%sum == 0) {
            answer = true;
        }
        
        return answer;
    }
}