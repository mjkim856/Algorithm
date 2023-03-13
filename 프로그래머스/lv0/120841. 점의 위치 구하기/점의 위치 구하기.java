// 내 풀이
// 굳이 변수에 담을 필요 없다. 
class Solution {
    public int solution(int[] dot) {
        long first = dot[0];
        long second = dot[1];
        int answer = 0;
        
        if(first > 0 && second > 0) {
            answer = 1;
        } else if (first < 0 && second > 0) {
            answer = 2;
        } else if (first < 0 && second < 0) {
            answer = 3;
        } else if (first > 0 && second < 0) {
            answer = 4;
        }
        
        return answer;
    }
}

// 추천 최상위 풀이
// [0]이 0보다 클 때 [1]도 0보다 크다면 1, 아니라면 4
// 그게 아니라면 ([0]이 0보다 작을 때) [1]이 0보다 크다면 2, 아니라면 3
// 생각도 못 했는데, 문제를 잘 파악한다는 건 이런 뜻인가! 라는 생각을 했다.
class Solution {
    public int solution(int[] dot) {
        int answer = 0;
        if(dot[0] > 0) 
            if(dot[1] > 0) answer = 1;
            else answer = 4;
        else 
            if(dot[1] > 0) answer = 2;
            else answer = 3;


        return answer;
    }
}
