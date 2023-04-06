import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer;
        if(arr.length == 1) {
            answer = new int[]{-1};
        } else {
            int min = Integer.MAX_VALUE;
            for(int i = 0; i < arr.length; i++) {
                if(arr[i] < min) {
                    min = arr[i];
                }
            }
            
            answer = new int[arr.length - 1];
            int cnt = 0;
            for(int i = 0; i < arr.length; i++) {
                if(arr[i] != min) {
                    answer[cnt++] = arr[i];
                }
            }  
        }
        return answer;
    }
}