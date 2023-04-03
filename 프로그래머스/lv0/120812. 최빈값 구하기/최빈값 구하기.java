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
 