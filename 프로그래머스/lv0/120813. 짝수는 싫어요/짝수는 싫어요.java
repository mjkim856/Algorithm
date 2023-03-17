// 내가 푼 풀이
// 백준이든 프로그래머스든 import 잊지 말 것!
// 반환은 int[]로 된다.
// ArrayList<Integer> 사용 ==> Integer[] arr = alist.toArray(new Integer[alist.size()]); 를 사용했으나, 원시값으로 변경하는 법을 몰라서 (정확히는 여기서 그렇게까지 해야 하나? 싶어서) 다른 방법 찾음.
// for문 두 번 사용해서 풀었다. 하나는 홀수 담는 용도, 하나는 ArrayList 원소를 배열에 담는 용도로.
// add()! get()! size()!
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



// 다른 사람 풀이
// 애초에 반환값을 ArrayList로 준다.
// 이게 되네?
import java.util.*;

class Solution {
    public ArrayList solution(int n) {
     
        ArrayList<Integer> answer = new ArrayList<>();
        for(int i = 1; i <= n; i++) {
            // i%2가 1인 경우에만 배열에 담는다.
            if(i%2 == 1) {
                answer.add(i);
            }
        }
        
        return answer;
    }
}
