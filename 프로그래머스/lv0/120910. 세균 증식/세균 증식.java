class Solution {
    public int solution(int n, int t) {
       
        /*
        방법 1.
        int answer = n;
        
        for(int i = 1; i <= t; i++) {
            answer = answer*2;
        }
        
        return answer;
        */
        
        // 방법 2
        for(int i = 0; i < t; i++) {
            n *= 2;
        }
        
        return n;
    }
}