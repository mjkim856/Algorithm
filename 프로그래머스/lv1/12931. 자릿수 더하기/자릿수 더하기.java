import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        
        // 방법 1. 나머지와 몫 사용
        while(n > 0) {
            answer += n%10;
            n = n/10;
        }

        /*
        방법 2. charAt() 사용

        String str = String.valueOf(n);
        for(int i = 0; i < str.length(); i++) {
            answer += (str.charAt(i) - 48);
        }
        */

        return answer;
    }
}