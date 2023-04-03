class Solution {
    public int solution(int[] array) {
        
        // 출력할 값
        int answer = 0; 

        // array의 원소를 count할 걸 담을 배열
        // 왜 1001이냐면, 만약 array.length로 한다면 array 원소의 값이 array.length보다 클 경우엔 IndexOutOfBoundsException이 발생하기 때문이다.
        int[] arr = new int[1001];
        
        // 원소 갯수를 arr에 저장한다.
        for(int i = 0; i < array.length; i++) {
            arr[array[i]]++;
        }
        
        int max = 0;        // 최빈값 (정확히는 4가 3번 반복되었다면 3을 의미한다.)
        int maxIdx = 0;     // 최빈값 인덱스 (위 예시에서 4를 의미한다.)
        
        for(int i = 0; i < arr.length; i++) {
            // 만약 arr의 i번째 원소가 max보다 크다면 -> max에 arr[i]를 삽입하고, maxIdx에 i를 삽입한다.
            if(arr[i] > max) {
                max = arr[i];
                maxIdx = i;
            }
        }
        
        int cnt = 0;        // 최빈값이 중복인지 확인할 변수
        for(int i = 0; i < arr.length; i++) {
            // 만약 arr[i]와 max가 같다면 cnt++ 한다.
            if(arr[i] == max) cnt++;
        }
        
        // cnt가 1개 이상일 경우, 최빈값이 여러개이므로 -1을 return 한다. 
        if(cnt > 1) return -1;
        
        // 최빈값에 maxIdx를 넣고 출력한다.
        answer = maxIdx;
        return answer;
    }
}