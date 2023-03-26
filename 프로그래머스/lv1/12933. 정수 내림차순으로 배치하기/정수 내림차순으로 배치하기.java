import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        String temp = "";

        String str = String.valueOf(n);
        String[] arr = new String[str.length()];

        for (int i = 0; i < str.length(); i++) {
            arr[i] = String.valueOf(str.charAt(i));
        }

        Arrays.sort(arr, Collections.reverseOrder());

        for(String a:arr) {
            temp += a;
        }

        answer = Long.parseLong(temp);
        return answer;
    }
}