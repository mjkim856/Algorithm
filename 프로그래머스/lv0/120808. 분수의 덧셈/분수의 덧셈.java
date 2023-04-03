import java.util.*;

class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int gcd = gcd(denom1, denom2);          // 최대공약수
        int lcm = (denom1 * denom2) / gcd;      // 최소공배수
        
        int numer3 = (numer1 * (lcm/denom1)) + (numer2 * (lcm/denom2));
        int denom3 = lcm;           
                                                
        int gcd2 = gcd(numer3, denom3);          // 최대공약수                                         
 
        int[] answer = {numer3/gcd2, lcm/gcd2} ;
        
        return answer;
    }
    
    static int gcd(int a, int b) {
        if(b == 0) {
            return a;
        }
        return gcd(b, a%b);
    }
}