import java.util.*;

class Solution {
    public int[] solution(int n) {
     
        ArrayList<Integer> alist = new ArrayList<>();
        for(int i = 1; i <= n; i++) {
            // i%2가 1인 경우에만 배열에 담는다.
            if(i%2 == 1) {
                alist.add(i);
            }
        }
        
        int[] answer = new int[alist.size()];
        for(int i = 0; i < alist.size(); i++) {
            answer[i] = alist.get(i);
        }
        
        return answer;
    }
}
