class Solution {
    public String solution(String cipher, int code) {
        String answer = "";
        
        /*
        String[] arr = cipher.split("");
        for(int i = 0; i < arr.length; i++) {
            if((i+1)%code == 0) answer += arr[i];
        }    
        */
        
        // 방법 2.
        // 만약 code가 4라면 실제로는 3, 7, 11, 15... 번째가 출력되어야 함에 주의하자!
        StringBuilder sb = new StringBuilder();
        int i = code;
        while(i <= cipher.length()) {
            sb.append(cipher.charAt(i-1));
            i += code;
        }    
        
        return sb.toString();
    }
}