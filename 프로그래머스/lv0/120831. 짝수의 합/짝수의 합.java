// 방법 1.
// 원래 풀던 방식대로 풀었다. 
// int i부터 매개변수 n까지를 for문을 사용해 모두 돌리되, i%2가 0인 경우를 answer에 더했다.
// if문을 사용해야 한다는 단점이 있다.

class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for (int i = 1; i <= n; i++) {
            if(i%2 == 0) {
                answer += i; 
            }
        }        
        
        return answer;
    }
}


// 방법 2. 더 효율적인 방법
// 짝수의 합을 구하기에 시작값을 2, 더해지는 값도 +=2로 주었다.
// 이 방식을 사용하면 if문을 사용할 필요가 없다.

class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for (int i = 2; i <= n; i+=2) {
            answer += i;
        }
        
        return answer;
    }
}
