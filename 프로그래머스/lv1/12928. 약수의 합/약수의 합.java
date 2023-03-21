class Solution {
    public int solution(int n) {
        int answer = 0;
        int i = 1;
        
        while(i <= n/2) {
            if(n%i == 0) {
                answer += i;
            }
            i++;
        }
        
        /*
        for(int i = 1; i <= n/2; i++) {
            if(n%i == 0) {
                answer += i;
            }
        }
        */
        
        return answer + n;
    }
}