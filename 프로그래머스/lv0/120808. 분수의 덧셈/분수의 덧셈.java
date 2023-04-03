import java.util.*;

class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int gcd = gcd(denom1, denom2);              // 최대공약수
        int lcm = (denom1 * denom2) / gcd;          // 최소공배수, 최종값 분모
        
        int numer3 = (numer1 * (lcm/denom1)) + (numer2 * (lcm/denom2)); // 최종값 분자        
                                                
        int gcd2 = gcd(numer3, lcm);                // 기약분수가 아닐 수 있음므로 두 수의 최대공약수를 구해준다
        int[] answer = {numer3/gcd2, lcm/gcd2} ;    // 최대공약수로 나눈 값이 최최종분모, 최최종분자이다.
        
        return answer;
    }
    
    static int gcd(int a, int b) {
        if(b == 0) return a;
        return gcd(b, a%b);
    }
}
