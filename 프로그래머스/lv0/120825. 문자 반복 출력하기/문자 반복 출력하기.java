import java.util.*;

class Solution {
    public String solution(String my_string, int n) {
        StringBuffer sb = new StringBuffer();
        /*
        방법 1. 이중 for문
        for(int i = 0; i < my_string.length(); i++) {
            char c = my_string.charAt(i);
            for(int j = 0; j < n; j++) {
                sb.append(c);
            }
        }    
        */
        
        // 방법 2. toCharArray와 향상된 for문 사용
        for(char c:my_string.toCharArray()) {
            sb.append((c + "").repeat(n));
        }
        return sb.toString();
    }
}