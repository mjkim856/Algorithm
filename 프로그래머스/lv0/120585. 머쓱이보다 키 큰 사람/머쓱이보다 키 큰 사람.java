// 내 풀이
class Solution {
    public int solution(int[] array, int height) {
        int answer = 0;       
        for(int a : array) {
            if (a > height) {
                answer += 1;
            }
        }       
        return answer;
    }
}

// 이렇게 하면 더 간단하게 적을 수 있다!
class Solution {
    public int solution(int[] array, int height) {
        int answer = 0;
        for(int a : array) {
            if(height < a) answer++;
        }
        return answer;
    }
}
