import java.util.*;

class Solution {
    public int[] solution(String[] strlist) {
        int[] answer = new int[strlist.length];

        for (int i = 0; i < strlist.length; i++) {
            String str = strlist[i];
            answer[i] = str.length();
        }
        
        
        return answer;
    }
}