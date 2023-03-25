class Solution {
    public int solution(int[] sides) {
            int max = 0;
            int sum = 0;
            int answer = 2;

            // 가장 큰 수를 max에 담는다.
            // 모든 변의 합을 sum에 담는다.
            // 만약 max가 0인 경우, 2을 리턴한다.
            // 만약 max < sum - max인 경우, 1를 리턴한다.

            for(int a:sides) {
                sum += a;
                if(a > max) max = a;
            }

            if(max == 0) {
                answer = 2;
            } else if (max < sum - max) {
                answer = 1;
            }

        return answer;
    }
}