import java.util.*;

class Solution {
    public int solution(int[] sides) {
        Arrays.sort(sides);
        return sides[2] < sides[1] + sides[0] ? 1 : 2;
    }
}

/*
처음에 푼 거 ㅋㅋㅋㅋㅋㅋㅋㅋ ... 이래서 아는 게 힘이구나

class Solution {
    public int solution(int[] sides) {
        int max = 0;
        int sum = 0;
        int answer = 2;

        // 가장 큰 수를 max에 담는다.
        // 모든 변의 합을 sum에 담는다.
        // 만약 max가 0인 경우, 1을 리턴한다.
        // 만약 max < sum - max인 경우, 2를 리턴한다.

        for(int a:sides) {
            sum += a;
            if(a > max) max = a;
        }

        if(max == 0) {
            answer = 2;
        } else if (max < sum - max) {
            answer = 1;
        }
    }
}
*/