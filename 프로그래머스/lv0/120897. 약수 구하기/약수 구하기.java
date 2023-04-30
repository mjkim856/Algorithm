import java.util.*;
class Solution {
    public int[] solution(int n) {
        /*
        방법 1. 배열 길이를 cnt로 구한 뒤, cnt 길이를 가진 배열을 만들고 그 안에 약수를 넣었다.
        
        int cnt = 0;      
        int idx = 0;

        for(int i = 1; i <= n; i++) {
            if(n % i == 0) {
                cnt++;
            }
        }

        int[] answer = new int[cnt];

        for(int i = 1; i <= n; i++) {
            if(n % i == 0) {
                answer[idx++] = i;
            }
        }
        return answer;   
        */
        
        // 방법 2. ArrayList() 에 넣고 Array로 변경하기
        // stream().mapToInt(x -> x).toArray() 를 사용함!
        List<Integer> al = new ArrayList<>();
        for(int i = 1; i <= n; i++) {
            if(n % i == 0) {
                al.add(i);
            }
        }        
        
        return al.stream()
            .mapToInt(x -> x)
            .toArray();  
    }
}
