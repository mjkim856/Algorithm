class Solution {
    public int solution(int n) {
        /*
        방법 1
        for(int i = 1; i < n; i++) {
            if(i*i == n) return 1;
        }    
        
        return 2;
        */
        
        // 방법 2
        // Math의 .sqrt()를 사용한다.
       System.out.println(Math.sqrt(25) % 1); // 0.0
        System.out.println(Math.sqrt(20) % 1); // 0.4721354...
        
       return (Math.sqrt(n) % 1 == 0) ? 1 : 2;
    }
}