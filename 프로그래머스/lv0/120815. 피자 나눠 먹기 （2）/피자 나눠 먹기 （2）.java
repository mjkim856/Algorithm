class Solution {
    public int solution(int n) {
        int answer = 0;
        if(n%6 != 0) {
            int gcd = getGcd(n, 6);
            answer = ((n*6)/gcd)/6;
        } else {
            answer = n/6;
        }        
        return answer;
    }
    
    public static int getGcd(int a, int b) {
        if(b == 0) return a;
        else return getGcd(b, a%b);
    }
}