모르겠다!!!
    
class Solution {
    public int solution(int[] array) {
        int answer = 0; 
        int[] ary = new int[1001]; //0<=array의 원소 <1000
        
        for (int i=0; i<array.length; i++){  // 원소 갯수 ary에 저장
            ary[array[i]]++;
        }
        
        int max = 0 ;  //최빈값의 갯수
        int max_index = 0 ; //최빈값 
        
        for (int i = 0; i<ary.length; i++){ //최빈값 구하기
            if(ary[i]>max){
                max = ary[i];
                max_index = i;
            }
        }
        
        int count =0;
        for (int i = 0; i<ary.length; i++){ //최빈값이 2개인지 학인
            if(ary[i] == max) count++;
        }
        
        if(count>1){            //최빈값이 2개이면-1 return 
            return answer = -1;
        }
        
        answer = max_index;
        return answer;
    }
}

-

import java.util.*;

class Solution {
    public int solution(int[] array) {
        int maxCount = 0;
        int answer = 0;

        Map<Integer, Integer> map = new HashMap<>();

        // getOrDefault : 찾는 키가 존재한다면 찾는 키의 값을 반환하고 없다면 기본 값을 반환하는 메서드
        // getPrDefault(Object key, V DefaultValue)
        // 매개변수 : 이 메서드는 두개의 매개변수를 허용
        // key : 값을 가져와야 하는 요소의 키
        // defaultValue : 지정된 키로 매핑된 값이 없는 경우 반환되어야 하는 기본값
        // 반환값 : 찾는 key가 존재하면 해당 key에 매핑되어 있는 값을 반환하고, 그렇지 않으면 디폴트 값이 반환

        for(int number : array) {
            int count = map.getOrDefault(number, 0) + 1;
            if(count > maxCount) {
                maxCount = count;
                answer = number;
            } else if(count == maxCount) {
                answer = -1;
            }
            map.put(number, count);
        }

        return answer;
    }
}
