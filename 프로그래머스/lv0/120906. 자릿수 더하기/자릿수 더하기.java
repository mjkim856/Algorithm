class Solution {
    public int solution(int n) {
        int answer = 0;
        
        /*
        String str = String.valueOf(n);
        
        for(char c:str.toCharArray()) {
           answer += (c-48);
            
        }
        */
        
        while(n > 0) {
            answer += n%10;
            n = n/10;                 }
        
        return answer;
    }
}