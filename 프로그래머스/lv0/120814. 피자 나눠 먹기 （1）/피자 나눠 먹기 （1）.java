// 풀이 1 (내 방법)
// 사람이 7의 배수라면 몫만큼의 피자가 필요하고, 7의 배수가 아니라면 몫+1개의 피자가 필요하다.
class Solution {
    public int solution(int n) {
        int answer = 0;
        if (n%7 == 0) {
            answer = n/7;
        } else {
            answer = n/7 + 1;
        }
        return answer;
    }
}


// 풀이 2
// 위의 방법을 삼항연산자로 표현했다.
class Solution {
    public int solution(int n) {
        int answer = (n%7 == 0 ? n/7 : n/7+1);
        return answer;
    }
}


// 풀이 3
// 세상은 넓고 천재는 많다
class Solution {
    public int solution(int n) {
        return (n + 6) / 7;
    }
}
