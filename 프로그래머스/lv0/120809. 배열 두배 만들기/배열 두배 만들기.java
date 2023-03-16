class Solution {
    public int[] solution(int[] numbers) {
        // 1. numbers.length만큼의 배열을 선언하고 초기화한다.
        // 2. for문을 돌리는데 :
        // 2-1. i의 범위는 numbers.length-1 이어야 한다. 
        //      length는 1부터 시작하지만, 배열은 0부터 시작하기 때문.
        //      ! 애초에 length를 number가 아니라 answer로 주면 해결되는 문제였다 !
        // 2-2. numbers[i]번째 값에 * 2를 하여 answer[i]번째에 넣는다.
        // 3. answer를 반환한다.
        int[] answer = new int[numbers.length];
        for(int i = 0; i <= answer.length-1; i++) {
            answer[i] = numbers[i] * 2;
        }
        return answer;
    }
}
